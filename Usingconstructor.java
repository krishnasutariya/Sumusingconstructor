package LearnJava;

import java.util.Scanner;

class Usingconstructor {
	int a,b,c;
	
	Usingconstructor(int a,int b)
	{
		this.a = a;
		this.b = b;
	}
	void sum()
	{
		
		c = a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usingconstructor ac = new Usingconstructor(20, 20);
		ac.sum();
	}

}
