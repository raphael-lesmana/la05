package Assingment;

import java.time.LocalDateTime;

public class Dosen extends Pegawai {
	private String office_hours;
	private String jabatan_akademik;
	public Dosen(String nama, String address, String phone_number, String email_address, String office, double salary,
			LocalDateTime tanggal_rekrut, String office_hours, String jabatan_akademik) {
		super(nama, address, phone_number, email_address, office, salary, tanggal_rekrut);
		this.office_hours = office_hours;
		this.jabatan_akademik = jabatan_akademik;
	}
	public String getOffice_hours() {
		return office_hours;
	}
	public void setOffice_hours(String office_hours) {
		this.office_hours = office_hours;
	}
	public String getJabatan_akademik() {
		return jabatan_akademik;
	}
	public void setJabatan_akademik(String jabatan_akademik) {
		this.jabatan_akademik = jabatan_akademik;
	}
}
