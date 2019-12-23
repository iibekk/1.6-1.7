public class R3Vector {
    private double x, y, z;

    public R3Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public R3Vector() throws Exception {
        x = Scanner.inputDouble("x -> ");
        y = Scanner.inputDouble("y -> ");
        z = Scanner.inputDouble("z -> ");
    }

    public static R3Vector plus(R3Vector a, R3Vector b) {
        return new R3Vector(a.x + b.x, a.y + b.y, a.z + b.z);
    }

    public static R3Vector minus(R3Vector a, R3Vector b) {
        return new R3Vector(a.x - b.x, a.y - b.y, a.z - b.z);
    }

    public static R3Vector mult(R3Vector a, double k) {
        return new R3Vector(k * a.x, k * a.y, k* a.z);
    }

    public static double product(R3Vector a, R3Vector b) {
        return a.x * b.x + a.y * b.y + a.z * b.z;
    }

    public static R3Vector vectors(R3Vector a, R3Vector b) {
        return new R3Vector( a.y + b.z - b.y - a.z, a.x + b.z - b.x - a.z, a.x + b.y - b.x - a.y);
    }

    public static double mixed(R3Vector a, R3Vector b, R3Vector c) {
        return (a.x * b.y * c.z) + (c.x * a.y * b.z) + (b.x * c.y * a.z) - (c.x * b.y * a.z) - (b.x * a.y * c.z) - (a.x * c.y * b.z);
    }
}