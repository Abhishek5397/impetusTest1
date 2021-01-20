package com.impetus.learning.BiFunction;
import java.util.function.*;
import java.io.*;
import java.util.*;
public class Example1
{
public static void main(String gg[])
{
BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
BiFunction<Optional,Optional,Integer> add=new BiFunction<>(){
public Integer apply(Optional a,Optional b)
{
return (Integer)a.orElse(new Integer(0))+(Integer)b.orElse(new Integer(0));
}
};
Optional<Integer> a,b;
try
{
try
{
System.out.print("Enter a number : ");
a=Optional.ofNullable(Integer.parseInt(bufferedReader.readLine()));
}catch(NumberFormatException numberFormatException)
{
a=Optional.empty();
}
try
{
System.out.print("Enter another number : ");
b=Optional.ofNullable(Integer.parseInt(bufferedReader.readLine()));
}catch(NumberFormatException numberFormatException)
{
b=Optional.empty();
}
System.out.println("Sum : "+add.apply(a,b));
}catch(IOException ioException)
{
System.out.println("IOException caught : "+ioException.getMessage());
}
}
}