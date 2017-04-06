package com.chensharp.stack;

/*
 *     //调用示例
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
 * 我的Stack类，线性栈，
 * @author chen
 *
 */
public class SqStack<T> {
	private T[] elem;//数组名
	private int top;  //栈顶指针
	private int base; //栈底指针，为空时为null
	private int stacksize;//栈长度
	private int stackIncrement;//栈增长长度

    public SqStack( ) {  
    	initStack();
    }  
	
	/**
	 * 构造一个空栈
	 */
	@SuppressWarnings("unchecked")
	public int initStack() {
		stacksize = 200;//初始为500
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
	 * 弹出一个
	 */
	public T Pop() {
		if (top == base) {
			return null;
		}else{
			return elem[--top];
		}
	}
	
	/**
	 * 压栈
	 */
	@SuppressWarnings("unchecked")
	public int Push(T t) {
		if ( (top - base)>= stacksize  ) {//满了
			T[] newelem = (T[]) new Object[stacksize+stackIncrement];
			for (int i = 0; i < elem.length; i++) {
				elem[i]= newelem[i];
			}
			elem = newelem;
			System.out.println("new heap memo");
			if (elem == null ) {//失败
				return 0;
			}
			base = 0;
			stacksize+=stackIncrement;
		}
		elem[top++] = t;
		return 1;
	}
	
	/**
	 * 得到栈顶元素，为空，返回null
	 */
	public T GetTop() {
		if (top == base ) {
			return null;
		}else {
			return elem[top-1];
		}
		
	}
	
	/**
	 * 清空栈
	 */
	public int ClearStack() {
		
		return initStack();
	}
	
	/**
	 * 栈信息
	 */
	private void StackInfoPrint() {
		System.out.println("stacksize="+stacksize+" top="+this.top+" base="+this.base);
		
	}

	
}
