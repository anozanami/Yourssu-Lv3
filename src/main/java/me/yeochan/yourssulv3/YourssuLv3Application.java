package me.yeochan.yourssulv3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class YourssuLv3Application {

    public static void main(String[] args) {
        SpringApplication.run(YourssuLv3Application.class, args);
    }

}
