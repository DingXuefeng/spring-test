package SpringSandBox;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created: 3/26/22, Saturday
 *
 * @author <a href="mailto:xuefeng.ding.physics@gmail.com">Xuefeng Ding</a>
 **/
@Configuration
public class BeanConfig {
    @Bean
    @Qualifier("cat")
    public Animal getCat() {
        return new Cat();
    }

    @Bean
    @Qualifier("dog")
    public Animal getDog() {
        return new Dog();
    }
}
