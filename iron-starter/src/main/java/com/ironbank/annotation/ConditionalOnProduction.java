package com.ironbank.annotation;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author d.dmitrievich
 * @version 12.07.18
 */
@Retention(RUNTIME)
@Conditional({OnProductionCondition.class})
public @interface ConditionalOnProduction {
}
