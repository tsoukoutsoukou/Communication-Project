import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        HashMap<String,Service> services= Catalogos.catalogoServies();
        HashMap<Integer,Contract> contracts= Catalogos.catalogoContract();
        for(Contract contract:contracts.values()){
            System.out.println(contract.getStatistics().toString());
        }
        while (true) {
            System.out.println("if you want to see services choose 1 " + "\n" + "if you want to create a new contract choose 2" + "\n" + "if you want to see all contract choose 3" + "\n" + "if you want to exit choose 0" + "\n"+"if you want to set Statistics choose 4 ");
            Scanner scanner = new Scanner(System.in);
            int choose = scanner.nextInt();
            if (choose == 0) {
                break;
            } else if (choose == 1) {
                Amenity.ShowServices(services);
            } else if (choose == 2) {
                Amenity.createNewContract(contracts,services);
            }
            else if(choose==3){
               Amenity.ShowContracts(contracts);
            }
            else if(choose==4){
                Amenity.ShowContracts(contracts);
                System.out.println("Choose service which you want to set statistic");
                int contracrId=scanner.nextInt();
                Contract contract= contracts.get(contracrId);
                Service service=services.get(contract.getCodeService());
                if(service instanceof MobileOperation){
                    for(Statistics st :contract.getStatistics().values()){
                        System.out.println(st);
                    }
                    System.out.println("enter the month");
                    String month=scanner.next();
                    System.out.println("Enter minutes for wirecall ,for wirenesscall and how many sms sent");
                    double wirecall=scanner.nextDouble();
                    double wirenesscall=scanner.nextDouble();
                    int sms=scanner.nextInt();
                    contract.getStatistics().get(month).setStatistics(wirecall,wirecall,sms);

                }
                else if(service instanceof Internet){
                   for(Statistics st :contract.getStatistics().values()){
                       System.out.println(st);
                   }
                   System.out.println("enter the month");
                   String month=scanner.next();
                   System.out.println("Enter databytes");
                   double databytes=scanner.nextInt();
                    contract.getStatistics().get(month).setStatistics(databytes);
                   System.out.println(contract.getStatistics().get(month) instanceof StatisticsInternet);
                }
                else{System.out.println("Don't exist this service");}
            }
            System.out.println("------------------------------");
            }
    }
}
