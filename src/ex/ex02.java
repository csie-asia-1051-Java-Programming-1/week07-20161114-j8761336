package ex;
import java.util.Scanner;
/* 承上題，除了var() 函數之外，再用建立一個 std() 函數，程式在接收完使用者輸入的一維整數陣列之後，呼叫std()函式可得到陣列的標準差，特別注意，不要只用 std() 函數算結果，必須由std()去呼叫 var() 函數之後回到 std() 函式處理完再傳回給主程式，主程式再把結果印出。
 * Date: 2016/11/14
 * Author: 105021026 詹佩郡
 */
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b[] = new int[a];
		for (int i = 0; i < a; i++) {
			b[i] = scn.nextInt();
		}
		System.out.print(std(var(a, b)));
	}
	public static double var(int n,int[] x){
		double M=0;
		double sum=0;
		for(int i=0;i<n;i++){
			M +=x[i];
		}
		M=M/n;
		for(int i=0;i<n;i++){
			sum+=((x[i]-M)*(x[i]-M));
		}
		sum=sum/n;
		return sum;
	}
	public static double std(double y){
		return Math.sqrt(y);
	}
	}


