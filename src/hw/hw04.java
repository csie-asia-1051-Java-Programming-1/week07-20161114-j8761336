package hw;
import java.util.Scanner;
public class hw04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn =new Scanner(System.in);
		int m=scn.nextInt();
		int n=scn.nextInt();
		gcd(m,n);
	}
	public static void gcd(int x,int y){
		if(x>y){
			int s=0;
			s=y;y=x;x=s;
		}
		int sum=0;
		for(int i=1;i<=x;i++){
			if(x%i==0 && y%i==0){
				sum=i;
			}
		}
		System.out.println(sum);
	}

}
