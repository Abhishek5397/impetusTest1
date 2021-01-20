package com.impetus.learning.MethodReference;
interface Sayable
{
void say();
}
public class Example1
{
public static void saySomething()
{
System.out.println("I want to say something");
}
public static void main(String gg[])
{
Sayable say=Example1::saySomething;
say.say();
}
}