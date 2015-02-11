package legostore.backend;

import legostore.framework.web.HttpCorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chanwook on 2015. 2. 11..
 */
@EnableAutoConfiguration
@ComponentScan
public class LegoStoreApiApp {

    @Bean
    public HttpCorsFilter corsFilter() {
        return new HttpCorsFilter();
    }

    public static void main(String[] args) {
        SpringApplication.run(LegoStoreApiApp.class, args);
    }
}
