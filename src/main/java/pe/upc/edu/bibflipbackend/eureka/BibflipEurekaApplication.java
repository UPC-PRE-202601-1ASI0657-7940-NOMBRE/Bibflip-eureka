package pe.upc.edu.bibflipbackend.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BibflipEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BibflipEurekaApplication.class, args);
	}

}
