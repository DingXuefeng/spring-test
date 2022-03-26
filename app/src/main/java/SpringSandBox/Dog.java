package SpringSandBox;

/**
 * Created: 3/26/22, Saturday
 *
 * @author <a href="mailto:xuefeng.ding.physics@gmail.com">Xuefeng Ding</a>
 **/
public class Dog implements Animal{
    Dog() {
        System.out.println("Dog::Dog called");
    }

    @Override
    final public String speak() {
        return "I am a dog.";
    }
}
