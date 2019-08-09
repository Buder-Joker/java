package BubbleSort.leetCode;
/*
编写一个程序判断给定的数是否为丑数。

丑数就是只包含质因数 2, 3, 5 的正整数。

示例 1:

输入: 6
输出: true
解释: 6 = 2 × 3
示例 2:

输入: 8
输出: true
解释: 8 = 2 × 2 × 2
示例 3:

输入: 14
输出: false
解释: 14 不是丑数，因为它包含了另外一个质因数 7。
说明：

1 是丑数。
输入不会超过 32 位有符号整数的范围: [−231,  231 − 1]。
 */
/*
编写一段程序来查找第 n 个超级丑数。

超级丑数是指其所有质因数都是长度为 k 的质数列表 primes 中的正整数。

示例:

输入: n = 12, primes = [2,7,13,19]
输出: 32
解释: 给定长度为 4 的质数列表 primes = [2,7,13,19]，前 12 个超级丑数序列为：[1,2,4,7,8,13,14,16,19,26,28,32] 。
 */
public class leet8 {
    public static boolean isUgly(int num) {
        if(num==0){
            return false;
        }
        while (true){
            if(num%2==0){
                num=num/2;
            }else if(num%3==0){
                num=num/3;
            }else if(num%5==0){
                num=num/5;
            }
            if(num==1){
                return true;
            }
            if(num%2!=0&&num%3!=0&&num%5!=0){
                return false;
            }
        }
    }
    public static int nthSuperUglyNumber(int n, int[] primes) {
        if(n==0){
            return 0;
        }
        int count = 0;
        for(int i=1; i<=100; i++){
            while (true){
                if(i%2==0){
                    i=i/2;
                }else if(i%7==0){
                    i=i/7;
                }else if(i%13==0){
                    i=i/13;
                }else if(i%19==0){
                    i=i/19;
                }
                if(i==1){
                    count++;
                    if(count==n){
                        break;
                    }
                }
                if(n%2!=0&&n%7!=0&&n%13!=0&&n%19!=0){

                }
            }
        }return 0;
    }
    public static void main(String[] args) {
        int[] primes = new int[]{2,7,13,19};
        int n = 12;
        System.out.println(isUgly(24));
        //System.out.println(isUgly(0));
    }
}
