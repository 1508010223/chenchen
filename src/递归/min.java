/**
 * 
 */
package �ݹ�;
import java.util.Scanner;
/**     
 * Simple to Introduction    
 * @ProjectName:  [�ݹ�]   
 * @Package:      [�ݹ�]    
 * @ClassName:    [min]     
 * @Description:  [һ�仰��������Ĺ���]     
 * @Author:       [admin]     
 * @CreateDate:   [2017��9��23�� ����8:38:46]     
 * @UpdateUser:   [admin]     
 * @UpdateDate:   [2017��9��23�� ����8:38:46]     
 * @UpdateRemark: [˵�������޸�����]    
 * @Version:      [v1.0]   
 *      
 */
public class min {
	private static int n;//������к���
	private static int[][] a;//���淽���ֵ
	private static int number=1;//��������
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	a=new int[n][n];
	f(0,n-1);
	for(int i=0;i<n;i++)
	{
	for(int j=0;j<n;j++)
	{
	System.out.printf("%4d",a[i][j]);
	}
	System.out.println();
	}
	}
	public static void f(int begin,int size)
	{
		if(size<0)
	return;
		if(size==0)//���һȦֻʣ��һ��Ԫ��
			{
			a[begin][begin]=number;
			return;
	}
		int h=begin,l=begin;
		for(int i=1;i<=size;i++)
		{
			a[h][l]=number;
			number++;
			h++;
	}
		for(int i=1;i<=size;i++)
		{
			a[h][l]=number;
			number++;
	l++;
	}
	//����
		for(int i=1;i<=size;i++)
	{
			a[h][l]=number;
			number++;
			h--;
	}
		for(int i=1;i<=size;i++)
		{
			a[h][l]=number;
			number++;
			l--;
			}
		f(l+1,size-2);
		}
}
