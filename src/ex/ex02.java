package ex;
import java.util.Scanner;
/* �ӤW�D�A���Fvar() ��Ƥ��~�A�A�Ϋإߤ@�� std() ��ơA�{���b�������ϥΪ̿�J���@����ư}�C����A�I�sstd()�禡�i�o��}�C���зǮt�A�S�O�`�N�A���n�u�� std() ��ƺ⵲�G�A������std()�h�I�s var() ��Ƥ���^�� std() �禡�B�z���A�Ǧ^���D�{���A�D�{���A�⵲�G�L�X�C
 * Date: 2016/11/14
 * Author: 105021026 ��ذp
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


