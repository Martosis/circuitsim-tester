package edu.gatech.cs2110.circuitsim.extension;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface SubcircuitRegister {
    boolean onlyRegister() default false;
    int bits();
}
