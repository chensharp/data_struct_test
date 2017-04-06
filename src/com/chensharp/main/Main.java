package com.chensharp.main;

import com.chensharp.stack.*;

/**
 * 测试主类
 * @author chen
 *
 */
class Main {
	
	
	/*
	 * 主函数
	 */
	public static void main(String[] args ) {
		System.out.println("测试");
		
		
		conversion(1025,2);
		
	}
	
	/**
	 * 数制转换
	 * @param num 10进制数
	 * @param n 进制 2,8,16
	 */
	public static void conversion(int num,int n){
		SqStack<Integer> sq = new SqStack<Integer>();
		while (num>0) {
			sq.Push(num%n);
			num = num/n;
		}
		while (sq.GetTop()!=null) {
			System.out.print(sq.Pop());
		}
	}
	
	
}
