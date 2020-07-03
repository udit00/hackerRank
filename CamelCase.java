package solutionsHackerRank;

import java.util.Scanner;

public class CamelCase {
	public static void main(String[] args){
		int flag=1;
		Scanner sc=new Scanner(System.in);
		String str=new String();
		str=sc.next();
		sc.close();
		for(int i=0; i<str.length(); i++) {
			if(Character.isUpperCase(str.charAt(i))) {
				flag++;				
			}
		}
		System.out.println(flag);
		
	}

}
