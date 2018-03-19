import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        //E ele passou um exercício sobre matrizes.
        // Elaborar uma função recursiva que retorne uma lista de itens da diagonal principal de uma matriz quadrada.
        // Elaborar uma função recursiva que retorne uma lista de itens de uma matriz, caminhando em espiral pela matriz.


        int[][] matrix = MatrixRecursion.CreateMat(3,6);
        ArrayList<Integer> list = MatrixRecursion.MatrixDiag(matrix);

        ArrayList<Integer> list2 = MatrixRecursion.MatrixEspiral(matrix);
        System.out.println(list2);
    }
}
