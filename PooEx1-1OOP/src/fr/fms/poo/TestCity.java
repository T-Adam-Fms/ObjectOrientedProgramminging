package fr.fms.poo;

public class TestCity {

	public static void main(String[] args) {
		City tarbes = new City("Tarbes", "France", 50000);
		City toulouse = new City("Toulouse", "France", 400000);
		City paris = new City("Paris", "France", 2000000);
	
		System.out.println(tarbes.name + " " +tarbes.country +" " + tarbes.population );
		System.out.println(toulouse.name + " " +toulouse.country +" " + toulouse.population );
		System.out.println(paris.name + " " +paris.country +" " + paris.population );
		
		toulouse.population += 20000;
		System.out.println(toulouse.name + " " +toulouse.country +" " + toulouse.population );
	}
	
}

