package PrimaryQualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Cow implements Animal{

	public void sound() {
	System.out.println("moaaaaa");
	}

}
