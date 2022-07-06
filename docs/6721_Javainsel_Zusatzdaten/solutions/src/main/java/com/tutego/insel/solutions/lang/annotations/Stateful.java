package com.tutego.insel.solutions.lang.annotations;

import java.lang.annotation.*;

@Retention( RetentionPolicy.RUNTIME )
public @interface Stateful
{
  String name() default "";

  TransactionManagementType transactionManagement() default TransactionManagementType.BEAN;
}
