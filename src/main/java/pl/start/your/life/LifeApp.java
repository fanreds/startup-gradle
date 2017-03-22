package pl.start.your.life;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
public class LifeApp {
    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(LifeApp.class);
        springApplication.run(args);
    }
}
