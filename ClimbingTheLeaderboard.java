import java.util.ArrayList;
import java.util.Scanner;

public class Climbing_The_Leaderboard {
   public int BinarySearch(int arr[],int first,int last,int key) {
    if(last>=first) {
         int mid = first + (last-first)/2;  
         if(arr[mid]==key) {
             return mid;
         }
         if(arr[mid]>key) {
             return BinarySearch(arr,first,mid-1,key);
         }
         if(arr[mid]<key) {
             return BinarySearch(arr,mid+1,last,key);
         }        
    }
    return -1;    
   }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int score[]=new int[n];
        ArrayList<Integer> pos=new ArrayList<Integer>();
        int temp=1;
        pos.add(temp);
        for(int i=0; i<n; i++) {
            score[i]=sc.nextInt();
        }
        int m=sc.nextInt();
        int alice[]=new int[m];
        for(int i=0; i<m; i++) alice[i]=sc.nextInt();
        sc.close();
        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=1; i<n; i++) {
            if(i>0 && score[i-1]>score[i]) pos.add(++temp);
            else pos.add(temp);
        }
        for(int i=0; i<m; i++) {
            if(alice[i]<score[n-1]) {
                result.add(pos.get(n-1)+1);
                continue;
            }
            for(int j=0; j<n; j++) {
                if(alice[i]>=score[j]) {
                    result.add(pos.get(j));
                    break;
                }
            }    
        }
        for(int i:result)
        System.out.println(i);
        
    }
}