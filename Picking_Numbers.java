package solutionsHackerRank;

import java.util.ArrayList;
import java.util.Scanner;

public class Picking_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0; i<n; i++) {
			a[i]=sc.nextInt();
		}
		//ArrayList<Integer> subArray=new ArrayList<Integer>();
		int flag=0;
		sc.close();
		//////////////////////////////////
		for(int i=0; i<n; i++) {
			for(int j=i+1; j<n; j++) {
				if(Math.abs(a[i]-a[j])<2) {
					flag++;
				}
			}
		}
		System.out.println(flag);
	}

}
