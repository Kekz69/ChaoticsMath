package chaotics.utility.math;

/**
 * Created by Hans on 18.04.2017.
 */
public class Vector {
    private int[] vectorArray;

    public Vector(int dim) {
        vectorArray = new int[dim > 1 ? dim : 0];
    }
}
