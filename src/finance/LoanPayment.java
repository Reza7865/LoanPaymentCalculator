package finance;

import finance.enums.CompoundingOption;


/**
 *
 * @author rezajafar
 */
public class LoanPayment extends TVMEngine {
 
    private double purchaseAmount;
    private double downPayment;

    public LoanPayment () {

    }


    public LoanPayment(double purchaseAmount, 
                       double downPayment,
                       double interestRate, CompoundingOption compounding, 
                       double loanDuration){
        super();
        this.purchaseAmount = purchaseAmount;
        this.downPayment = downPayment;
        setAPR(interestRate);
        setCompounding(compounding);
        setYears(loanDuration);
        setPV(purchaseAmount - downPayment);
        setFV(0);
        setPMT(0);

    }

    public void setPurchase(double purchaseAmount) {

    }

    public void setDownPayment(double downPayment) {

    }

    public double getPurchaseAmount() {
        return purchaseAmount;
    }
    public double getDownPaymentt() {
        return downPayment;
    }

    @Override
        public String getValue () {
            return toCurrency(-calcPMT());
        }

    @Override
    public String print (){
        String compounding = getCompounding().toString().toLowerCase();
        String output = "Loan Payment Summary" +
                        "\nPurchase Amount: " + toCurrency(getPurchaseAmount()) +
                        "\nDown Payment: " + toCurrency(getDownPaymentt()) +
                        "\nAmount Financed" + toCurrency(getPV()) +
                        "\nAPR: " + getAPR() + 
                        "\nCompounding: " + compounding +
                        "\nLoan Duration (years): " + getYears() +
                        "\nPayment (" + compounding + "): " + getValue();
        return output;
    }
    
}