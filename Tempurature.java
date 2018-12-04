package asmt1;

public class Tempurature {
	
	double fahrenheit; //Instance variable for fahrenheit

	
	public Tempurature(double fahrenheit) { //Constructor sets this instances fahrenheit to the given double.
		this.fahrenheit = fahrenheit;
	}
	
	public void setFahrenheit(double Fahrenheit) { //Mutator function of this fahrenheit
		this.fahrenheit = Fahrenheit;
	}
	
	
	public double getFahrenheit() { //Accessor Function
		return this.fahrenheit;
	}
	
	public double getCelcius() { // Returns the celcius
		return (this.fahrenheit - 32) * 0.5556;
	}
	
	public double getKelvin() { //Returns Kelvin
		return 0.556 * (this.fahrenheit - 32) + 273;
	}
	
	
}
