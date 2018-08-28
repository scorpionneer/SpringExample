package constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructorInjectionTest {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ConstructorInjection.xml");
		Student student=(Student)applicationContext.getBean("student");
		Student student1=(Student)applicationContext.getBean("student1");
		Student student2=(Student)applicationContext.getBean("student2");
		Student student3=(Student)applicationContext.getBean("student3");
		
		System.out.println("student:"+student.getDetails());
		System.out.println("student1:"+student1.getDetails());
		System.out.println("student2:"+student2.getDetails());
		System.out.println("student3:"+student3.getDetails());
		
	}

}
