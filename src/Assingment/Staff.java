package Assingment;

import java.time.LocalDateTime;

public class Staff extends Pegawai {
	public Staff(String nama, String address, String phone_number, String email_address, String office, double salary,
			LocalDateTime tanggal_rekrut) {
		super(nama, address, phone_number, email_address, office, salary, tanggal_rekrut);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return this.getNama();
	}
}
