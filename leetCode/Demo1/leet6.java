package BubbleSort.leetCode;
/*
在显示着数字的坏计算器上，我们可以执行以下两种操作：
双倍（Double）：将显示屏上的数字乘 2；
递减（Decrement）：将显示屏上的数字减 1 。
最初，计算器显示数字 X。
返回显示数字 Y 所需的最小操作数。
示例 1：
输入：X = 2, Y = 3
输出：2
解释：先进行双倍运算，然后再进行递减运算 {2 -> 4 -> 3}.
示例 2：

输入：X = 5, Y = 8
输出：2
解释：先递减，再双倍 {5 -> 4 -> 8}.
示例 3：
输入：X = 3, Y = 10
输出：3
解释：先双倍，然后递减，再双倍 {3 -> 6 -> 5 -> 10}.
示例 4：
输入：X = 1024, Y = 1
输出：1023
解释：执行递减运算 1023 次
 */

import java.util.Scanner;

public class leet6 {
    public static int brokenCalc(int x, int y) {
        int count = 0;
        if(x==y){
            return 0;
        }else{
            while(x!=y){
                if(x>y){
                    return count+(x-y);
                }else{
                    if(y%2==0){
                        y=y/2;
                        count++;
                    }else{
                        y++;
                        count++;
                    }
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println(brokenCalc(x,y));
    }
}