
import java.time.LocalDate;

class Dosen extends Pegawai{
	String officeHours;
	String academic;
	
	public Dosen(String name, String adress, String phone, String email,
			String office, int salary, LocalDate recruitDate, String officeHours, String academic) {
		super(name, adress, phone, email, office, salary, recruitDate);
		this.officeHours = officeHours;
		this.academic = academic;
	}

	@Override
	public String toString() {
		return "Nama dosen: " + name + ", Alamat dosen: " + adress + 
				", Nomor telepon dosen: " + phone + ", Alamat email dosen: " + email +  
				", Kantor dosen: " + office + ", Gaji dosen: Rp " + salary + 
				", Tanggal dosen direkrut: " + recruitDate + ", Jam kantor dosen: " + officeHours + 
				", Jabatan akademik dosen: " + academic;
	}
}