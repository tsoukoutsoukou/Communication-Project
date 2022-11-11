import java.text.SimpleDateFormat;
import java.util.*;

public class Catalogos {
    /*Statics value*/
    public static  int id=0;


    /*help us to complete fields*/
    public static  String[] firstname={"Eleni", "Dimitra", "Thenia","Dimitris", "Katerina","Giorgos"};
    public static  String[] lastName={"Delis","Koutsoukos","Papadopoulos","Manikas"};
    public static  String[] pay={"visa card","cash"};

    public static HashMap<String,Service> services=new HashMap<>();
    public static HashMap<Integer,Contract> contract=new HashMap<>();
    static Scanner scanner=new Scanner(System.in);

    /*this method increase id for each new contract*/
    public static int increaseId(){
        return id++;
    }
    /*this method generate all Services, 2 for each type*/
    public static HashMap<String,Service> catalogoServies(){
        services.put("A",new LinkConnection("A",getRandomNumberInRange(10,25),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100));
        services.put("B",new LinkConnection("B",getRandomNumberInRange(10,25),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100));
        services.put("C",new CardConnection("C",getRandomNumberInRange(10,25),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100, getRandomNumberInRange(50,150)));
        services.put("D",new CardConnection("D",getRandomNumberInRange(10,25),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),getRandomNumberInRange(50,150),(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100,(double) getRandomNumberInRange(50,150)/100, getRandomNumberInRange(50,150)));
        services.put("E",new Internet("E",getRandomNumberInRange(10,25),1000,0.10));
        services.put("F",new Internet("F",getRandomNumberInRange(10,25),1500,0.25));
        System.out.println("size: "+services.size());
        return services;
    }
    /*this method help us to  complete some fields*/
    static int getRandomNumberInRange(int min, int max) {
        if (min >= max) { throw new IllegalArgumentException("max must be greater than min"); }
        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

    /*create contract catalogo*/
    public static HashMap<Integer,Contract> catalogoContract(){
        int i=0;
        Contract c=null;
        for(Service serv:services.values()) {
            HashMap<String,Statistics> st=new HashMap<>();
            Random rd = new Random(); // creating Random object
            /*help us to  complete the phone*/
            String phone="2753031"+getRandomNumberInRange(0,999);
            if(phone.length()<10){
                while (phone.length()<10){
                    phone=phone+0;
                }
            }
            double extraSalePrice=0.0;
            boolean  extraSale =rd.nextBoolean();
            if(extraSale){
                extraSalePrice=(double) getRandomNumberInRange(20,90)/100;
            }
            c=new Contract(serv.getName(),services.get(serv.getName()).getName(),makeClient(),CurrentDateTimeExample2(),extraSale,extraSalePrice,st);
            if(serv instanceof  MobileOperation){
                c.getStatistics().put(c.getDate(),new StatisticsMobile(c.getDate()));
                System.out.println(c.getStatistics().get(c.getDate()));
            }
            else{
                c.getStatistics().put(c.getDate(),new StatisticsInternet(c.getDate()));
            }
            contract.put(id,c);
        }
        return contract;
    }
    /*give the date*/
    public static String CurrentDateTimeExample2() {
            SimpleDateFormat formatter = new SimpleDateFormat("MM/yyyy");
            Date date = new Date();
            return (formatter.format(date));
    }
    public static boolean getRandomBoolean() {
            return Math.random() < 0.5;
    }

    public static Client makeClient() {
        Random rd = new Random(); // creating Random object
        /*help us to  complete the phone*/
        String phone="2753031"+getRandomNumberInRange(0,999);
        if(phone.length()<10){
            while (phone.length()<10){
                phone=phone+0;
            }
        }
        Client client=new Client(lastName[getRandomNumberInRange(0,lastName.length-1)],firstname[getRandomNumberInRange(0,firstname.length-1)],phone,pay[getRandomNumberInRange(0,pay.length-1)]);
        return client;
    }

}
