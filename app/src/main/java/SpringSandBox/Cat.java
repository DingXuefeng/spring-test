package SpringSandBox;

/**
 * Created: 3/26/22, Saturday
 *
 * @author <a href="mailto:xuefeng.ding.physics@gmail.com">Xuefeng Ding</a>
 **/
public class Cat implements Animal {
    Cat() {
        System.out.println("Cat::Cat called");
    }

    @Override
    final public String speak() {
        return "I am a cat";
    }
}
