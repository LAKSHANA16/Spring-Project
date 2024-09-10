import java.io.*;
import java.time.LocalDate;
import java.util.*;
public class Customer {
	int custId; 
	String custName;
    String city;
    double premium;
    LocalDate dateOfBirth;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getPremium() {
		return premium;
	}
	public void setPremium(double premium) {
		this.premium = premium;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public Customer(int custId, String custName, String city, double premium, LocalDate dateOfBirth) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.city = city;
		this.premium = premium;
		this.dateOfBirth = dateOfBirth;
	}
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", city=" + city + ", premium=" + premium
				+ ", dateOfBirth=" + dateOfBirth + "]";
	}
    
}
