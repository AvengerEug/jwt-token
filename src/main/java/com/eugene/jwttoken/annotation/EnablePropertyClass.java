package com.eugene.jwttoken.annotation;

import com.eugene.common.peroperty.JwtProperty;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Import({
        JwtProperty.class
})
public @interface EnablePropertyClass {
}
