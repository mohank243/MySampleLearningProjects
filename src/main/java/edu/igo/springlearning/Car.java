package edu.igo.springlearning;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.MessageSource;

public class Car implements Vehicle {
	@Autowired
	List<Tyre> tyres;
	int size;
	@Autowired
	
	MessageSource messageSource;

	public MessageSource getMessageSource() {
		return messageSource;
	}


	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}


	public List<Tyre> getTyre() {
		return tyres;
	}

	
	public void setTyre(List<Tyre> tyre) {
		this.tyres = tyre;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void drive() {
		System.out.println(messageSource.getMessage("Drive.start", null,"Default Start Drive", null));

		for(Tyre tyre: tyres) {
//			System.out.println("Driving a Car with " + tyre + " Size of the " + tyre + " is " + size);
			System.out.println(messageSource.getMessage("Drive.type.print",new Object[] {tyre,size}, "Drive Message", null));
		}
	}
	@PostConstruct
	public void initializingBean() {
		System.out.println("Car Bean is initializing");
	}
	@PreDestroy
	public void destroyBeanFunction() {
		System.out.println("Bean Destroyed");
	}
	

}
