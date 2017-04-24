package chaotics.utility.math;

/**
 * Created by Hans on 18.04.2017.
 */
public class Vector {
    private int dim;
    private double[] vectorArray;

    public Vector(int dim) {
        this.dim = dim;
        vectorArray = new double[dim > 1 ? dim : 2];
    }

    public void set(int index, double value) {
        vectorArray[index] = value;
    }

    public void set(double[] newVectorArray) {
       // vectorArray = newVectorArray;
        dim = vectorArray.length;
    }
}
