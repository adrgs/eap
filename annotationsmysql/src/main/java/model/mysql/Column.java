package model.mysql;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Column {
    public String name() default "";
    public String value() default "";
    public boolean primaryKey() default false;
    public boolean nullable() default false;
    public boolean hasDefaultValue() default false;
}
