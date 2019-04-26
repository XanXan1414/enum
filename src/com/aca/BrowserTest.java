package com.aca;

public class BrowserTest {
	
	public enum BrowserType { Chrome("google"),internetExplorer("microsoft"), Firefox("uh yep");
		
		private String owner;
		
		private BrowserType(String owner){
			this.owner = owner;
		}

		public String getOwner() {
			return owner;
		}
		
	}
	
	public static void main(String[] args) {
		BrowserTest bt = new BrowserTest();
		bt.demo();
		bt.displayEnum(BrowserType.Chrome);

	}

	private void demo() {
		
	for(BrowserType t : BrowserType.values() ){
		System.out.println("BT Values: " + t);
	}
	for(BrowserType t : BrowserType.values() ){
		System.out.println("BT Values: " + t + " "+ t.getOwner());
	}
		
	}
	
	private void displayEnum(BrowserType tt){
		switch(tt){
		case internetExplorer:
			System.out.println("no");
			break;
		case Chrome:
			System.out.println("yes");
			break;
		case Firefox:
			System.out.println("also no");
			break;
		
		}
	}

}
