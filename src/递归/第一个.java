/**
 * 
 */
package �ݹ�;

/**     
 * Simple to Introduction    
 * @ProjectName:  [�ݹ�]   
 * @Package:      [�ݹ�]    
 * @ClassName:    [��һ��]     
 * @Description:  [һ�仰��������Ĺ���]     
 * @Author:       [����]     
 * @CreateDate:   [2017��9��23�� ����8:41:40]     
 *      
 */
public class ��һ�� {
	public static void main(String[]args){
		printX(1237);
	}
	public static void printX(int n){
		System.out.println("X="+n);
		if(n<5000)
			printX(2*n);
		else {
			printx(n/2);
		}
	}
private static void printx(int n){
	if(n>=1237){
		System.out.println("x="+n);
		printx(n/2);
	}
}
}
