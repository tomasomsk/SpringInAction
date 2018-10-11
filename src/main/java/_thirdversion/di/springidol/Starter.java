package _thirdversion.di.springidol;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Starter {

    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "_thirdversion/di/springidol/spring-idol.xml");
        Performer performer = (Performer) ctx.getBean("duke");
        performer.perform();
    }

}
