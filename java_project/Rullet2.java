package test;

import java.util.Scanner;

public class Rullet2 {
	public static void main(String[] args) {
		int ran;
		Scanner kb = new Scanner(System.in);	
		int captain=0; 
		String [] name = {"고현주","구자윤","김난형","김동진","김주연","문영기","박준섭","박지은"
				          ,"방창용","양햇살","엄예빈","위은주","이용재","황다울","이진형","이택수"
				          ,"장한솔","정엄지","정용기","조성빈","조지윤","최찬영","하재운","홍지수"};
		
		System.out.println("제비뽑기를 시작하려면 1번을 누르세요");
		int menu = Integer.parseInt(kb.nextLine());
			while(true) {
		if(menu==1)
	    { 
		  ran = (int)(Math.random()*100);
	      captain =ran%24;    	 
		   System.out.print("축하합니다. 반장은 "+name[captain]+"입니다.");
							}
		else 
		{
			System.out.print("다시 입력해 주세요.1");
		}
	    	}
	}
}

