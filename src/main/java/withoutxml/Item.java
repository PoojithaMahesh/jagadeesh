package withoutxml;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype")
public class Item {

	public void used() {
		System.out.println("item is used to......");
	}
	@Value("1")
	private int id;
	@Value("Laptop")
	private String name;
}
