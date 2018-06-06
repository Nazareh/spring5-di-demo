package guru.springframework;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.MyController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext applicationContext =  SpringApplication.run(DiDemoApplication.class, args);
		MyController controller = (MyController) applicationContext.getBean("myController");

		System.out.println(controller.sayHello());
		System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
		System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());


	}
}
