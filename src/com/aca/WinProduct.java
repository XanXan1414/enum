package com.aca;

public enum WinProduct { DISH(1), HSI(2), DirecTV(3);

	private int itemNumber;
	
	private WinProduct(int itemNumber){
		this.itemNumber = itemNumber;
	}

	public int getItemNumber() {
		return itemNumber;
	}
	

}
