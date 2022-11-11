/*Class for Internet*/
public class Internet extends Service{
    private  int freeData;
    private double costExtraData;
    private double saleInternet=0.30;

    public Internet(){}

    public  Internet(String name,int monthCost,int freeData, double costExtraData){
        super(name,monthCost);
        this.freeData=freeData;
        this.costExtraData=costExtraData;
    }

    public void setFreeData(int freeData) {
        this.freeData = freeData;
    }

    public void setCostEstraData(int costExtraData) {
        this.costExtraData = costExtraData;
    }

    public int getFreeData() {
        return freeData;
    }

    public double getcostExtraData() {
        return costExtraData;
    }

    public double getSaleInternet(){return saleInternet;}

    public String toString(){
    return (super.toString() +" free data: "+ freeData + " ,cost per data: "+costExtraData);
    }
}
