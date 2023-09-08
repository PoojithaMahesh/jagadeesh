package dependencyinjection;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Driver {
	public static void main(String[] args) {

		Resource resource = new ClassPathResource("mobilesim.xml");
		BeanFactory beanFactory = new XmlBeanFactory(resource);

		Mobile mobile = (Mobile) beanFactory.getBean("mobile");
		System.out.println(mobile);
		
		Sim sim = beanFactory.getBean("sim1", Sim.class);
		System.out.println(sim);
	
		
	}
}
