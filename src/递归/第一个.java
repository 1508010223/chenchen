/**
 * 
 */
package 递归;

/**     
 * Simple to Introduction    
 * @ProjectName:  [递归]   
 * @Package:      [递归]    
 * @ClassName:    [第一个]     
 * @Description:  [一句话描述该类的功能]     
 * @Author:       [马敏]     
 * @CreateDate:   [2017年9月23日 下午8:41:40]     
 *      
 */
public class 第一个 {
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
