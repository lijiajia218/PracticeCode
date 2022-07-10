package annotation;

/**
 * @description: 自定义注解
 * @author: lll
 *
 * @date: 2022-06-22 21:57
 */


/**
 * public @interface Report {
 *     int type() default 0;
 *     String level() default "info";
 *     String value() default "";
 * }
 */

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 最常用的元注解是@Target。使用@Target可以定义Annotation能够被应用于源码的哪些位置：
 *
 * 类或接口：ElementType.TYPE；
 * 字段：ElementType.FIELD；
 * 方法：ElementType.METHOD；
 * 构造方法：ElementType.CONSTRUCTOR；
 * 方法参数：ElementType.PARAMETER。
 */

/**
 * @Retention
 * 另一个重要的元注解@Retention定义了Annotation的生命周期：
 *
 * 仅编译期：RetentionPolicy.SOURCE；
 * 仅class文件：RetentionPolicy.CLASS；
 * 运行期：RetentionPolicy.RUNTIME。
 */

/**
 * @Inherited
 * 使用@Inherited定义子类是否可继承父类定义的Annotation。@Inherited仅针对@Target(ElementType.TYPE)类型的annotation有效，
 * 并且仅针对class的继承，对interface的继承无效：
 */

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Report {
    int type() default 0;
    String level() default "info";
    String value() default "";
}
