package com.impetus.learning.OptionalAPI;
import java.util.*;
import java.io.*;
public class Example3
{
public static void main(String gg[])
{
Integer a,b;
BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
try
{
System.out.print("Enter a number : ");
try
{
a=Integer.parseInt(bufferedReader.readLine());
}catch(NumberFormatException numberFormatException)
{
a=null;
}
System.out.print("Enter another number : ");
try
{
b=Integer.parseInt(bufferedReader.readLine());
}catch(NumberFormatException numberFormatException)
{
b=null;
}
Optional<Integer> opt1,opt2;
opt1=Optional.ofNullable(a);
opt2=Optional.ofNullable(b);
System.out.println("Sum = "+calculateSum(opt1,opt2));
}catch(IOException exception)
{
System.out.println("Exception occurred : "+exception.getMessage());
}
}
public static int calculateSum(Optional<Integer> first, Optional<Integer> second)
{
System.out.println("Is first number valid : "+first.isPresent());
System.out.println("Is second number valid : "+second.isPresent());
Integer a=first.orElse(new Integer(0));
Integer b=second.orElse(new Integer(0));
return a+b;
}
}