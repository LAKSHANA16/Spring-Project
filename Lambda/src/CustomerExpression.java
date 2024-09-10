import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class CustomerExpression {
public static void main(String[] args) {
	List<Customer1>list=new ArrayList<>();
	list.add(new Customer1(1,"Aadhya",22,"Banglore","Whirlpool Refrigerator",75000,LocalDate.of(2024, 8, 10)));
	list.add(new Customer1(2,"Nick",32,"Delhi","Vacuum Cleaner",15000,LocalDate.of(2024, 7, 15)));
	list.add(new Customer1(3,"Joe",21,"Banglore","Wardrobe",24000,LocalDate.of(2024, 6, 01)));
	list.add(new Customer1(4,"Zoya",22,"Mumbai","Coffee table",17000,LocalDate.of(2024, 5, 17)));
	list.add(new Customer1(5,"John",43,"Coimbatore","Air conditioner",23000,LocalDate.of(2024, 8, 20)));
	list.add(new Customer1(6,"Mark",30,"Kochi","T-Poy",13000,LocalDate.of(2024, 6, 25)));
	list.add(new Customer1(7,"Cathy",52,"Thane","Whirlpool Refrigerator",75000,LocalDate.of(2024, 7, 10)));
	list.add(new Customer1(8,"Goyal",37,"Pune","Recliner Sofa",19000,LocalDate.of(2024, 5, 17)));
 System.out.println("************Print Customer Details****************");
  list.forEach(x->{
	  System.out.println(x);
  });
  System.out.println("*************************************************");
  System.out.println("****************Print as per order****************");
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the order to be searched:");
  String order=sc.nextLine();
  Stream<Customer1>filter=list.stream().filter(x->x.getOrder().equalsIgnoreCase(order));
  filter.forEach(x->{
	  System.out.println(x);
  });
  System.out.println("*************************************************");
  System.out.println("****************Print as per name****************");
  System.out.println("Sort by customer name");
  Collections.sort(list,(c1,c2)->
  {
  	return c1.getName().compareTo(c2.getName());
  });
  list.forEach(x->{
  	System.out.println(x);
  });
  System.out.println("*************************************************");
  System.out.println("****************Print as per date****************");
  Collections.sort(list,(c1,c2)->
  {
  	return c1.getOrderDate().compareTo(c2.getOrderDate());
  });
  list.forEach(x->{
  	System.out.println(x);
  });
  
}
}
