package solutionsHackerRank;

import java.util.Scanner;

public class DesignerPDF {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		int abc[]=new int[26];
		for(int i=0; i<26; i++) {
			abc[i]=sc.nextInt();
		}
		String string=new String();
		string=sc.next();
		sc.close();
		int greatest=abc[0];
		for(int i=0; i<string.length(); i++) {
			int temp=string.charAt(i)-97;
			if(abc[temp]>greatest) {
				greatest=abc[temp];
			}
		}
		greatest*=(string.length());
		System.out.println(greatest);
		
		
	}

}
