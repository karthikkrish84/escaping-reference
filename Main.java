import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        CustomerRecords records=new CustomerRecords();
        records.addCustomer(new Customer("Karthik"));
        records.addCustomer(new Customer("Bharathi"));
        Map<String, Customer> customers = records.getCustomers();
       //customers.clear();
        for(Customer c:customers.values()){
            System.out.println(c.getName());
        }

//        for(String s:customers.keySet()){
//            System.out.println(s);
//        }
//        Iterator<Customer> iterator = records.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
    }
}
