
import java.time.LocalDate;

public class Main{
	public static void main(String[] args) {
		Persona p = new Persona("Bernard Hugo", "Jakarta", "087754622", "bernardhugo@gmail.com");
		
		Murid m = new Murid("Bernard Hugo", "Jakarta", "083478911", "bernardhugo@gmail.com", "junior");
		
		Pegawai pe = new Pegawai("Jonathan", "Jakarta", "08968966", "jonathan@gmail.com", "Anggrek", 
				4000000, LocalDate.of(2019, 1, 13));
		
		Dosen d = new Dosen("Abdul Mulia", "Jakarta", "08531477", "abdulmulia@gmail.com", "Syahdan", 
				5500000, LocalDate.of(2020, 6, 25), "09.00 WIB - 15.00 WIB", "Lektor");
		
		Staff s = new Staff("Edho", "Jakarta", "08658934", "edho@gmail.com", "Bekasi", 3000000,
				LocalDate.now(), "Saya bekerja sebagai staff di Binus University"); 
		
		// Output Persona
		System.out.println(p);
		System.out.println();
		
		// Output Murid
		System.out.println(m);
		System.out.println();
		
		// Output Pegawai
		System.out.println(pe);
		System.out.println();
		
		// Output Dosen
		System.out.println(d);
		System.out.println();
		
		// Output Staff
		System.out.println(s);
		System.out.println();
	}
}

