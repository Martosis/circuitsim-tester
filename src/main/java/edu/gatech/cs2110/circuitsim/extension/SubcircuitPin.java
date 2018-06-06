package edu.gatech.cs2110.circuitsim.extension;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface SubcircuitPin {
    String label() default ""; // label of pin (default: name of variable)
    int bits();
}
