package Assingment;

import java.time.LocalDateTime;

public class Main {

	public Main() {
		Persona persona = new Persona("John Doe", "696969696", "Jl Nowhere, Bogor", "example@example.com");
		Murid murid = new Murid("Student Doe", "69696969", "Jl Everywhere, Bogor", "example2@example.com",
				"sophomore");
		Pegawai pegawai = new Pegawai("Part-time Doe", "1699", "Jl Somwehere, Bogor", "example3@example.com",
				"Secretary or something", 100000, LocalDateTime.now());
		Dosen dosen = new Dosen("Teacher Doe", "10000", "Jl. Always, Bogor", "rick_astley@example.com",
				"Teacher of things", 1000, LocalDateTime.now(), "07-17", "Lucasian Professor");
		Staff staff = new Staff("Labor Hours Doe", "123456", "Jl Rick Astley, Bogor", "help@example.com",
				"Wonder Boy", 1000, LocalDateTime.now());
		System.out.println(staff);
	}

	public static void main(String[] args) {
		new Main();
	}

}
