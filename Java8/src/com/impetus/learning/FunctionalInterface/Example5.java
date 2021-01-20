package com.impetus.learning.FunctionalInterface;
import java.util.*;
public class Example5
{
public static void main(String gg[])
{
List<String> list=new ArrayList<>();
list.add("Mahesh");
list.add("Suresh");
list.add("Ramesh");
list.add("Naresh");
list.add("Kalpesh");
list.forEach(System.out::println);
}
}