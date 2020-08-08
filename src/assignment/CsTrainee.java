package assignment;

public class CsTrainee extends Trainee {
 private int languages;
 
 
 
 public CsTrainee(int id,String name,int languages) {
	 super(id,name);
	 this.languages=languages;
 }
 
 public CsTrainee() {
	this(00,"",00);
 }

public int getLanguages() {
	return languages;
}

public void setLanguages(int languages) {
	this.languages = languages;
}
 
 
 
}
