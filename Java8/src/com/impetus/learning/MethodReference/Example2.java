package com.impetus.learning.MethodReference;
interface abc
{
public void say();
}
public class Example2
{
public static void saySomething()
{
System.out.println("I am about to say something");
}
public static void main(String gg[])
{
//abc a=() -> saySomething();
/*
abc a=new abc(){
public void say(){
saySomething();
}
};
*/
abc a=Example2::saySomething;
a.say();
}
}