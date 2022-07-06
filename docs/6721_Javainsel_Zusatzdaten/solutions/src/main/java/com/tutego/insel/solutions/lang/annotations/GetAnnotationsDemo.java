package com.tutego.insel.solutions.lang.annotations;

import java.lang.annotation.Annotation;
import java.util.Arrays;

public class GetAnnotationsDemo
{
	public static void main(String[] args)
	{
		System.out.println( Arrays.toString( CalculatorBean.class.getAnnotations() ) );

		for ( Annotation a : CalculatorBean.class.getAnnotations() )
      System.out.println( "Annotation:" + a );
	}
}
