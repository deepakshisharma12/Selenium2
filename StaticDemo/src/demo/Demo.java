package demo;

import java.util.Scanner;

public class Demo {
	
	//static int i = 10;
	int j;
	static String cname="VITS";
	/*String uisname;
	int age;*/
	static
	{
		cname="ibm";
	}
	
	{
		j=10;
	}
	void show(){
		Scanner sc = new Scanner(System.in);
		for(int i = 1;i<=3;i++){
		System.out.println("enter the age of the student");
		//Integer age = sc.nextInt();
		int age= sc.nextInt();
		System.out.println("enter the name of the student");
		String sname=sc.next();
		System.out.println(sname+" "+age+" "+" "+cname);
		System.out.println(j);
		}
		
	}
	
	/*void show(){
		System.out.println("HELLO");
		System.out.println(i);
	}*/
	public static void main(String[] args) {
		Demo d=new Demo();
		d.show();
		//System.out.println(i);
	}

}
