public class Statistics {
    private  String monthYear;

    public Statistics(String monthYear){
        this.monthYear=monthYear;
    }

    public void setMonth(String month) {
        this.monthYear = monthYear;
    }

    public String getMonth() {
        return monthYear;
    }

    public String toString(){
        return  "month: "+ monthYear;
    }
    
    public void setStatistics(double wirecall,double wirenesscall,int sms){}

    public void setStatistics( double databytes){}

    public void setStatistics(){}
}

