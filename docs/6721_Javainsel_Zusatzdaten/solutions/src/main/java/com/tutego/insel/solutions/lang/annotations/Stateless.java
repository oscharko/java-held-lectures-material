package com.tutego.insel.solutions.lang.annotations;

import java.lang.annotation.*;

@Retention( RetentionPolicy.RUNTIME )
public @interface Stateless
{
  String name() default "";

  TransactionManagementType transactionManagement() default TransactionManagementType.CONTAINER;
}
