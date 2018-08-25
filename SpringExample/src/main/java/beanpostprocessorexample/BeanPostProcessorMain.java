package beanpostprocessorexample;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import beanpostprocessorexample.Student;

public class BeanPostProcessorMain {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext=new ClassPathXmlApplicationContext("BeanPostPorcessor.xml");
		System.out.println("in main");
		Student std=(Student)applicationContext.getBean("student");
		Teacher teacher=(Teacher)applicationContext.getBean("teacher");
		std.getDetails();
		applicationContext.registerShutdownHook();
		std.getDetails();
	}

}
