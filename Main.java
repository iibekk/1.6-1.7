public class Main {
    public static void main(String[] args) throws Exception {
        Matrix2 M1 = new Matrix2();
        Matrix2 M2 = new Matrix2();
        Matrix2.InverseMatrix(M1);
        System.out.println(M1);
        int M = Matrix2.determinant(M1);
        System.out.println(M);
    }
}