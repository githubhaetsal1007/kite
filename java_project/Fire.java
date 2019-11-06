package test;

public class Fire {
	public static void main(String args[]) 
	{
		int num1=10;
		int num2=20;
		int num3=30;
		num1=num2=num3;
		System.out.println(" 문제 1 ");
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		// 가장 먼저 num3이 num2에 대입되고, num2의 값이 30으로 된 후에 num1에 대입되어서 모두 30이 됨
		
		System.out.println(" 문제 2 ");
		System.out.println("결과 : "+(((25*5)+(36-4))-72)/5);
		
		System.out.println(" 문제 3 ");
		int a=3;
		int b=6;
		int c=9;
		int d=12;
		int a1=a+b;
		int a2=a+b+c;
		int a3=a+b+c+d;
		System.out.println("1 : "+a1);
		System.out.println("2 : "+a2);
		System.out.println("3 : "+a3);
		
		System.out.println(" 문제 4 ");
		a = (((25*5)+(36-4))-72)/5;
		b = (((25*5)+(36-4))-71)/4;
		c = (128/4)*2;
		
		if(a>b) 
		{
			if(b>c) 
				{
				System.out.println(" true ");
				}
		}
		else {
			System.out.println(" false ");
		}
		
}
}
