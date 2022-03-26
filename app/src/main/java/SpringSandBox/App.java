/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package SpringSandBox;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext factory = new AnnotationConfigApplicationContext();
        factory.register(BeanConfig.class);
        factory.register(Consumer.class);
        factory.register(BeanConfig2.class);
        factory.refresh();

        Consumer component = factory.getBean(Consumer.class);
        component.print("validation");
//
//        for (String name : Arrays.asList("cat", "dog")) {
//            Animal animalFromBean = factory.getBean(name, Animal.class);
//            System.out.printf("Using %s bean: %s\n",name,animalFromBean.speak());
//        }
//
//        Consumer cons = new Consumer();
//        cons.print("run");
    }
}