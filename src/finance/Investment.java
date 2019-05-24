package finance;
import finance.enums.CompoundingOption;
/**
 *
 * @author rezajafar
 */


public class Investment extends TVMEngine {

    public Investment(){
        super();
    }
    
    public Investment(double initialInvestment,  
                      double periodicPayment,
                      double interestRate, 
                      CompoundingOption compounding,
                      double yearsInvested){
        super(yearsInvested, interestRate, compounding, initialInvestment, periodicPayment, 0);
    }
    
    public void setInitialInvestment (double initialInvestment){
        setPV(initialInvestment);
    }
    public void setPeriodicInvestment (double periodicPayment){
       setPMT(periodicPayment);
    }
    public double getInitialInvestment () {
        return getPV();
    }
    public double getPeriodicInvestment (){
        return getPMT();
    }
    

    @Override
        public String getValue () {
            return toCurrency(-calcFV());
            
     }

    @Override
    public String print () {
        return null;
    }

}