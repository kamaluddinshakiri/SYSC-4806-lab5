package webAPP;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import webAPP.Models.AddressBook;
import webAPP.Models.BuddyInfo;
import webAPP.Models.repo;

@SpringBootApplication
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

	@Bean
	public CommandLineRunner demo(repo repository) {
		return (args) -> {
			BuddyInfo kamal = new BuddyInfo();
			kamal.setAll("Kamal","33213","kamal@gmail.com", "Kamal house");
			
			BuddyInfo ahmed = new BuddyInfo();
			ahmed.setAll("Ahmed","321312","ahmed@gmail.com", "Ahmed house");

			AddressBook a1 = new AddressBook();

			a1.addBuddy(kamal);
			a1.addBuddy(ahmed);

			repository.save(a1);
		};
	}
}