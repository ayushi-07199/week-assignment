package assignment;

import java.util.*;


public class TraineeMain {
Map<Integer,Trainee> tmap= new HashMap();

Set<CsTrainee> set1 = new HashSet<>();
Set<EcTrainee> set2 = new HashSet<>();

void runapp() {
	CsTrainee trainee1= new CsTrainee(1,"Anuj",2);
	CsTrainee trainee2= new CsTrainee(3,"Ankit",1);
	EcTrainee trainee3= new EcTrainee(3,"Ankit","ameter");
	EcTrainee trainee4= new EcTrainee(3,"Ankit","meter");
	
	
	tmap.put(trainee1.getId(),trainee1);
	tmap.put(trainee2.getId(),trainee2);
	tmap.put(trainee3.getId(),trainee3);
	tmap.put(trainee4.getId(),trainee4);
	
	for(Trainee t :tmap.values()) {
		Trainee ittrainee= (Trainee) t;
		boolean isCs=ittrainee instanceof CsTrainee;
		if(isCs) {
			set1.add((CsTrainee) ittrainee);
			
		}
		else {
			set2.add((EcTrainee) ittrainee);
		}
		
	}
	
	System.out.println("DISPLAY TRAINEES CS");
	for (CsTrainee cst: set1) {
		int id=cst.getId();
		int languages=cst.getLanguages();
		String name=cst.getName();
		System.out.println("name"+id+ "  " +"lang"+ languages+"  ");
		
	}
	
	for (EcTrainee ect: set2) {
		int id=ect.getId();
		String deviceused=ect.getdeviceused();
		String name=ect.getName();
		System.out.println("name"+name+" id"+id+ "  " +"device"+ deviceused+"  ");
		
	}
}



}
