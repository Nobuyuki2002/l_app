package oit.is.ouyouteam.c05.l_app.l_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class LAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(LAppApplication.class, args);
	}

}
