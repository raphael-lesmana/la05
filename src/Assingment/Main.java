package Assingment;

import java.time.LocalDateTime;

public class Main {

	public Main() {
		Persona persona = new Persona("John Doe", "Jl Nowhere, Bogor", "01251251251", "example@example.com");
		Murid murid = new Murid("Student Doe", "Jl Everywhere, Bogor", "9288819", "example2@example.com",
				"sophomore");
		Pegawai pegawai = new Pegawai("Part-time Doe", "Jl Somwehere, Bogor", "1699", "example3@example.com",
				"Secretary or something", 100000, LocalDateTime.now());
		Dosen dosen = new Dosen("Teacher Doe", "Jl. Always, Bogor", "10000", "rick_astley@example.com",
				"Teacher of things", 1000, LocalDateTime.now(), "07-17", "Lucasian Professor");
		Staff staff = new Staff("Labor Hours Doe", "Jl Rick Astley, Bogor", "123456", "help@example.com",
				"He works here", 1000, LocalDateTime.now());
		System.out.println(staff);
	}

	public static void main(String[] args) {
		new Main();
	}

}
