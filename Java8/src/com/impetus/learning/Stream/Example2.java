package com.impetus.learning.Stream;
import java.util.stream.*;
public class Example2
{
public static void main(String gg[])
{
Stream.iterate(1,element -> element+1).filter(element -> element%5==0).limit(10).forEach(System.out::println);
}
}