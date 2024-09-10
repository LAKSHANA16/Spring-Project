import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class Expression {

	public static void main(String[] args) {
		List<Customer>customer = new ArrayList<>();
		customer.add(new Customer(1, "Aadhya", "Banglore", 54000,LocalDate.of(1985, 4, 12)));
		customer.add(new Customer(2, "Zoya", "Mumbai", 75000, LocalDate.of(1990, 3, 22)));
        customer.add(new Customer(3, "Charlie", "Delhi", 82000, LocalDate.of(1980, 7, 15)));
        customer.add(new Customer(4, "David", "Kolkata", 70000, LocalDate.of(1992, 10, 10)));
        customer.add(new Customer(5, "Rachel", "Delhi", 85000, LocalDate.of(1987, 12, 1)));
        customer.add(new Customer(6, "Frank", "Bangalore", 78000, LocalDate.of(1988, 5, 20)));
        customer.add(new Customer(7, "Grace", "Delhi", 67000, LocalDate.of(1991, 8, 9)));
        customer.add(new Customer(8, "Goyal", "Mumbai", 95000, LocalDate.of(1983, 11, 25)));
        customer.add(new Customer(9, "Rahul", "Chennai", 71000, LocalDate.of(1986, 9, 18)));
        customer.add(new Customer(10, "Jack", "Delhi", 92000, LocalDate.of(1995, 6, 14)));
        
        System.out.println("Display the customer record:");
        customer.forEach(x->{
        	System.out.println(x);
        });
        System.out.println("--------------------------------------------------------");
        System.out.println("Customers with premium greater than 80000");
        Stream<Customer>filter1=customer.stream().filter(x->x.getPremium()>80000);
        filter1.forEach(x->{
        	System.out.println(x);
        });
        System.out.println("--------------------------------------------------------");
        System.out.println("Customersfrom delhi");
        Stream<Customer>filter2=customer.stream().filter(x->x.getCity().equalsIgnoreCase("Delhi"));
        filter2.forEach(x->{
        	System.out.println(x);
        });
        System.out.println("--------------------------------------------------------");
        System.out.println("Sort by customer name");
        Collections.sort(customer,(c1,c2)->
        {
        	return c1.getCustName().compareTo(c2.getCustName());
        });
        customer.forEach(x->{
        	System.out.println(x);
        });
        System.out.println("--------------------------------------------------------");
        System.out.println("Customers sorted by dateOfBirth:");
        customer.stream()
                 .sorted((c1, c2) -> c1.dateOfBirth.compareTo(c2.dateOfBirth))
                 .forEach(System.out::println);
	}
}
