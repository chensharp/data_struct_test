package com.chensharp.stack;

/*
 *     //����ʾ��
 * 
 * SqStack<Integer> sq = new SqStack<Integer>();
		for (int i = 0; i < 300; i++) {
			int k =sq.Push(Integer.valueOf(i));
			
		}
		//sq.Push(1);
		//sq.Push(2);
		System.out.println(" "+sq.Pop());
		System.out.println(" "+sq.Pop());
 * 
 * 
 * 
 */

/**
 * �ҵ�Stack�࣬����ջ��
 * @author chen
 *
 */
public class SqStack<T> {
	private T[] elem;//������
	private int top;  //ջ��ָ��
	private int base; //ջ��ָ�룬Ϊ��ʱΪnull
	private int stacksize;//ջ����
	private int stackIncrement;//ջ��������

    public SqStack( ) {  
    	initStack();
    }  
	
	/**
	 * ����һ����ջ
	 */
	@SuppressWarnings("unchecked")
	public int initStack() {
		stacksize = 200;//��ʼΪ500
		stackIncrement = 100;
		//elem = (T[]) Array.newInstance(type, stacksize); 
		elem = (T[]) new Object[stacksize];
		if (elem != null ) {
			base = 0;
			top = base;
			return 1;
		}else {
			return 0;
		}
	}
	
	/**
	 * ����һ��
	 */
	public T Pop() {
		if (top == base) {
			return null;
		}else{
			return elem[--top];
		}
	}
	
	/**
	 * ѹջ
	 */
	@SuppressWarnings("unchecked")
	public int Push(T t) {
		if ( (top - base)>= stacksize  ) {//����
			T[] newelem = (T[]) new Object[stacksize+stackIncrement];
			for (int i = 0; i < elem.length; i++) {
				elem[i]= newelem[i];
			}
			elem = newelem;
			System.out.println("new heap memo");
			if (elem == null ) {//ʧ��
				return 0;
			}
			base = 0;
			stacksize+=stackIncrement;
		}
		elem[top++] = t;
		return 1;
	}
	
	/**
	 * �õ�ջ��Ԫ�أ�Ϊ�գ�����null
	 */
	public T GetTop() {
		if (top == base ) {
			return null;
		}else {
			return elem[top-1];
		}
		
	}
	
	/**
	 * ���ջ
	 */
	public int ClearStack() {
		
		return initStack();
	}
	
	/**
	 * ջ��Ϣ
	 */
	private void StackInfoPrint() {
		System.out.println("stacksize="+stacksize+" top="+this.top+" base="+this.base);
		
	}

	
}
