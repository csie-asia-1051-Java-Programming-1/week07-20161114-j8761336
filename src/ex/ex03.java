package ex;
import java.util.Scanner;
/* �мg�@�ӵ{���A���ϥΪ̿�J�@�Ӿ�ƤG���}�C�A�إ� var2()�禡 ��std2()�i�H���O�p��G���}�C���ܲ��ƻP�зǮt�A�ç⵲�G�^�Ǩ�D�{���L�X�C
 * Date: 2016/11/14
 * Author: 105021026 ��ذp
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

