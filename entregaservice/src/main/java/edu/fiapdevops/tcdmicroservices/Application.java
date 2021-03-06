package edu.fiapdevops.tcdmicroservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@RefreshScope
@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
public class Application {

	private static final Logger logger = LoggerFactory.getLogger(Application.class);
	
	  public static void main(String[] args) {
		  SpringApplication.run(Application.class, args);
	  }
	  
}
