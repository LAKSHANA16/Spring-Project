import java.time.LocalDate;

public class Customer1 {
int id;
String name;
int age;
String location;
String order;
double price;
LocalDate orderDate;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getOrder() {
	return order;
}
public void setOrder(String order) {
	this.order = order;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}
public LocalDate getOrderDate() {
	return orderDate;
}
public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}
public Customer1(int id, String name, int age, String location, String order, double price, LocalDate orderDate) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.location = location;
	this.order = order;
	this.price = price;
	this.orderDate = orderDate;
}
public Customer1() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Customer1 [id=" + id + ", name=" + name + ", age=" + age + ", location=" + location + ", order=" + order
			+ ", price=" + price + ", orderDate=" + orderDate + "]";
}

}
