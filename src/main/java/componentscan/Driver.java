package componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	
	ApplicationContext applicationContext=new ClassPathXmlApplicationContext("component.xml");

    Mobile  mobile=applicationContext.getBean("mobile",Mobile.class);
    System.out.println(mobile);

}
}
