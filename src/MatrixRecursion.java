import java.util.ArrayList;

public class MatrixRecursion {


    public static int[][] CreateMat(int rows, int cols)
    {
        int[][] mat = new int[rows][cols];
        int number = 1;
        for (int i=0;i<rows;i++){
            for (int j=0;j<cols;j++){
                mat[i][j] = number ++;
            }
        }

        return mat;
    }


    public static ArrayList<Integer> MatrixDiag(int[][] matrix)
    {
        return MatrixDiagTail(matrix, new ArrayList<>(),0);
    }

     /*@Matrix = Matriz que deseja percorrer
      @List = Lista de retorno onde os elementos serão adicionados
      @pos = inteiro com a posição diagonal
      */
    private static  ArrayList<Integer> MatrixDiagTail(int[][] matrix, ArrayList<Integer> array, int pos)
    {
        if(pos > matrix.length-1)
        {
            return array;
        }
        array.add(matrix[pos][pos]);
        return MatrixDiagTail(matrix,array,pos+1);
    }

    public static ArrayList<Integer> MatrixEspiral(int[][] matrix){

        int[] line = {0, matrix.length-1};
        int[] column = {0, matrix[0].length-1};
        return MatrixEspiralTail(matrix, new ArrayList<>(), line,column);

    }

    /*@Matrix = Matriz que deseja percorrer
      @List = Lista de retorno onde os elementos serão adicionados
      @row = array tamanho 2 com posição inicial e posição final para linhas
      @col = array tamanho 2 com posição posição e posição final para coluna
      Função para recursão em cauda
      */
    private static ArrayList<Integer> MatrixEspiralTail(int[][] matrix, ArrayList<Integer> list, int[] row, int[] col){
        for (int i = row[0]; i <= col[1]; i++) {
            list.add(matrix[row[0]][i]);
        }

        for (int i = row[0]+1; i <= row[1]; i++) {
            list.add(matrix[i][col[1]]);
        }

        if(row[0]+1 <= row[1]){
            for (int i = col[1]-1; i >= col[0]; i--) {
                 list.add(matrix[row[1]][i]);
            }
        }

        if(col[0]+1 <= col[1]){
            for (int i = row[1]-1; i > row[0]; i--) {
                list.add(matrix[i][col[0]]);
            }
        }

        if(row[0]+1 <= row[1]-1 && col[0]+1 <= col[1]-1){
            return MatrixEspiralTail(matrix,list,new int[]{row[0]+1, row[1]-1},new int[]{col[0]+1, col[1]-1});
        }

        return list;
    }
}
