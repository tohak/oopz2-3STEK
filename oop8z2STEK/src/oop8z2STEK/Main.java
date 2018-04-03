package oop8z2STEK;

public class Main {

	public static void main(String[] args) {
		Test a = new Test(10);
		Class b = a.getClass();

		int c = 20;
		String d = "object test";
		CheckClass blackList = new CheckClass();
		blackList.addClass(b);
//dobalenie object
		Stek arrayOne = new Stek();
		arrayOne.addObject(c, blackList);
		arrayOne.addObject(d, blackList);
		arrayOne.addObject(a, blackList);		
		System.out.println(arrayOne);
		//pull object s verhywki i vivod
		String dTho=(String) arrayOne.pullLast();
	System.out.println(dTho);
		//dobavlene ewe object
	for (int i = 0; i < 10; i++) {
		arrayOne.addObject(c, blackList);
	}
	//pull object from index
	int cTho=(int) arrayOne.pullIndex(5);
System.out.println(cTho);
	}
		
}
