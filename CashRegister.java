/**
 * A cash register totals up sales and computes change due.
 */

public class CashRegister{

    private double purchase;
    private double payment;
    private String priceString = "";
    private double salesTotal;
    private int salesCount;

    /**
     * Constructs a cash register with no money in it.
     */
    public CashRegister(){
        this.purchase = 0;
        this.payment = 0;
        this.salesTotal = 0;
        this.salesCount = 0;
    }

    /**
     * Records the sale of an item.
     * @param amount the price of an item.
     */
    public void recordPurchase(double amount){
        this.purchase += amount;
        this.priceString = priceString.concat(String.valueOf(amount)+" ");
        this.salesCount++;
    }

    /**
     * Process a payment received from the customer.
     * @param amount the amount of the payment.
     */

    public void receivePayment(double amount){
        this.payment += amount;
        this.salesTotal += this.purchase;
    }

    /**
     * Computes the change due and resets the machine for the next customer. 
     * @return the change due to the customer.
     */

    public double giveChange(){

        double change = this.payment - this.purchase;
        this.payment = 0;
        this.purchase = 0;
        return change;
    }

    public void printReceipt(){
        System.out.println("Prices of the items purchased are: " + priceString);
        System.out.print("Total due is: "+ this.purchase);
    }

    public double getSalesTotal(){
        return this.salesTotal;

    }

    public int getSalesCount(){
        return this.salesCount;
    }
}