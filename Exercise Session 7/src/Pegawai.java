
import java.time.LocalDate;

class Pegawai extends Persona{
	String office;
	int salary;
	LocalDate recruitDate;

	public Pegawai(String name, String adress, String phone, String email,
			String office, int salary, LocalDate recruitDate) {
		super(name, adress, phone, email);
		if(office.equals("Anggrek") || office.equals("Syahdan") || office.equals("Kijang") || 
				office.equals("Bekasi") || office.equals("Alam Sutra") || office.equals("Bandung") || 
				office.equals("Malang")) {
			this.office = office;
		}
		this.salary = salary;
		this.recruitDate = recruitDate;
	}
	
	@Override
	public String toString() {
		return "Nama pegawai: " + name + ", Alamat pegawai: " + adress + 
				", Nomor telepon pegawai: " + phone + ", Alamat email pegawai: " + email + 
				", Kantor pegawai: " + office + ", Gaji pegawai: Rp " + salary + 
				", Tanggal pegawai direkrut: " + recruitDate;
	}
}