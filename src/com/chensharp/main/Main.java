package com.chensharp.main;

import com.chensharp.stack.*;

/**
 * ��������
 * @author chen
 *
 */
class Main {
	
	
	/*
	 * ������
	 */
	public static void main(String[] args ) {
		System.out.println("����");
		
		
		conversion(1025,2);
		
	}
	
	/**
	 * ����ת��
	 * @param num 10������
	 * @param n ���� 2,8,16
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
