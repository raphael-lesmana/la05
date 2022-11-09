package Assingment;

public class Murid extends Persona {
	private final String status;

	public Murid(String nama, String address, String phone_number, String email_address, String status) {
		super(nama, address, phone_number, email_address);
		this.status = status;
	}

	public String getStatus() {
		return status;
	}
	
}
