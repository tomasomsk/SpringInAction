package fourthversion.chapter2.di.soundsystem;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = {SgtPeppers.class})
public class CDPlayerConfig {

    @Bean(name = "cdPlayer")
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

}



