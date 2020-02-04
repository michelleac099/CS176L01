
public class CashRegisterV2 {

	   private double payment;
	   private double purchase;
	   
	   public CashRegisterV2()
	   {
		   purchase = 0;
		   payment = 0;
	   }
	   
	   public void recordPurchase(double sale)
	   {   
		   purchase = purchase + sale;
	   }
		  
	   public void receivePayment(double amount)
	   {
		   payment = amount;
	   }
	   
	   public double giveChange()
	   {
		   return payment - purchase;
	   }
	
	   public void calcDiscount(final double DISCOUNT, final double MINIMUMPURCHASE)
	   {
		   double discountAmount = purchase*DISCOUNT;
		   double finalAmount = purchase-discountAmount;
		   if(purchase>MINIMUMPURCHASE) {
			   System.out.println("Your total purchases were $" + purchase + " and because you spent over $" + MINIMUMPURCHASE + ", you are entitled to a " + DISCOUNT*100 + "% discount of $" + discountAmount + ", reducting your balance to $" + finalAmount);
		   	   purchase = finalAmount;}
	   }
}//class