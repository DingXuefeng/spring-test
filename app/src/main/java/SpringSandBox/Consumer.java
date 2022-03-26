package SpringSandBox;

import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created: 3/26/22, Saturday
 *
 * @author <a href="mailto:xuefeng.ding.physics@gmail.com">Xuefeng Ding</a>
 **/

@Component
public class Consumer {
    private List<Animal> animalList;

    public Consumer(@Qualifier(value = "cat") @NotNull Animal cat) {
        System.out.printf("Consumer::Consumer Autowired cat here: %s\n", cat.speak());
        print("Constructor");
    }

    @Autowired
    public void autoSetter(List<Animal> animals) {
        animalList = animals;
        System.out.println("auto setter is called");
        print("auto setter");
    }

    void print(String status) {
        System.out.printf("Running %s here.\n", status);
        if(animalList!=null) {
            for (Animal name : animalList) {
                System.out.printf("[%s] autowired: %s\n", status, name.speak());
            }
        }
    }
}
