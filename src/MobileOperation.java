public class MobileOperation  extends  Service{
    private int callMinutesfreeWire;
    private int callMinutesfreeWireness;
    private int SMSfree;
    //all costs are per seconds
    private  double extraCostCallWire;
    private double extraCostCallWireness;
    private  double extraCostSMS;

    public  MobileOperation() {
        super();
    }

    public MobileOperation(String name,double monthCost,int callMinutesfreeWire,int callMinutesfreeWireness, int SMSfree,double extraCostCallWire,double extraCostCallWireness, double extraCostSMS){
        super(name, monthCost);
        this.callMinutesfreeWireness=callMinutesfreeWireness;
        this.callMinutesfreeWire=callMinutesfreeWireness;
        this.SMSfree=SMSfree;
        this.extraCostCallWire=extraCostCallWire;
        this.extraCostCallWireness=extraCostCallWireness;
        this.extraCostSMS=extraCostSMS;
    }

    public void setCallMinutesfreeWire(int callSecondfreeWire) {
        this.callMinutesfreeWire = callMinutesfreeWire;
    }

    public void setCallMinutesfreeWireness(int callSecondMinuteseeWireness) {
        this.callMinutesfreeWireness = callMinutesfreeWireness;
    }
    public void setextraCostSMS(double extraCostSMS) {
        this.extraCostSMS = extraCostSMS;
    }

    public void setextraCostCallWire(double extraCostCallWire) {
        this.extraCostCallWire=extraCostCallWire;
    }
     public void setextraCostCallWireness(double extraCostCallWireness) {
        this.extraCostCallWireness=extraCostCallWireness;
    }

    public void setSMSfree(int SMSfree) {
        this.SMSfree = SMSfree;
    }

    public int getCallMinutesfreeWire() {
        return callMinutesfreeWire;
    }

    public int getCallMinutesfreeWireness(){return callMinutesfreeWireness;}

    public double getextraCostSMS() {
        return extraCostSMS;
    }

    public int getSMSfree() {
        return SMSfree;
    }

    public double getextraCostCallWire() {
        return extraCostCallWire;
    }

    public double getextraCostCallWireness(){return extraCostCallWireness;}

    public String toString(){
        return (super.toString() +" free time for wire: "+ callMinutesfreeWire  +" free time for wireness: "+ callMinutesfreeWireness+ ", free SMS :"+ SMSfree +" ,cost per call to wire: "+ extraCostCallWire+ " ,cost per call to wireness: "+ extraCostCallWireness +" ,cost per SMS: "+extraCostSMS);
    }
}
