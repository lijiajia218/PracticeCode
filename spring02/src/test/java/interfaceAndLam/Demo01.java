package interfaceAndLam;/**
 * @description:
 * @author: lll
 * @date: 2022-05-28 20:05
 */

import org.junit.Test;

import java.util.function.Consumer;

/**
 *@Author lll
 *@Date 20:05
 */
public class Demo01 {

    @Test
    public void test() {
        //context就是传进去的参数......
        Consumer returnConsumer = context -> {
            System.out.println("just test....");
        };

//        Consumer c = new Consumer() {
//            @Override
//            public void accept(Object o) {
//
//            }
//        };

        method1(returnConsumer);

    }

    static void method1(Consumer consumer) {
        consumer.accept("test");
    }
}
