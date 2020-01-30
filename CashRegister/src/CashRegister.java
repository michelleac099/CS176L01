
public class CashRegister {

	   private double payment;
	   private double purchase;
	   
	   public CashRegister()
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
		   return purchase - payment;
	   }
	
	
}//class
