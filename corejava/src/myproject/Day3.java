package myproject;

import myproject.Day3;

public class Day3 {
	int year_ofpurchase;
	String make;
	int model;
	double cost;
	public void display1()
	{
		System.out.println("year of purchase"+2001);
		System.out.println("make"+"suzuki");
	}
	public void display2()
	{
		System.out.println("model"+1999);
		System.out.println("cost"+20000);
		
	}
	public static void main(String[] args)
	{
		Day3 ob1 = new Day3();
		ob1.display1();
		ob1.display2();
	}
}