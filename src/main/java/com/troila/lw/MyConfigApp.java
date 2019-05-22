package com.troila.lw;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MyConfigApp {

	public static void main(String[] args) {
		//以配置文件中的設置進行啟動
		// 顧名思義，這個Builder類就是讓SpringBootApplication跑起來的。
		//同時classpath:/abc.properties的含義是從讀取classpath根目錄下的abc.properties配置文件
		new SpringApplicationBuilder(MyConfigApp.class).properties("spring.config.location=classpath:/abc.properties").run(args);
	}

}
