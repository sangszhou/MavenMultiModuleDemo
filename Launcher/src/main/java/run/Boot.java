package run;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by xinszhou on 16/8/28.
 */
@SpringBootApplication
@ComponentScan(basePackages = {"routers"})
public class Boot {
    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }
}
