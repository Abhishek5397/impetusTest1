package com.impetus.learning.defaultKeyword;
interface Eg1InterfaceA
{
default public void sam()
{
System.out.println("I am Abhishek Kataria");
}
}
public class Example1 implements Eg1InterfaceA
{
public static void main(String gg[])
{
Eg1InterfaceA ptr=new Example1();
ptr.sam();
}
}