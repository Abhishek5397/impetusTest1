package com.impetus.learning.MethodReference;
public class Example3
{
public static void threadStatus()
{
System.out.println("Thread is running...");
}
public static void main(String gg[])
{
//Thread t=new Thread(Example3::threadStatus);
Thread t=new Thread(() -> threadStatus());
t.start();
}
}