package BubbleSort.leetCode;

import java.util.Arrays;

/*
假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。对每个孩子 i ，都有一个胃口值
gi ，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j ，都有一个尺寸 sj 。如果 sj >= gi ，我们可以将这个
饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。
注意：
你可以假设胃口值为正。
一个小朋友最多只能拥有一块饼干。
示例 1:
输入: [1,2,3], [1,1]
输出: 1
解释:
你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
所以你应该输出1。
示例 2:
输入: [1,2], [1,2,3]
输出: 2
解释:
你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
你拥有的饼干数量和尺寸都足以让所有孩子满足。
所以你应该输出2.
 */
public class leet5 {
    public static int findContentChildren(int[] g, int[] s) {
        /*int t = 0;
        for(int i=0; i<g.length; i++){
            for(int j=0; j<g.length-i-1; j++){
                if(g[j]>g[j+1]){
                    t=g[j];
                    g[j] = g[j+1];
                    g[j+1]=t;
                }
            }
        }
        for(int i=0; i<s.length; i++){
            for(int j=0; j<s.length-i-1; j++){
                if(s[j]>s[j+1]){
                    t=s[j];
                    s[j] = s[j+1];
                    s[j+1]=t;
                }
            }
        }*/
        Arrays.sort(g);
        Arrays.sort(s);
        int count = 0;
        int i= 0;
        int j = 0;
        while(i<s.length&&j<g.length){
            if(s[i]>=g[j]){
               count++;
               i++;
               j++;
            }else{
                i++;
            }

        }
        return count;
    }

    public static void main(String[] args) {
        int[] g = new int[]{10,8,7,9};
        int[] s = new int[]{5,7,8,6};
        System.out.println(findContentChildren(g,s));
    }
}
