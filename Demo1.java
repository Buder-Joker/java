package 排序;

import java.util.Arrays;
import java.util.Random;

public class Demo1 {
    public static void main(String[] args) {
        int[] arr = new int[]{5,3,1,9,7,4,6,2,8};
        QuackSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void QuackSort(int[] arr){
        int start = 0;
        int end = arr.length-1;
        QuackSort(arr,start,end);
    }
    public static void QuackSort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int i = start;
        int j = end;
        //有问题，有时候排序正确，有时候错
        int index = (new Random().nextInt(end-start))+start;
        while (i!=j){
            while (arr[i]<arr[index]&&i!=j){
                i++;
            }
            while (arr[j]>arr[index]&&i!=j){
                j--;
            }
            swap(arr,i,j);
        }
        swap(arr,i,index);
        QuackSort(arr,0,i-1);
        QuackSort(arr,i+1,end);
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
