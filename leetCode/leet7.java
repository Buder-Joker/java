package BubbleSort.leetCode;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
给定两个数组，编写一个函数来计算它们的交集。

示例 1:

输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2,2]
示例 2:

输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [9,4]
*/
public class leet7 {
    public static int[] intersection(int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);
        ArrayList list = new ArrayList();
        int i = 0;
        int j = 0;
        if(i<a.length&&j<b.length){
            if(a[i]==b[j]){
                list.add(a[i]);
                i++;
                j++;
            }else if(a[i]>b[j]){
                j++;
            }else if(a[i]<b[j]){
                i++;
            }
        }
        int[] c = new int[list.size()];
        for(int k= 0; k<list.size(); k++){
            c[k]=(int)list.get(k);
        }
        return c;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 2, 1};
        int[] b = {2, 2};
        int[] d = intersection(a, b);
        for (int i = 0; i < d.length; i++) {
            System.out.print(d[i] + " ");
        }
    }
}
