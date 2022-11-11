public class LinkConnection extends MobileOperation{
    private double saleLink=0.2;
    public  LinkConnection(){
        super();
    }
    public  LinkConnection(String name,int monthCost, int callSecondfreeWire,int callSecondfreeWireness, int SMSfree,double extraCostCallWire,double extraCostCallWireness, double extraCostSMS){
        super(name,monthCost, callSecondfreeWire,callSecondfreeWireness, SMSfree,extraCostCallWire,extraCostCallWireness, extraCostSMS);
    }
    public double getSaleLink(){return saleLink;}
    public String toString(){
        return (super.toString());
    }
}
