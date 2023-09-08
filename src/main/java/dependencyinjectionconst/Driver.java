package dependencyinjectionconst;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("constdepinjection.xml");
	Mobile mobile=context.getBean("mobile",Mobile.class);
	System.out.println(mobile);
	System.out.println("achived dependency injection with the help of constructor arg tag");
	Sim sim=context.getBean("sim1",Sim.class);
	System.out.println(sim);
}
}
