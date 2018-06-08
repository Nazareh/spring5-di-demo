package guru.springframework.config;

import guru.springframework.examplebeans.FakeDataSource;
import guru.springframework.examplebeans.FakeJsmBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jsm.properties")
})
public class PropertyConfig {

    @Value("${username}")
    String username;

    @Value("${password}")
    String password;

    @Value("${dburl}")
    String dbUrl;

    @Value("${jsm.username}")
    String jsmUsername;

    @Value("${jsm.password}")
    String jsmPassword;

    @Value("${jsm.url}")
    String jsmUrl;

    @Autowired
    Environment environment;

    @Bean
    public FakeDataSource fakeDataSource(){
     FakeDataSource fakeDataSource = new FakeDataSource();
     fakeDataSource.setUsername(environment.getProperty("USERNAME"));
     fakeDataSource.setPassword(password);
     fakeDataSource.setDburl(dbUrl);

     return fakeDataSource;
    }

    @Bean public FakeJsmBroker fakeJsmBroker (){
        FakeJsmBroker fakeJsmBroker = new FakeJsmBroker();
        fakeJsmBroker.setUsername(jsmUsername);
        fakeJsmBroker.setPassword(jsmPassword);
        fakeJsmBroker.setUrl(jsmUrl);
        return fakeJsmBroker;

    }
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;

    }
}
