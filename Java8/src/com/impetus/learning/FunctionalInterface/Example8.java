package com.impetus.learning.FunctionalInterface;
import java.util.*;
import java.util.stream.*;
public class Example8
{
public static void main(String gg[])
{
List<String>strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
//String result=strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.joining(", "));
String result=strings.parallelStream().filter(str -> !str.isEmpty()).collect(Collectors.joining(", "));
System.out.println(result);
//result.forEach(System.out::println);
}
}