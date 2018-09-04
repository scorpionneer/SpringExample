package autowireexample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutowireMain {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("AutowireExample.xml");
		System.out.println("in main");
		Student std=(Student)applicationContext.getBean("student");
		std.getDetails();
	}

}
