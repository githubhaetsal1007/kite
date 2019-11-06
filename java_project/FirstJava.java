package test;

public class FirstJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Hello World");
System.out.println("Hello~ World~");
int a=0;
System.out.print("\n줄바꿈\n연습\n");
System.out.print("\t텝키\t연습\n");
System.out.print("이것은\r 앞으로 이동합니다.\n");
System.out.print("글자가 \"강조\" 됩니다.\n");
System.out.print("\\\\\\역슬래시 세개 출력");
int score = 100;
score = 200;
// char ch = 'A';
char A = '7';
int B = 7;
// String s1 = “A” + “B”;

byte b = 0; // byte형 변수 b를 선언하고 0으로 초기화.
int i = 0;
// 반복문을 이용해서 b의 값을 1씩, 0부터 270까지 증가시킨다.
for(int x=0; x <= 270; x++) 
{
System.out.print(b++);
// print는 출력 후 줄 바꿈을 하지 않는다.
System.out.print('\t'); // tab을 출력한다.
System.out.println(i++);
}
int num1=10;
int num2=20;
int num3=30;
num1=num2=num3;
System.out.println(num1);
System.out.println(num2);
System.out.println(num3);

	}

}
