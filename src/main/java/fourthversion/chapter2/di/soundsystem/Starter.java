package fourthversion.chapter2.di.soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "fourthversion/chapter2/di/soundsystem/soundsystem.xml");
        CDPlayer player = (CDPlayer) ctx.getBean("cdPlayer");
        player.play();
    }


}
