package com.impetus.learning.BiFunction;
import java.util.function.*;
class Arithmetic
{
public static int compute(int a,int b)
{
return a+b;
}
}
public class Example3
{
public static void main(String gg[])
{
BiFunction<Integer,Integer,Integer> add= Arithmetic::compute;
int num1=23;
int num2=45;
System.out.println("Sum : "+add.apply(num1,num2));
}
}