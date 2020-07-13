package solutionsHackerRank;

import java.util.Scanner;

public class Utopian_Tree {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int values[]=new int[t];
		for(int i=0; i<t; i++) {
			values[i]=sc.nextInt();
		}
		sc.close();
		for(int i=1; i<=values[t-1]; i++) {
			int temp=0;
			if(i%2==0 && i==values[i]) {
				values[i]=values[i-1]+1;
				System.out.println(temp);
			}
			else if(i%2!=0) {
				if(i==values[i]) {
				values[i]=values[i-1]*2;
				System.out.println(temp);
				}
			}
			else {
				System.err.println(i);
			}
			
		}
	}

}
