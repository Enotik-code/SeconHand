package by.seconhand;
// IDI NAH
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.telegram.telegrambots.ApiContextInitializer;

import java.io.IOException;
import java.text.ParseException;

@SpringBootApplication
public class Application {

    public static void main(String[] args){
        SpringApplication.run(Application.class , args);
    }
}
