package Tasks.Lesson_2.Task_2;

public class Vector {
    private double x, y, z;

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Vector() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    public double getX(){
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vector{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    public double getLength() {
        return Math.sqrt(x*x  + y*y + z*z);
    }

    public double getScalarMulti(Vector vec) {
        return x*vec.getX() + y*vec.getY() + z*vec.getZ();
    }

    public Vector getVectorMulti(Vector vec) {
        Vector result = new Vector();
        result.setX(y*vec.getZ() - z*vec.getY());
        result.setY(z*vec.getX() - x*vec.getZ());
        result.setZ(x*vec.getY() - y*vec.getX());

        return result;
    }

    public double getAngle(Vector vec) {
        double norm1 = getLength();
        double norm2 = vec.getLength();
        double scalar = getScalarMulti(vec);
        return Math.toDegrees(Math.acos(scalar / (norm1 * norm2)));
    }

    public Vector getVectorSum(Vector vec) {
        Vector result = new Vector();
        result.setX(x + vec.getX());
        result.setY(y + vec.getY());
        result.setZ(z + vec.getZ());

        return result;
    }

    public Vector getVectorDiff(Vector vec) {
        Vector result = new Vector();
        result.setX(x - vec.getX());
        result.setY(y - vec.getY());
        result.setZ(z - vec.getZ());

        return result;
    }

    public static Vector[] getVecArray(int N) {
        Vector[] vecArray = new Vector[N];

        for (int i = 0; i < N; i++) {
            double x = Math.random();
            double y = Math.random();
            double z = Math.random();

            vecArray[i] = new Vector(x, y, z);
        }

        return vecArray;
    }
}
