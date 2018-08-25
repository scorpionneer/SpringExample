package springscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PrototypeExample {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("Prototype.xml");
		Student std=(Student)applicationContext.getBean("student");
		Student std2=(Student)applicationContext.getBean("student");
		System.out.println("Object values  before changing the name");
		System.out.println("std:");
		std.getDetails();
		System.out.println("std2:");
		std2.getDetails();
		System.out.println("std is equal to std2:"+std.equals(std2));
		std2.setName("Aryan");
		System.out.println("Object values after changing the name");
		System.out.println("std2:");
		std2.getDetails();
		System.out.println("std:");
		std.getDetails();
		System.out.println("std is equal to std2:"+std.equals(std2));
	}
}
