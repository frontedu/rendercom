package dev.eddu.fidelity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class FidelityApplication {

	public static void main(String[] args) {
		SpringApplication.run(FidelityApplication.class, args);
	}

@RestController
class Controller{
	@GetMapping("/")
	private String index(){
		return "Hello World";
	}
}

}
