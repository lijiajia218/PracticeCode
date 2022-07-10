package annotation;
import org.junit.Test;

import java.lang.reflect.Field;

/**
 *@Author lll
 *@Date 21:56
 */

/**
 * 使用反射API读取Annotation：
 *
 * Class.getAnnotation(Class)
 * Field.getAnnotation(Class)
 * Method.getAnnotation(Class)
 * Constructor.getAnnotation(Class)
 */
public class UseCustomAnnotation {

    //判断注解是否存在类上
    @Test
    public void test() {
        boolean annotationPresent = Person.class.isAnnotationPresent(Report.class);
        System.out.println(annotationPresent);
    }

    //使用反射读取注解
    @Test
    public void readAnnotationValue() {
        //可以获取annotation的值，那么如果在类上的annotation赋值了，就可以在这里获取到。否则就获取默认值。
        Report annotation = Person.class.getAnnotation(Report.class);
        String level = annotation.level();
        String value = annotation.value();
        int type = annotation.type();
        System.out.println("level: " + level);
        System.out.println("value " + value );
        System.out.println("type " + type);
    }

    @Test
    public void readAnnotation2() {
        Class cls = Person.class;
        if (cls.isAnnotationPresent(Report.class)) {
//            Report report = new Person().getClass().getAnnotation(Report.class);
            Report report = (Report) cls.getAnnotation(Report.class);
            String value = report.value();
            System.out.println(value);

        }
    }

    //校验方法。
    void check(Person person) throws IllegalArgumentException, ReflectiveOperationException {
        // 遍历所有Field:
        for (Field field : person.getClass().getFields()) {
            // 获取Field定义的@Range:
            Range range = field.getAnnotation(Range.class);
            // 如果@Range存在:
            if (range != null) {
                // 获取Field的值:
                Object value = field.get(person);
                // 如果值是String:
                if (value instanceof String) {
                    String s = (String) value;
                    // 判断值是否满足@Range的min/max:
                    if (s.length() < range.min() || s.length() > range.max()) {
                        throw new IllegalArgumentException("Invalid field: " + field.getName());
                    }
                }
            }
        }
    }

}







