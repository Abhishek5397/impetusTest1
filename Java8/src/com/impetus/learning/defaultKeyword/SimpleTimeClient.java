package com.impetus.learning.defaultKeyword;
import java.time.*;
public class SimpleTimeClient implements TimeClient
{
private LocalDateTime dateAndTime;
public SimpleTimeClient()
{
this.dateAndTime=LocalDateTime.now();
}
public void setDate(int day,int month,int year)
{
LocalDate dateToSet=LocalDate.of(day,month,year);
LocalTime currentTime=LocalTime.from(dateAndTime);
this.dateAndTime=LocalDateTime.of(dateToSet,currentTime);
}
public void setTime(int hours,int minutes,int seconds)
{
LocalDate currentDate=LocalDate.from(dateAndTime);
LocalTime timeToSet=LocalTime.of(hours,minutes,seconds);
this.dateAndTime=LocalDateTime.of(currentDate,timeToSet);
}
public void setDateAndTime(int day,int month,int year,int hour,int minute,int second)
{
this.dateAndTime=LocalDateTime.of(LocalDate.of(day,month,year),LocalTime.of(hour,minute,second));
}
public LocalDateTime getLocalDateTime()
{
return this.dateAndTime;
}
public String toString()
{
return this.dateAndTime.toString();
}
}