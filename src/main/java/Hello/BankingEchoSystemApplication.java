package Hello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BankingEchoSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(BankingEchoSystemApplication.class, args);
		System.out.println("spring");
	}

}
