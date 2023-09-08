package componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Mobile {
	@Value("1")
private int id;
	@Value("oneplus")
private String name;
	@Value("30000")
private double price;

@Override
public String toString() {
	return "Mobile [id=" + id + ", name=" + name + ", price=" + price + "]";
}

}
