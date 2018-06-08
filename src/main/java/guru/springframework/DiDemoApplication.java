package guru.springframework;

import guru.springframework.controllers.MyController;
import guru.springframework.examplebeans.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) applicationContext.getBean("myController");
        FakeDataSource fakeDataSource = (FakeDataSource) applicationContext.getBean(FakeDataSource.class);

        System.out.println(fakeDataSource.getUsername());
        System.out.println(fakeDataSource.getPassword());
        System.out.println(fakeDataSource.getDburl());


	}
}
