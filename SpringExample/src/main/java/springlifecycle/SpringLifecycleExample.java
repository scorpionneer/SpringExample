package springlifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springlifecycle.Student;

public class SpringLifecycleExample {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("Lifecycle.xml");
		System.out.println("in main");
		Student std=(Student)applicationContext.getBean("student");
		std.getDetails();
		applicationContext.registerShutdownHook();
		std.getDetails();
		
	}

}
