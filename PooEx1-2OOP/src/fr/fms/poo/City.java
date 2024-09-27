package fr.fms.poo;


public class City {
		private String cityName;
		private String countryName;
		private int cityPopulation;
	
	
	public City (String cityName, String countryName,int cityPopulation){	
		this.cityName= cityName;
		this.countryName= countryName;
		setCityPopulation(cityPopulation);
		}
		
	public String getCityName(){
		return cityName;
	}
	
	public String getCountryName() {
		return countryName;
	}
	
	public int getCityPopulation() {
		return cityPopulation;
	}
	
	public void setCityName(String cityName) {
		if (cityName != null && !cityName.isEmpty()) {
            this.cityName = cityName;
        } else {
            System.out.println("City name cannot be null or empty.");
        }
	}
	
	public void setCountryName(String countryName) {
		 if (countryName != null && !countryName.isEmpty()) {
	            this.countryName = countryName;
	        } else {
	            System.out.println("Country name cannot be null or empty.");
	        }
	}
	
	public void setCityPopulation(int cityPopulation) {
		if (cityPopulation>= 0) {
		this.cityPopulation = cityPopulation;
	}else {
        System.out.println("cityPopulation cannot be negative.");
    }

	
    }

    // Display method to show city details
    public void displayCity() {
        System.out.println("City: " + cityName + ", Country: " + countryName + ", Population: " + cityPopulation);
    }

}



//public class City {
//		String cityName;
//		String countryName;
//		int cityPopulation;
//	
//	
//	public City (String cityName, String countryName,int cityPopulation){	
//		this.cityName= cityName;
//		this.countryName= countryName;
//		this.cityPopulation= cityPopulation;
//		}
//		
//	public void town(){
//		System.out.println ("city name: " + "\t" +cityName +"\t" + "country:  " + "\t"+ countryName +"\t" + "  population:  " + "\t"+ cityPopulation);
//		}
//}
