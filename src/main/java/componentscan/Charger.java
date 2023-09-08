package componentscan;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Charger {
    @Value("1")
	private int id;
    @Value("ctype")
	private String chargertype;
	@Override
	public String toString() {
		return "Charger [id=" + id + ", chargertype=" + chargertype + "]";
	}
}
