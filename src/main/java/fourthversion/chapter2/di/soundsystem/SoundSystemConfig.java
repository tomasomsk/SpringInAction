package fourthversion.chapter2.di.soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

@Configuration
@Import({CDPlayerConfig.class})
@ImportResource("classpath:fourthversion/chapter2/di/soundsystem/soundsystem.xml")
public class SoundSystemConfig {
}
