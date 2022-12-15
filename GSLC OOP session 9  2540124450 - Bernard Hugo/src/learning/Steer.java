package learning;

// Interface untuk memberikan lampu sen dan memutar roda pengemudi kendaraan
public interface Steer{
	public void turn(String direction, int degree);
	public void lampSign(int type);
}