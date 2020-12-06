
public class Booleans {

	public static void main(String[] args) {
	// 2)
	 boolean isHotOutside = true;
	 	if (isHotOutside == true) {
	 	System.out.println("It's scorching out"); 
	 	}
	 
	 boolean isWeekday = true;
	 	if (isWeekday == true) {
	 	System.out.println("It's the Weekend");
	 	}
	 	
	 boolean hasMoneyInPocket= true;
		if (hasMoneyInPocket == true) 
			System.out.println("I can pay for that");
	 // 3)	
 	 double costOfMilk = 3.99;
 	 	System.out.println("The cost of milk is $" + costOfMilk);
	 
 	 int moneyInWallet = 20;
 	 	System.out.println("I have $" + moneyInWallet + " in my wallet");
 	 
 	 int thirstLevel = 4;
 		System.out.println("On a thirst level of 1-10 scale I'm a " + thirstLevel);
	 
 	
 	// 4)	
 	 boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
 	 	System.out.println(shouldBuyIceCream);
 	 	
 	 boolean willGoSwimming = isHotOutside && !isWeekday;
 	  	System.out.println(!willGoSwimming);
 	  	
 	 boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
 	 	System.out.println(!isAGoodDay);
 	 	
 	 boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= (2 * costOfMilk);
 	 	System.out.println(willBuyMilk);
  }	 	
}
