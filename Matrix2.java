public class Matrix2 {
    private int a11, a12, a21, a22;

    public Matrix2( int a11, int a12, int a21, int a22) {
        this.a11 = a11;
        this.a12 = a12;
        this.a21 = a21;
        this.a22 = a22;

    }

    public Matrix2() throws Exception {
        a11 = Scanner.inputInt("a11 -> ");
        a12 = Scanner.inputInt("a12 -> ");
        a21 = Scanner.inputInt("a21 -> ");
        a22 = Scanner.inputInt("a22 -> ");
    }

    public static Matrix2 plus(Matrix2 A, Matrix2 B) {
        return new Matrix2(A.a11 + B.a11, A.a12 + B.a12,A.a21 + B.a21, A.a22 + B.a22);
    }

    public static Matrix2 minus(Matrix2 A, Matrix2 B) {
        return new Matrix2(A.a11 - B.a11, A.a12 - B.a12,A.a21 - B.a21, A.a22 - B.a22);
    }

    public static Matrix2 mult(Matrix2 A, int k) {
        return new Matrix2(k * A.a11, k * A.a12,k * A.a21, k * A.a22);
    }

    public static Matrix2 product(Matrix2 A, Matrix2 B) {
        return new Matrix2(A.a11 * B.a11 + A.a12 * B.a21, A.a11 * B.a12 + A.a12 * B.a22,A.a21 * B.a11 + A.a22 * B.a21, A.a21 * B.a12 + A.a22 * B.a22);
    }

    public static int determinant(Matrix2 A) {

        return  A.a11 * A.a22 - A.a12 * A.a21;
    }

    public static Matrix2 InverseMatrix(Matrix2 A) {
        int det = A.a11 * A.a22 - A.a12 * A.a21;

        if (det == 0) {
            System.out.println("-");
            return A;
        } else {

            A.a12 = -A.a12;
            A.a21 = -A.a21;
            return new Matrix2(1 / det * A.a11, 1 / det * A.a12, 1 / det * A.a21, 1 / det * A.a22);
        }
    }
}