package Assingment;

import java.time.LocalDateTime;

public class Pegawai extends Persona {
	private String office;
	private double salary;
	private LocalDateTime tanggal_rekrut;
	public Pegawai(String nama, String address, String phone_number, String email_address, String office, double salary,
			LocalDateTime tanggal_rekrut) {
		super(nama, address, phone_number, email_address);
		this.office = office;
		this.salary = salary;
		this.tanggal_rekrut = tanggal_rekrut;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDateTime getTanggal_rekrut() {
		return tanggal_rekrut;
	}
	public void setTanggal_rekrut(LocalDateTime tanggal_rekrut) {
		this.tanggal_rekrut = tanggal_rekrut;
	}
}
