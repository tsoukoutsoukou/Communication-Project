public class StatisticsMobile extends  Statistics {
    private double minutesMobile;
    private double minutesLandLinePhone;
    private int SMS;

    public  StatisticsMobile(String monthYear){super(monthYear);}

    public StatisticsMobile(String month, double minutesMobile,double minutesLandLinePhone,int SMS){
        super(month);
        this.minutesMobile=minutesMobile;
        this.minutesLandLinePhone=minutesLandLinePhone;
        this.SMS=SMS;
    }


    public void setMinutesMobile(double minutesMobile) {
        this.minutesMobile = minutesMobile;
    }

    public void setMinitesLandLinePhone(double minutesLandLinePhone) {
        this.minutesLandLinePhone = minutesLandLinePhone;
    }

    public void setSMS(int SMS) {
        this.SMS = SMS;
    }


    public double getMinutesMobile() {
        return minutesMobile;
    }

    public double getMinutesLandLinePhone() {
        return minutesLandLinePhone;
    }

    public int getSMS() {
        return SMS;
    }

    public void setStatistics(double wirecall,double wirenesscall,int sms){
        setMinutesMobile(wirecall);
        setMinitesLandLinePhone(wirenesscall);
        setSMS(sms);
    }


    public String toString(){
        return super.toString()+" ,minutes mobile:"+minutesMobile + " ,minutes wire: "+minutesLandLinePhone +" ,SMS: "+SMS;
    }

}
