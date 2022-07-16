package com.java.newfeature.customannotation;

import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.METHOD})
@Documented
@Retention(RetentionPolicy.RUNTIME)
//@Constraint
public @interface MaskCardNumber {

}
