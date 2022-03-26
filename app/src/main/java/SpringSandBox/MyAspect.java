package SpringSandBox;

import org.aspectj.lang.annotation.Aspect;

/**
 * Created: 3/26/22, Saturday
 *
 * @author <a href="mailto:xuefeng.ding.physics@gmail.com">Xuefeng Ding</a>
 **/

@Aspect
public class MyAspect {
    public void before() {
        System.out.println("before");
    }
    public void after() {
        System.out.println("after");
    }
}
