package jpaproject.jpaWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaWebApplication {

	public static void main(String[] args) {
		Hello hello = new Hello();
		hello.setData("kos");
		String data = hello.getData();
		System.out.println("data = " + data);
		SpringApplication.run(JpaWebApplication.class, args);
	}

}
