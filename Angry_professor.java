package solutionsHackerRank;
import java.util.*;
public class Angry_professor {
    public static void main(final String... args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();        
        String result[]=new String[t];
        int temp=0;
        while(t>0){
            int n=sc.nextInt();
            int k=sc.nextInt();
            int a[]=new int[n];
            for(int i=0; i<n; i++){
                a[i]=sc.nextInt();
            }
            int flag=0;
        for(int i=0; i<n; i++)if(a[i]<=0) flag++;
        if(flag>=k) result[temp++]="NO";        
        else result[temp++]="YES";
        t--;
        }
        for(String str:result) {
            System.out.println(str);
        }
    }
    
}
