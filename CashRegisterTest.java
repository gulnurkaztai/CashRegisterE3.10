/**
 * A class to test the CashRegister class.
 */

public class CashRegisterTest {

    public static void main(String[] args){
        CashRegister register = new CashRegister();
        register.recordPurchase(20.00);
        register.recordPurchase(10.00);
        register.receivePayment(50);
        register.printReceipt();
        System.out.println();
        System.out.println("Expected change is 20.00");
        System.out.println("Change: " + register.giveChange());
        System.out.println("Total sales count: " + register.getSalesCount());// expected 2
        System.out.println("Total sales: "+ register.getSalesTotal());// expected 30
    }
}
