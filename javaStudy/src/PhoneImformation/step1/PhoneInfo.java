package PhoneImformation.step1;

public class PhoneInfo {
	String name;
	String phoneNumber;
	String email;
	
	public PhoneInfo(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	public PhoneInfo(String name, String phoneNumber, String email) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	public void showInfo() {
		System.out.println("Name: "+name);
		System.out.println("PhoneNumber: "+phoneNumber);
		if(email != null)
			System.out.println("Email: "+email);
		System.out.println("----------------------------------");
	}
	
	
}
