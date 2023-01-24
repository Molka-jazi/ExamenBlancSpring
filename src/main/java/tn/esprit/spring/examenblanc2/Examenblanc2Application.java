package tn.esprit.spring.examenblanc2;

import lombok.ToString;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class Examenblanc2Application {

    public static void main(String[] args) {
        SpringApplication.run(Examenblanc2Application.class, args);
    }

}
