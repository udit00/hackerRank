package solutionsHackerRank;

import java.util.Scanner;

public class Insertion_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int array[]=new int[n];
		for(int i=0; i<n; i++){
			array[i]=sc.nextInt();
		}
		sc.close();
		////////////////////////////////
		
		for(int i=n-1; i>0; i--) {
			
				int key=array[i];
				int j=i-1;
				while(j>=0 && array[j] > key) {
					array[j+1]=array[j];
					j-=1;
					for(int i1=0; i1<n; i1++){
	                 System.out.print(array[i1]);
					}
	                System.out.println();
				}
				array[j+1]=key;
			
		}
		for(int i1=0; i1<n; i1++){
            System.out.print(array[i1]);
			}
		
		
		
		
		
		
		////////////////////////////////
		/**/
		
	}
}


