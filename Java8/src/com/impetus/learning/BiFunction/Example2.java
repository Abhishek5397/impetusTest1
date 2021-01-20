package com.impetus.learning.BiFunction;
import java.util.function.*;
public class Example2
{
public static void main(String gg[])
{
BiFunction<Integer,Integer,Integer> add= (a,b) -> a+b;
int num1=23;
int num2=45;
System.out.println("Sum : "+add.apply(num1,num2));
}
}