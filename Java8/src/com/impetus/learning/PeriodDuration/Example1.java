package com.impetus.learning.PeriodDuration;
import java.time.*;
import java.time.temporal.*;
public class Example1
{
public static void main(String gg[])
{
LocalDate date1=LocalDate.now();
System.out.println(date1);
LocalDate date2=date1.plus(1,ChronoUnit.MONTHS);
System.out.println(date2);
Period period=Period.between(date2,date1);
System.out.print("Period : "+period+", ");
System.out.println("Difference : "+period.getMonths());
LocalTime time1=LocalTime.now();
LocalTime time2=time1.minus(20,ChronoUnit.MINUTES);
Duration duration=Duration.between(time2,time1);
System.out.print("Duration : "+duration+", ");
System.out.println("Difference : "+duration.getMinute());
}
}