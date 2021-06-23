import java.util.Scanner;

class Matrix{
    int order;
    int[][] matrix;

    Matrix(int order){
        this.order = order;
        matrix = new int[order][order];
    }

    void MatrixCreation(Scanner read){
        System.out.println("Enter the elements in "+ order+"x"+order+" matrix:");
        for(int i=0; i<order; i++){
            for (int j=0; j<order; j++){
                matrix[i][j] = read.nextInt();
            }
        }
    }
    void isSymmetricMatrix(){
        for(int i=0; i<order; i++){
            for (int j=0; j<order; j++){
                if (matrix[i][j] != matrix[j][i]){
                    System.out.println("Given matrix is not a symmetric metrix");
                    return;
                }
            }
        }
        System.out.println("Given metrix is a symmetric metrix");
    }
}
public class SymmetricMatrix {
    public static void main(String[] arg) {
        int order;
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the order of sqare metrix:");
        order = read.nextInt();
        Matrix m = new Matrix(order);
        m.MatrixCreation(read);
        m.isSymmetricMatrix();
    }
}
