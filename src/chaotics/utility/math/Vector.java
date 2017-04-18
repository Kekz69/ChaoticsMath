package chaotics.utility.math;

/**
 * Created by Hans on 18.04.2017.
 */
public class Vector {
    private double[] vectorArray;

    public Vector(int dim) {
        vectorArray = new double[dim > 1 ? dim : 0];
    }

    public void set(int index, double value) {
        vectorArray[index] = value;
    }
}
