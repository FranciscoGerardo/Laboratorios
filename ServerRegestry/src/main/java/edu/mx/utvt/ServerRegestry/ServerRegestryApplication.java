package edu.mx.utvt.ServerRegestry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication
@EnableEurekaServer
public class ServerRegestryApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerRegestryApplication.class, args);
	}

}
