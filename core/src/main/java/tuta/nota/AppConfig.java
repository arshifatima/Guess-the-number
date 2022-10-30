package tuta.nota;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "tuta.nota")
public class AppConfig {
    // == bean methods ==
    @Bean
    public  NumberGenerator numberGenerator(){
        return new NumberGeneratorImpl();
    }
    @Bean
    public Game game(){
        return new GameImpl();
    }
}
