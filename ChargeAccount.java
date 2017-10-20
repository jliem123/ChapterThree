// ***************************************************************
//   ChargeAccount.java
//
//   Caclulates the minimum payment needed, when given a previous balance, additional charges, and interest.
// ***************************************************************
 
import java.util.Scanner;
import java.text.NumberFormat;
 
public class ChargeAccount {
   public static void main (String[] args)
   {
           double newBalance;  
           double prevBalance;
           double addCharges;
           double prevInterest;
           double interest = 0;
           double minPayment = 0;
           String rating;             
 
           Scanner scan = new Scanner(System.in);
 
           System.out.print ("Enter previous balance: ");
           prevBalance = scan.nextDouble();
           
           System.out.print ("Enter additional charges: ");
           addCharges = scan.nextDouble();
           
           System.out.print ("Enter previous interest: ");
           prevInterest = scan.nextDouble();
           
           if (prevInterest > 0) {
               interest = ((prevBalance + addCharges) * 0.02);
            }
           
           else {
               if (prevInterest == 0) {
                   interest = 0;
                }
            }
 
           newBalance = (prevBalance + addCharges + interest);
           
           if (newBalance < 50) {
             minPayment = newBalance;  
            }
            else if (newBalance > 50 && newBalance < 300) {
                minPayment = 50;
            }
            else if (newBalance > 300) {
                minPayment = (newBalance * 0.2);
            }
 
           // Print the results
           NumberFormat money = NumberFormat.getCurrencyInstance();
           System.out.println();
           System.out.println("CS CARD International Statement");
           System.out.println("===============================");
           System.out.println("Previous balance: " + money.format(prevBalance));
           System.out.println("Additional Charges: " + money.format(addCharges));
           System.out.println();
           System.out.println("New Balance: " + money.format(newBalance));
           System.out.println();
           System.out.println("Minimum Payment: " + money.format(minPayment));
           System.out.println();
        }
    }