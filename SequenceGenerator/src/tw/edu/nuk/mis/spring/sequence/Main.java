package tw.edu.nuk.mis.spring.sequence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Sequence-Beans.xml");
		
		SequenceGenerator generator = (SequenceGenerator) context.getBean("sequenceGenerator");
		
		System.out.println(generator.getSequence());
		System.out.println(generator.getSequence());

	}

}
