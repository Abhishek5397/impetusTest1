package com.impetus.learning.MethodReference;
import java.util.function.*;
class Arithmetic
{
public static int add(int a,int b){ return a+b; }
public static float add(int a,float b){ return a+b; }
public static float add(float a,int b){ return a+b; }
public static float add(float a,float b){ return a+b; }
}
public class Example5
{
public static void main(String gg[])
{
BiFunction<Integer,Integer,Integer> adder1=Arithmetic::add;
BiFunction<Integer,Float,Float> adder2=Arithmetic::add;
BiFunction<Float,Integer,Float> adder3=Arithmetic::add;
BiFunction<Float,Float,Float> adder4=Arithmetic::add;
int a=20;
float b=30.0f;
System.out.println("Addition 1 : "+adder1.apply(a,a));
System.out.println("Addition 2 : "+adder2.apply(a,b));
System.out.println("Addition 3 : "+adder3.apply(b,a));
System.out.println("Addition 4 : "+adder4.apply(b,b));
}
}