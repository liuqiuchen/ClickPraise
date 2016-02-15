package com.clickpraise;
import java.util.Scanner;//导入java.util.Scanner类
/**
 *刷赞系统（用户输入自己的目前的赞数，
 *如果小于100个赞，系统会自动添加到100赞，并告诉用户增加了几个赞）
 *1.导入java.util.Scanner工具类
 *2.创建Scanner对象
 *3.接收并保存用户输入的值
 * print()和println()的区别：println输出信息后会换行，而print不会换行
 * */
public class MyClickPraise {
	public static void main(String[] arg){		
		int endPraise = 100;//保存最终的赞数
		int count = 0;//记录加了几次
		
		//创建Scanner对象input
		Scanner input = new Scanner(System.in);
		System.out.print("请输入您的赞数：");//提示用户输入原本的赞数
		/* print()输出信息后不会换行 */
		int myPraise = input.nextInt();//获取用户输入的赞数
		
		//打印出原先的赞数
		System.out.println("原先的赞数为：" + myPraise + "个");
		
		while(myPraise < endPraise){
			myPraise++;
			count++;
		}
		
		//打印出加完后的赞数
		System.out.println("增加后的赞数为：" + myPraise + "个");
		//打印出增加了几次
		System.out.println("增加了" + count + "次");
	}
}
