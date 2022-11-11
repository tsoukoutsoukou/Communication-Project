import java.util.HashMap;
import java.util.Scanner;


public class Amenity {
    public static Scanner scanner=new Scanner(System.in);


    public static void createNewContract(HashMap<Integer, Contract> contracts, HashMap<String,Service> services){
        ShowServices(services);
        System.out.println("you choose what you desire.............");
        String namePackage = scanner.next();
        Service s=services.get(namePackage);
        String service, lastname ,firstname,phone,pay;
        System.out.println("Please enter your lastname");
        lastname=scanner.next();
        System.out.println("Please enter your firstname");
        firstname=scanner.next();
        System.out.println("Please enter your phone");
        phone=scanner.next();
        System.out.println("Visa card or cash");
        pay=scanner.next();
        Client client=new Client(lastname,firstname,phone,pay);
        System.out.println("It does reqeust for extra sale");
        boolean extraSale = Catalogos.getRandomBoolean();
        double extraSalepricePer = 0.0;
        if (extraSale) {
            extraSalepricePer = (double) Catalogos.getRandomNumberInRange(20, 90) / 100;
        }
        HashMap<String ,Statistics> hash=new HashMap<>();
        System.out.println(s.getClass().getName()+namePackage+client.toString()+extraSale+extraSalepricePer);
        Contract contract=new Contract(s.getClass().getName(),namePackage,client, Catalogos.CurrentDateTimeExample2(),extraSale,extraSalepricePer,hash);
        System.out.println(contract.getServiceName()+ contract.getCodeService());
        System.out.println(contracts.size());
        contracts.put(Catalogos.id,contract);

    }


    public static void ShowServices(HashMap<String,Service> services){
        System.out.println("if you want to see all service choose 1" + "\n" + "if you want to see only Link service choose 2" + "\n" + "if you want to see Card Connection service choose 3" + "\n" + "if you want to Internet service choose 4" + "\n" + "if you want to exit choose 0");
        int choose = scanner.nextInt();
        if (choose == 0) {
            return;
        }
        if (choose == 1) {
            for (Service s : services.values()) {
                System.out.println(s.toString());
            }
        }
        if (choose == 2) {
            for (Service s : services.values()) {
                if (s instanceof LinkConnection)
                    System.out.println(s.toString());
                    //System.out.println(s.toString());
            }
        }
        if (choose == 3) {
            for (Service s : services.values()) {
                if (s instanceof CardConnection)
                    System.out.println(s.toString());
            }
        }
        if (choose == 4) {
            for (Service s : services.values()) {
                if (s instanceof Internet)
                    System.out.println(s.toString());
            }
        }
    }


    public static void ShowContracts(HashMap<Integer,Contract> contracts){
     for(Contract contract:contracts.values()) {
         System.out.println(contract.toString());
     }
    }

}
