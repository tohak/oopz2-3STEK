package oop8z2STEK;

import java.util.Arrays;

public class Stek implements Cloneable{
	private Object[] stek;	

	public Stek() {
		stek=new Object[0];
	}

	public Object[] getStek() {
		return stek;
	}

	public void setStek(Object[] stek) {
		this.stek = stek;
	}

	public void addObject(Object object,CheckClass blackList) {
		boolean test=false;
		test=blackList.check(object);
		
		if (test==true) {
			System.out.println("dont add Object to Stek, you  object: "+object.getClass()+" in black list ");
		}else {
			Object []temp=new Object[stek.length+1];
			System.arraycopy(stek, 0, temp, 0, stek.length);
			temp[temp.length-1]=object;
			stek=temp;
			
		}
	}
	
	public Object pullIndex(int index) {
		if (stek[index]==null|| stek.length<index||index<0) {
			System.out.println("dont pull, negative index");
		}else {			
			Object temp=stek[index];
			deleteNull(index);
			return temp;
			
		}
		return null;
	}
	
	public void deleteNull(int indexDelete){
		for (int i = indexDelete; i < stek.length-1; i++) {
			stek[i]=stek[i+1];			
		}
		stek=Arrays.copyOf(stek, stek.length-1);
		
	}
	public Object pullLast() {
		
		return stek[stek.length-1];
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder sb=new StringBuilder();
		for (Object object : stek) {
			if (object!=null) {
				sb.append(object);
				sb.append(System.lineSeparator());
			}
		}
		return sb.toString();
	}

	@Override
	public Object clone() throws CloneNotSupportedException {		
		return super.clone();
	}

	
	

	
	
	

}
