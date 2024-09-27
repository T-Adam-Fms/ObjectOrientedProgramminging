package Exo2;

public class TestCity {
	public static void main(String[] args) {
		City tarbes = new City("Tarbes","France",40000);
		City toulouse = new City("Toulouse","France",450000);
		City paris = new City("Paris","France",2000000);
	
		System.out.println(tarbes.getName() + " " + tarbes.getCountry() + " " + tarbes.getPopulation());
		System.out.println(toulouse.getName() + " " + toulouse.getCountry() + " " + toulouse.getPopulation());
		System.out.println(paris.getName() + " " + paris.getCountry() + " " + paris.getPopulation());

		toulouse.setName("Tolosa");
		toulouse.setPopulation(-200);

		System.out.println(toulouse.getName() + " " + toulouse.getCountry() + " "+ toulouse.getPopulation());
	}
}
