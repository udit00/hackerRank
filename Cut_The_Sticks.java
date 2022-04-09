package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static int[] shortestStick(List<Integer> ar){
        int shortest = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<ar.size(); i++){
            if(ar.get(i)<shortest && ar.get(i)>0) {
                shortest=ar.get(i);
                index = i;
            }
        }
        if(shortest==Integer.MAX_VALUE) shortest = 0;
        return new int[]{index, shortest};
    }
    public static List<Integer> cut(List<Integer> ar, int index, int len){
        int counter = 0;
        List<Integer> toReturn = new ArrayList<Integer>();
        for(int i=0; i<ar.size(); i++){
            toReturn.add(0);
            if(ar.get(i)!=0){
                counter++;
                int element = ar.get(i)-len;
                if(element<0) element = 0;
                toReturn.set(i, element);
            }
        }
        toReturn.set(index, counter);
        return toReturn;
    }
    public static List<Integer> cutTheSticks(List<Integer> arr) {
        List<Integer> sticksCut = new ArrayList<>();
        int[] a = shortestStick(arr);
        while(a[1]!=0){
            arr = cut(arr, a[0], a[1]);
            sticksCut.add(arr.get(a[0]));
            arr.set(a[0], 0);
            a = shortestStick(arr);
        }
        return sticksCut;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int tLength = sc.nextInt();
        List<Integer> arr=new ArrayList<>();
        for(int i=0; i<tLength; i++){
            arr.add(sc.nextInt());
        }
        List<Integer> result = cutTheSticks(arr);
        for(Integer x:result)
            System.out.println(x);
    }
}
