package fr.cnes.regards.microservices.core.information;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MicroserviceInfo {

    String name();

    String version();

    String[] dependencies() default {};
}
