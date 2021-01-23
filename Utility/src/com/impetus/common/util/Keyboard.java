package com.impetus.common.util;
import java.io.*;
public class Keyboard {
	private BufferedReader bufferedReader;
	public Keyboard() {
		super();
		this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	}
	public String getString() throws KeyboardException
	{
		String input;
		try
		{
			input=this.bufferedReader.readLine();
		}catch(IOException ioException)
		{
			throw new KeyboardException(ioException.getMessage());
		}
		return input;
	}
	public String getString(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getString();
	}
	public long getLong() throws KeyboardException
	{
		long input;
		try
		{
			input=Long.parseLong(this.getString());
		}catch(NumberFormatException numberFormatException)
		{
			throw new KeyboardException(numberFormatException.getMessage());
		}
		return input;
	}
	public long getLong(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getLong();
	}
	public int getInteger() throws KeyboardException
	{
		int input;
		try
		{
			input=Integer.parseInt(this.getString());
		}catch(NumberFormatException numberFormatException)
		{
			throw new KeyboardException(numberFormatException.getMessage());
		}
		return input;
	}
	public int getInteger(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getInteger();
	}
	public short getShort() throws KeyboardException
	{
		short input;
		try
		{
			input=Short.parseShort(this.getString());
		}catch(NumberFormatException numberFormatException)
		{
			throw new KeyboardException(numberFormatException.getMessage());
		}
		return input;
	}
	public short getShort(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getShort();
	}
	public byte getByte() throws KeyboardException
	{
		byte input;
		try
		{
			input=Byte.parseByte(this.getString());
		}catch(NumberFormatException numberFormatException)
		{
			throw new KeyboardException(numberFormatException.getMessage());
		}
		return input;
	}
	public byte getByte(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getByte();
	}
	public double getDouble() throws KeyboardException
	{
		double input;
		try
		{
			input=Double.parseDouble(this.getString());
		}catch(NumberFormatException numberFormatException)
		{
			throw new KeyboardException(numberFormatException.getMessage());
		}
		return input;
	}
	public double getDouble(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getDouble();
	}
	public float getFloat() throws KeyboardException
	{
		float input;
		try
		{
			input=Float.parseFloat(this.getString());
		}catch(NumberFormatException numberFormatException)
		{
			throw new KeyboardException(numberFormatException.getMessage());
		}
		return input;
	}
	public float getFloat(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getFloat();
	}
	public char getCharacter() throws KeyboardException
	{
		return this.getString().charAt(0);
	}
	public char getCharacter(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getCharacter();
	}
	public boolean getBoolean() throws KeyboardException
	{
		boolean input;
		try
		{
			input=Boolean.parseBoolean(this.getString());
		}catch(NumberFormatException numberFormatException)
		{
			throw new KeyboardException(numberFormatException.getMessage());
		}
		return input;
	}
	public boolean getBoolean(String message) throws KeyboardException
	{
		System.out.print(message);
		return this.getBoolean();
	}
}