package test;

public class Fire {
	public static void main(String args[]) 
	{
		int num1=10;
		int num2=20;
		int num3=30;
		num1=num2=num3;
		System.out.println("num1 : "+num1);
		System.out.println("num2 : "+num2);
		System.out.println("num3 : "+num3);
		// 가장 먼저 num3이 num2에 대입되고, num2의 값이 30으로 된 후에 num1에 대입되어서 모두 30이 됨

}
}
