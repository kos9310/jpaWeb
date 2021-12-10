package jpaproject.jpaWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpaWebApplication {

	public static void main(String[] args) {
		Main main = new Main();
		main.setData("kos");
		String data = main.getData();
		System.out.println("data = " + data);
		SpringApplication.run(JpaWebApplication.class, args);
	}

}
