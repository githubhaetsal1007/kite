package test;

public class CondOp {
	public static void main(String[] args) {
		int num1=50, num2=100;
		int big,diff;
		if(num1>num2) {
			System.out.println(num1);
		}
		else {
			System.out.println(num2);
		}
		if(num1>num2) {
			System.out.println(num1-num2);
		}
		else
		{
			System.out.println(num2-num1);
		}
		
		int sum = 0; // 곱하기 할 때에는 1로 초기화하는 게 중요
		int i =0;
		while(i<100) {
		sum += i;
		i++;
		System.out.println(sum);
		}

	}
}
