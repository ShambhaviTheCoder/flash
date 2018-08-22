package com.Practice.Exp2;
import com.Practice.Exp1.Sample1.Sample2;
import com.Practice.Exp1.Sample1;

public class Run extends Sample1
{
	public static void main(String[] args) 
	{
		Sample1 s1=new Sample1();
		//s1.show1();
		Sample1.show2();
		System.out.println("a1= "+Sample1.a1);
		Run r1=new Run();
		System.out.println("a2= "+r1.a2);
		//r1.show1();
		
		Sample2 s2=new Sample2();
		s2.test1();
		Sample2.test2();
		System.out.println("z1= "+Sample2.z1);
		System.out.println("z2= "+s2.z2);

	}
}
