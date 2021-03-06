package ch.morrolan.shipme;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// import nz.net.ultraq.thymeleaf.LayoutDialect;

@SpringBootApplication
@Configuration
/**
* Contains #main method, which starts the entire application
*/
public class Application {

    /**
    Starts the entire "Ship Me" application
     */
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    // @Bean
    // LayoutDialect layoutDialect() {
    //   return new LayoutDialect();
    // }

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {

            System.out.println("Let's inspect the beans provided by Spring Boot:");

            String[] beanNames = ctx.getBeanDefinitionNames();
            Arrays.sort(beanNames);
            for (String beanName : beanNames) {
                System.out.println(beanName);
            }

        };
    }

}
