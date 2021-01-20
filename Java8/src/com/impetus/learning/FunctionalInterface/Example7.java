package com.impetus.learning.FunctionalInterface;
import java.util.*;
public class Example7
{
public static void main(String gg[])
{
Random random=new Random();
//random.ints(1,100).limit(10).forEach(System.out::println);
random.ints(1,100).limit(10).forEach(k -> System.out.println(k));
}
}