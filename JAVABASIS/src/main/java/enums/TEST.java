package enums;

import org.junit.Test;

/**
 * @Description
 * @Author lll
 * @Date: 2022/6/25 21:10
 * @Version 1.0
 */

public class TEST {

    @Test
    public void test() {
        String name = AnimalEnum.CAT.name();
        String s = AnimalEnum.CAT.toString();

        System.out.println(name);
        System.out.println(s);
        System.out.println(AnimalEnum.CAT.name().toLowerCase());
    }

    @Test
    public void t2() {
        //这样就是一个类对象，枚举。
        System.out.println(AddParamEnum.SUCCESS.getStatus());
    }
}
