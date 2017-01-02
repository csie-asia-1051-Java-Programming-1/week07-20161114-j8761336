package hw;
import java.util.Scanner;
public class hw03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		System.out.println(C(m,n));
	}
	public static int C(int x,int y){
		int m1=1;int n1=1;int mn1=1;int sum=0;
		for(int i=1;i<=x;i++){
			m1*=i;
		}
		for(int i=1;i<=y;i++){
			n1*=i;
		}
		for(int i=1;i<=x-y;i++){
			mn1*=i;
		}
		sum=m1/n1/mn1;
		return sum;
		
	}
}
