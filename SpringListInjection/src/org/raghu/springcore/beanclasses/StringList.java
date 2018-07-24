package org.raghu.springcore.beanclasses;

import java.util.List;

public class StringList
{
	List<String> l1;
	List<Integer> l2;
	public List<String> getL1() {
		System.out.println("String Elements"+l1.toString());
		return l1;
	}
	public void setL1(List<String> l1) {
		
		this.l1 = l1;
	}
	public List<Integer> getL2() {
		System.out.println("Integer Elements"+l2.toString());
		return l2;
	}
	public void setL2(List<Integer> l2) {
		
		this.l2 = l2;
	}
	

}
