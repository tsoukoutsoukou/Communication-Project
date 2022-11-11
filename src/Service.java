/*super class for all amenities*/

public class Service {
    private String name;
    private double monthCost;

    public Service(){}

    public  Service(String name,double monthCost){
        this.name=name;
        this.monthCost=monthCost;

    }

    private void  setName(String name){
        this.name=name;
    }

    public void setMonthCost(int monthCost) {
        this.monthCost = monthCost;
    }

    public String getName() {
        return name;
    }

    public double getMonthCost() {
        return monthCost;
    }

    public  String toString(){
        return ("name: "+name+" ,cost per manth: "+monthCost);
    }
}
