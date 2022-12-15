
public class Persona {
	public String name;
	public String adress;
	public String phone;
	public String email;

	public Persona(String name, String adress, String phone, String email) {
		super();
		this.name = name;
		this.adress = adress;
		this.phone = phone;
		if(email.endsWith("@gmail.com")) {
			this.email = email;
		}
	}
	
	public String toString() {
		return "Nama persona: " + name + ", Alamat persona: " + adress + 
				", Nomor telepon persona: " + phone + ", Alamat email persona: " + email;
	}
}
