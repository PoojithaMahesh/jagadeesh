package withoutxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
public static void main(String[] args) {
	ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	Item item=context.getBean("item",Item.class);
	item.used();
	System.out.println(item);
	Item item1=context.getBean("item",Item.class);
	System.out.println(item1);
}
}
