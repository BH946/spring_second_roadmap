package jpabook.jpashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JpashopApplication {

	public static void main(String[] args) {
		// lombok test => @Getter @Setter
//		Hello hello = new Hello();
//		hello.setData("hello");
//		System.out.println("data = " + hello.getData());

		SpringApplication.run(JpashopApplication.class, args);
	}

}
