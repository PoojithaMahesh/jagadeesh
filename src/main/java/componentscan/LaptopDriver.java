package componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaptopDriver {
public static void main(String[] args) {
	ApplicationContext  context=new ClassPathXmlApplicationContext("component.xml");
	Laptop laptop=context.getBean("laptop",Laptop.class);
	System.out.println(laptop);
	Charger charger=context.getBean("charger",Charger.class);
	System.out.println(charger);
}
}
