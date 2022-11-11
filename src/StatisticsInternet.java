import java.util.Scanner;

public class StatisticsInternet extends Statistics {
    private double databytes;

    public StatisticsInternet(String monthYear){
        super(monthYear);
    }
    public StatisticsInternet(String monthYear, double databytes){
        super(monthYear);
        this.databytes=databytes;
    }

    public void setDatabytes(double databytes) {
        this.databytes = databytes;
    }

    public double getDatabytes() {
        return databytes;
    }

    public void setStatistics(double databytes){
        setDatabytes(databytes);
    }

    public String toString(){
        return (super.toString()+" ,data: "+databytes);
    }

}
