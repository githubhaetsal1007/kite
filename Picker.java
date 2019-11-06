package test;

import java.util.Scanner;
public class Picker {
	
	 static String[] name = {"고현주","구자윤","김난형","김동진","김주연","문영기","박준섭","박지은"
	            ,"방창용","양햇살","엄예빈","위은주","이용재","황다울","이진형","이택수"
	            ,"장한솔","정엄지","정용기","조성빈","조지윤","최찬영","하재운","홍지수"};
	 // name은 배열이다
	 
public static void main(String[] args) {


	Scanner s = new Scanner(System.in);
	
	while(true) {
		System.out.print("섞을 회수");
		int cnt =s.nextInt();
		if (cnt!=1)
		{
			  shuffle(cnt);
		}
		else {
			break;
		}
	}
	
}
private static void shuffle(int num) {
	String temp = null;

	for (int i=0;i<num;++i)
	{
		int rNum = (int)(Math.random()*name.length); // 0.0 ~ 1.0 사이
		temp = name[0];
		name[0] = name[rNum];
		name[rNum] = temp;
	}
}
}
