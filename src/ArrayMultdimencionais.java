public class ArrayMultdimencionais {
    public static void main(String[] args) {
        //Dado tabular - linhas e colunas

        int [][] sudoku = { {3,6,7}, {4,9,8}, {5,2,1} };

        System.out.println(sudoku[0][0]);

        // alterando valor do array multidimencional
        sudoku[0][0] = 1;
        sudoku[2][2] = 3;
        System.out.println(sudoku[0][0]);
        System.out.println(sudoku[2][2]);

        //Percorrendo arrays multidimencionais
        for(int i = 0; i < sudoku.length; i++){
            for(int j = 0; j < sudoku[i].length; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
