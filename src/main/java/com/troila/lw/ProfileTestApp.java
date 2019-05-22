package com.troila.lw;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class ProfileTestApp {

	public static void main(String[] args) {
		new SpringApplicationBuilder(MyConfigApp.class).properties(
				"spring.profiles.active=windows").run(args);
	}

}
