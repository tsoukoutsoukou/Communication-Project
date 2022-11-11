public class CardConnection  extends  MobileOperation{
    private int monthrest;
    private   double saleCard=0.25;
    public  CardConnection(){
        super();
    }
    public CardConnection(String name,int monthCost,int callSecondfreeWire,int callSecondfreeWireness, int SMSfree,double extraCostCallWire,double extraCostCallWireness, double extraCostSMS,int monthrest){
        super(name,monthCost,callSecondfreeWire,callSecondfreeWireness,SMSfree,extraCostCallWire,extraCostCallWireness, extraCostSMS);
        this.monthrest=monthrest;
    }

    public int getMonthrest() {
        return monthrest;
    }

    public void setMonthrest(int monthrest) {
        this.monthrest = monthrest;
    }

    public double getSaleCard(){return saleCard;}
    public String toString(){
        return ( super.toString() +" rest month: "+monthrest);
    }
}
