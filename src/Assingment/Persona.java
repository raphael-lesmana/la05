package Assingment;

public class Persona {
	private String nama;
	private String address;
	private String phone_number;
	private String email_address;
	
	public Persona(String nama, String address, String phone_number, String email_address) {
		this.nama = nama;
		this.address = address;
		this.phone_number = phone_number;
		this.email_address = email_address;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getEmail_address() {
		return email_address;
	}
	public void setEmail_address(String email_address) {
		this.email_address = email_address;
	}
	public Persona() {
		// TODO Auto-generated constructor stub
	}

}
