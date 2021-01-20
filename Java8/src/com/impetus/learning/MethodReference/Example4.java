package com.impetus.learning.MethodReference;
import java.util.function.*;
class Arithmetic
{
public static int add(int a,int b)
{
return a+b;
}
public static int multiply(int a,int b)
{
return a*b;
}
public static int subtract(int a,int b)
{
return a-b;
}
}
public class Example4
{
public static void main(String gg[])
{
BiFunction<Integer,Integer,Integer> calculator;
int a=10;
int b=5;
calculator=Arithmetic::add;
System.out.println("Addition result : "+calculator.apply(a,b));
calculator=Arithmetic::multiply;
System.out.println("Multiplication result : "+calculator.apply(a,b));
calculator=Arithmetic::subtract;
System.out.println("Substraction result : "+calculator.apply(a,b));
}
}