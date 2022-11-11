
import java.util.HashMap;

public class Contract {
    private int id;
    private String codeService;
    private  String serviceName;
    private Client client;
    private String date;
    private boolean extraSale;
    private double extraSaleprice;
    private HashMap<String,Statistics> statistics=new HashMap<>(); /* add one object per month*/

    public Contract(){}
    public Contract(String serviceName,String codeService,Client client,String date,boolean extraSale, double extraSaleprice,HashMap<String,Statistics> statistics){
        this.id= Catalogos.increaseId();
        this.codeService=codeService;
        this.serviceName=serviceName;
        this.client=client;
        this.date=date;
        this.extraSaleprice=extraSaleprice;
        this.extraSale=extraSale;
        this.statistics.putAll(statistics);
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCodeService(String codeService) {
        this.codeService = codeService;
    }

    public void setServiceName(String serviceName){
        this.serviceName=serviceName;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setExtraSale(boolean extraSale) {
        this.extraSale = extraSale;
    }

    public void setExtraSalepricePer(double extraSaleprice) {
        this.extraSaleprice = extraSaleprice;
    }

    public void setStatistics(HashMap<String,Statistics> statistics) {
            this.statistics.putAll(statistics);

    }

    @Override
    public String toString() {
        return "id=" + id +", codeService='" + codeService + ", serviceName='" + serviceName + ", client=" + client + ", date='" + date  + ", extraSale=" + extraSale + ", extraSaleprice=" + extraSaleprice + ", statistics=" + statistics;
    }

    public String getServiceName() {
        return serviceName;
    }

    public Client getClient() {
        return client;
    }
    public String getDate() {
        return date;
    }

    public boolean isExtraCost() {
        return extraSale;
    }

    public HashMap<String,Statistics> getStatistics() {
        return statistics;
    }

    public int getId() {
        return id;
    }

    public String getCodeService() {
        return codeService;
    }

    public double calculateCost(Statistics st){
        Service service=Catalogos.services.get(serviceName);
        double cost=service.getMonthCost();
        double sms, minuteswireness,minuteswire;
        if(service instanceof  MobileOperation){
            MobileOperation mobileOperation=(MobileOperation)service;
            StatisticsMobile statisticsMobile=(StatisticsMobile)st;
            sms=mobileOperation.getSMSfree()-statisticsMobile.getSMS();
            minuteswire=mobileOperation.getCallMinutesfreeWire()-statisticsMobile.getMinutesLandLinePhone();
            minuteswireness=mobileOperation.getCallMinutesfreeWireness()-statisticsMobile.getMinutesMobile();
            if(sms>0){ cost+=sms*mobileOperation.getextraCostSMS();}
            if(minuteswire>0){cost+=minuteswire*mobileOperation.getextraCostCallWire();}
            if(minuteswireness>0){cost+=minuteswireness*mobileOperation.getCallMinutesfreeWireness();}
            if(service instanceof CardConnection){
                CardConnection cardConnection=(CardConnection) service;
                cost+=cardConnection.getMonthrest();
                cost=cost*cardConnection.getSaleCard();
            }
            if(service instanceof LinkConnection){
                LinkConnection linkConnection=(LinkConnection) service;
                cost=cost*linkConnection.getSaleLink();
            }
        }
        else{
            Internet internet=(Internet) service;
            StatisticsInternet statisticsInternet=(StatisticsInternet) st;
            double data=internet.getFreeData()-statisticsInternet.getDatabytes();
            if(data>0){
                cost+=data*internet.getcostExtraData();
                cost=cost*internet.getSaleInternet();
            }
        }
        if(extraSale){
            cost=cost*extraSaleprice;
        }
        return cost;
    }


}
