import java.util.ResourceBundle;

public class PropertyEx {
public void showPropertyInfo() {
		
		ResourceBundle rb = ResourceBundle.getBundle("info");
		String company = rb.getString("company");
		String trainer = rb.getString("trainer");
		String greet1 = rb.getString("greet1");
		String greet2 = rb.getString("greet2");
		String greet3 = rb.getString("greet3");
		String endNote = rb.getString("endNote");
		String age=rb.getString("age");
		
		System.out.println(company);
		System.out.println(greet1);
		System.out.println(greet2);
		System.out.println(greet3);
		System.out.println(endNote);
		System.out.println(age);
	}
	
	public static void main(String[] args) {
		PropertyEx obj = new PropertyEx();
		obj.showPropertyInfo();
	}
}
