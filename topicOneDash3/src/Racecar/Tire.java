package Racecar;

public class Tire {
	  private int pressure;

	    /**
	     * Constructs a new Tire object with the specified pressure.
	     * @param pressure the initial pressure of the tire, in psi.
	     */
	    public Tire() {
	    	this.pressure = 0;
	    }
	    public Tire(int pressure) {
	        this.pressure = pressure;
	    }

	    /**
	     * Gets the current pressure of the tire.
	     * @return the pressure of the tire, in psi.
	     */
	    public int getPressure() {
	        return pressure;
	    }

	    /**
	     * Inflates the tire to the specified pressure.
	     * @param pressure the target pressure to inflate the tire to, in psi.
	     */
	    public void inflate(int pressure) {
	        this.pressure = pressure;
	        System.out.println("Tire pressure is now " + pressure + " psi.");
	    }
}
