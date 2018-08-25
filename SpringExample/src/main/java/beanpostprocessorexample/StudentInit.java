package beanpostprocessorexample;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class StudentInit implements BeanPostProcessor {

	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("Before init");
		if(bean instanceof Student) {
			Student student=(Student)bean;
			student.setName(beanName);
			return student;
		}
		return bean;
	}

	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		System.out.println("After init");
		if(bean instanceof Student) {
			Student student=(Student)bean;
			student.setName("Lokesh");
			return student;
		}
		return bean;
	
	}

}
