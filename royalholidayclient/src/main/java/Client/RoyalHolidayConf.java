package Client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class RoyalHolidayConf {
	
	@Bean 
	public Jaxb2Marshaller marshaller() {
		Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
		marshaller.setContextPath("generated");
		return marshaller;
	}
	
	@Bean
	public Client.RoyalHolidayClient royalHolidayClient(Jaxb2Marshaller marshaller) {
		Client.RoyalHolidayClient client = new Client.RoyalHolidayClient();
		client.setDefaultUri("http://localhost:8081/ws");
		client.setMarshaller(marshaller);
		client.setUnmarshaller(marshaller);
		
		return client;
	}
}
