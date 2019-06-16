import java.lang.Math;

public class Pythagorean {
    public double calculateHypotenuse(int legA, int legB) {

    	double hypto = Math.sqrt((legA*legA)+(legB*legB));
    	return hypto;
    }
}