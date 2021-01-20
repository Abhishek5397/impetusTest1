package com.impetus.learning.defaultKeyword;
import java.time.*;
public interface TimeClient
{
public void setTime(int hour,int minute,int second);
public void setDate(int day,int month,int year);
public void setDateAndTime(int date,int month,int year,int hour,int minute,int second);
public LocalDateTime getLocalDateTime();
private static ZoneId getZoneId(String zoneString)
{
try
{
return ZoneId.of(zoneString);
}catch(DateTimeException dateTimeException)
{
System.err.println("Invalid time zone: " + zoneString +"; using default time zone instead.");
return ZoneId.systemDefault();
}
}
default ZonedDateTime getZonedDateTime(String zoneString)
{
return ZonedDateTime.of(getLocalDateTime(),getZoneId(zoneString));
}
}