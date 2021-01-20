package com.impetus.learning.defaultKeyword;
interface Eg2InterfaceA
{
default public void sam()
{
System.out.println("I am defined in Eg2InterfaceA");
}
}
interface Eg2InterfaceB
{
default public void sam()
{
System.out.println("I am defined in Eg2IntefaceB");
}
public static void doSomething()
{
System.out.println("I am a static method defined in Eg2InterfaceB");
}
}
class Implementor implements Eg2InterfaceA,Eg2InterfaceB
{
public void sam()
{
System.out.println("I am sam from Implementor class");
Eg2InterfaceA.super.sam();
Eg2InterfaceB.super.sam();
}
public void tiger()
{
System.out.println("I am tiger from Implementor class");
}
}
public class Example2
{
public static void main(String gg[])
{
Implementor i=new Implementor();
i.sam();
i.tiger();
Eg2InterfaceB.doSomething();
}
}