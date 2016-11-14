package ex;
import java.util.Scanner;
/* 請寫一個程式，讓使用者輸入一個整數二維陣列，建立 var2()函式 及std2()可以分別計算二維陣列的變異數與標準差，並把結果回傳到主程式印出。
 * Date: 2016/11/14
 * Author: 105021026 詹佩郡
 */
public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int a =scn.nextInt();
		int b[][]=new int[a][a];
		for(int i=0;i<a;i++){
			for(int j=0;j<a;j++){
				b[i][j]=scn.nextInt();
			}}
		System.out.println(var2(a,b));
		System.out.println(std2(var2(a,b)));
		}
	public static double var2(int x ,int [][] y){
		double M=0;
		double sum=0;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
			M+=y[i][j];
		}}
		M=M/x/x;
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
			sum+=((y[i][j]-M)*(y[i][j]-M));
		}}
		sum=sum/x/x;
		return sum;
	}
	public static double std2(double z){
		return Math.sqrt(z);
	}

}

