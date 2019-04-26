package com.aca;

public class WinProductTest {
	
	private WinProduct prod;

	public static void main(String[] args) {
	
	/*	WinProduct prod1 = WinProduct.DISH;
		WinProduct prod2 = WinProduct.HSI;
		
		printEnum(prod1);
		
		printEnum(prod2);
	*/

		for (WinProduct p :WinProduct.values()){
			System.out.println("WinProduct values: " + p);
		}
		String s = "HSiI";
		WinProduct w2;
		try {
			w2 = WinProduct.valueOf(s);
		} catch (Exception e) {
			w2 = WinProduct.DISH;
		}
		
		System.out.println(w2);
	}
	
	public static void printEnum(WinProduct winProduct){
		System.out.println("winProdict: " + winProduct.getItemNumber());
	}

}
