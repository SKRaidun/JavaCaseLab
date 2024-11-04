package Tasks.Lesson_2.Task_2;

public class Main {
    public static void main(String[] args) {
        Vector vec = new Vector(1, 5, 9);
        System.out.println(vec.getLength());
        Vector vec1 = new Vector(3, 15, 9);
        System.out.println(vec.getScalarMulti(vec1));
        System.out.println(vec.getVectorMulti(vec1));

        System.out.println(vec.getAngle(vec1));
        System.out.println(vec.getVectorSum(vec1));
        System.out.println(vec.getVectorDiff(vec1));

        int N = 10;

        for (Vector vecArr : Vector.getVecArray(N)) {
            System.out.println(vecArr);
        }
    }
}
