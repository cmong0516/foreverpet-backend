package com.hello.foreverpet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

@SpringBootApplication
public class ForeverpetApplication {

	public static void main(String[] args) {
//		SpringApplication.run(ForeverpetApplication.class, args);

		SpringApplication application = new SpringApplication(ForeverpetApplication.class);
		application.addListeners(new ApplicationPidFileWriter());
		application.run(args);
	}

}
