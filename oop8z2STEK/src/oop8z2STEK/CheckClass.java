package oop8z2STEK;

import java.util.Arrays;

public class CheckClass {
	private Class[] arrayClass;	

	public CheckClass() {
		this.arrayClass=new Class[0];
	}
	public void addClass(Class clas) {
		Class [] temp=new Class[arrayClass.length+1];
		System.arraycopy(arrayClass, 0, temp, 0, arrayClass.length);
		temp[temp.length-1]=clas;
		arrayClass=temp;
	}
	
	public boolean check(Object obj) {
		
		for (int i = 0; i < arrayClass.length; i++) {
			if (arrayClass[i]==obj.getClass()) {
				return true;
			}
		}
		
		return false;
		
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Class clas : arrayClass) {
			if (clas!= null) {
				sb.append(clas);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();

	}
}
