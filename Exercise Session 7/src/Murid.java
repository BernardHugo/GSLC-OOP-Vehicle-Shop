
class Murid extends Persona{
	String status;
	
	public Murid(String name, String adress, String phone, String email,
			String status) {
		super(name, adress, phone, email);
		if(status.equals("freshmen") || status.equals("sophomore") || 
				status.equals("junior") || status.equals("senior")) {
			this.status = status;
		}
	}

	@Override
	public String toString() {
		return "Nama murid: " + name + ", Alamat murid: " + adress + 
				", Nomor telepon murid: " + phone + ", Alamat email murid: " + email + 
				", Status murid: " + status;
	}
}