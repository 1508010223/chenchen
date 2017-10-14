/**
 * 
 */
package 递归;
import java.util.Scanner;
/**     
 * Simple to Introduction    
 * @ProjectName:  [递归]   
 * @Package:      [递归]    
 * @ClassName:    [min]     
 * @Description:  [一句话描述该类的功能]     
 * @Author:       [admin]     
 * @CreateDate:   [2017年9月23日 下午8:38:46]     
 * @UpdateUser:   [admin]     
 * @UpdateDate:   [2017年9月23日 下午8:38:46]     
 * @UpdateRemark: [说明本次修改内容]    
 * @Version:      [v1.0]   
 *      
 */
public class min {
	private static int n;//方阵的行和列
	private static int[][] a;//保存方阵的值
	private static int number=1;//填充的数字
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
		if(size==0)//最后一圈只剩下一个元素
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
	//向上
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
