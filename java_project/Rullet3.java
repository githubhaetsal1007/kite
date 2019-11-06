package test;

import java.util.Scanner;

public class Rullet3 {
	public static void main(String[] args) {
		int ran;
		Scanner kb = new Scanner(System.in);	
		
		// int captain=0; 
		// 0번지의 값 == 임의의 위치의 값을 바꾼다.
		// 1. temp = name1을 저장 / 2. name1 = name2 / 3. name2 = temp, swap
		// 배열의 위치도 랜덤으로 배열하게, 랜덤으로 뽑는 방법을 여러 가지로
		
		String [] name = {"고현주","구자윤","김난형","김동진","김주연","문영기","박준섭","박지은"
				          ,"방창용","양햇살","엄예빈","위은주","이용재","황다울","이진형","이택수"
				          ,"장한솔","정엄지","정용기","조성빈","조지윤","최찬영","하재운","홍지수"};
		
		int menu=0;
		while(menu!=1) {
		System.out.println("제비뽑기를 시작하려면 1번을 누르세요\n");
		menu = kb.nextInt();
	
		if(menu==1)
	    { 
		  ran = (int)(Math.random()*24); // 0 <= ran <= 23, 24인 인덱스
	     // captain =ran%24;    	 
		   System.out.print("축하합니다. 반장은 "+name[ran]+"입니다.");
							}
		else
		{
			System.out.println("다시 입력해주세요.\n");
		}
		}
	    	}
}

