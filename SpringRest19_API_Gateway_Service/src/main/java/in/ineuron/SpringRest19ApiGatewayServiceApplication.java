package in.ineuron;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class SpringRest19ApiGatewayServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringRest19ApiGatewayServiceApplication.class, args);
	}

}
