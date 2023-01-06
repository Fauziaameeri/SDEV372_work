package making_changes;

public class point {
    private double x;
    private double y;
    private double z;

    public point(double x, double y, double z){

        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public String toString() {
        return "point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }
}
