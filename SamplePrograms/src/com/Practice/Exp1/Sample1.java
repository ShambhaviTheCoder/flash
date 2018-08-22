package com.Practice.Exp1;

public class Sample1 
{
	protected static int a1=2343;
	protected int a2=2222;
	private void show1()
	{
		Sample2.test2();
		System.out.println("this is show1() of Sample1 outer class");
	}
	
	protected static void show2()
	{
		System.out.println("this is show2() of Sample1 outer class");
	}
	
	public static class Sample2 
	{
		public static int z1=20;
		public int z2=4566;
		
		public void test1()
		{
			Sample1.show2();
			Sample1 sa=new Sample1();
			sa.show1();
			System.out.println("this is test1() of Sample1 class");
		}	
		public static void test2()
		{
			System.out.println("this is static test2() of Sample class");
		}
	}
}
