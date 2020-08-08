package assignment;

public class EcTrainee extends Trainee {
	private String deviceused;
	 
	 
	 
	 public EcTrainee(int id, String name,String deviceused) {
		 super (id,name);
		 this.deviceused=deviceused;
	 }
	 
	 public EcTrainee() {
		this(00,"","");
	 }

	public String getdeviceused() {
		return deviceused;
	}

	public void setLanguages(String deviceused) {
		this.deviceused = deviceused;
	}
	 
}
