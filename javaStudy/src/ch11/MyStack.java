package ch11;

import java.util.*;

class MyStack extends Vector{
	public Object push(Object item) {
		addElement(item);
		return item;
	}
	public Object pop() {
		Object obj = peek();
		removeElementAt(size()-1);
		return obj;
	}
	public Object peek() {
		int len = size();
		if(len == 0)
			throw new EmptyStackException();
		return elementAt(len - 1);	//마지막 요소 반환
	}
	public boolean empty() {
		return size() == 0;
	}
	public int search(Object o) {
		int i = lastIndexOf(o); //끝에서 부터 객체 찾기
		if(i >= 0) { //객체 찾은경우
			return size() -i;
		}
		return -1;
	}
}

