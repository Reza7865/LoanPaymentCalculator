package FinanceTests;

import finance.Investment;
import finance.LoanPayment;
import finance.enums.CompoundingOption;

/**
 *
 * @author rezajafar
 */

public class FinanceTests {
    
    public static void main(String[] args){
        System.out.println("LoanPayment getValue Tests");
        System.out.println("\nTest case #1: ");
        LoanPayment loan = new LoanPayment(350000, 0, 10, CompoundingOption.ANNUAL, 15);
        System.out.println("Loan Payment: " + loan.getValue());
        
        System.out.println("\n\nInvestment getValue Tests");
        System.out.println("\nTest case #1 ");
        Investment invest = new Investment(0, 100, 10, CompoundingOption.ANNUAL, 20);
        System.out.println("Investment Future Value: " + invest.getValue());
        
        System.out.println("LoanPayment print Tests");
        System.out.println("\nPrint Test case #1: \n");
        LoanPayment loan1 = new LoanPayment(350000, 50000, 10, CompoundingOption.ANNUAL, 15);
        System.out.println("Loan Payment: " + loan1.print());
        
        
        /*
        System.out.println("\nTest case #2: ");
        LoanPayment loan2 = new LoanPayment(350000, 50000, 10, CompoundingOption.SEMIANNUAL, 15);
        System.out.println("Loan Payment: " + loan2.getValue());
        
        System.out.println("LoanPayment getValue Tests");
        System.out.println("\nTest case #4: ");
        LoanPayment loan3 = new LoanPayment(350000, 50000, 10, CompoundingOption.QUARTERLY, 15);
        System.out.println("Loan Payment: " + loan3.getValue());
        
        System.out.println("LoanPayment getValue Tests");
        System.out.println("\nTest case #5: ");
        LoanPayment loan4 = new LoanPayment(350000, 50000, 10, CompoundingOption.WEEKLY, 15);
        System.out.println("Loan Payment: " + loan4.getValue());
       */
        
        
      
    }
}
