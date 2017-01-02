package hw;
import java.util.Arrays;
import java.util.Scanner;
public class hw01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int w[]=new int[3];
		int x = scn.nextInt();w[0]=x;
		int y = scn.nextInt();w[1]=y;
		int z = scn.nextInt();w[2]=z;
		Arrays.sort(w);
		lcm(x,y,z);}
	public static void lcm(int a ,int b ,int c){
		int sum = 1;int sum1 = 1;
		for (int i = 1; i <=b; i++) {
			if (c % i == 0 && b % i == 0) {
				sum = i;
			}
		}c=b*c/sum;
		for (int i = 1; i <= a; i++) {
			if (a % i == 0 && c % i == 0) {
				sum1 = i;
			}
		}a=a*c/sum1;
		System.out.println(a);
		

		
	}

}
