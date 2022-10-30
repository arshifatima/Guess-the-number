package tuta.nota;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    private static final String CONFIG_LOCATION = "beans.xml";
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess the Number");
        //create context container
        ConfigurableApplicationContext context =
                new ClassPathXmlApplicationContext(CONFIG_LOCATION);

        //get number bean generator from context(container)
        NumberGenerator numberGenerator =
                context.getBean(NumberGenerator.class);

        //class method next() to get random number
        int number = numberGenerator.next();

        //log generated number
        log.info("number = {}",number);

        //get game beam from context(container)
        Game game = context.getBean(Game.class);

        //call reset method
        game.reset();

        //close context(container)
        context.close();
    }
}
