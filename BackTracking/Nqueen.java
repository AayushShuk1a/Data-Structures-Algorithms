public class Nqueen {
    
    static int N=4;
    static int board[][] = { { 0, 0, 0, 0 }, 
                    { 0, 0, 0, 0 }, 
                    { 0, 0, 0, 0 }, 
                    { 0, 0, 0, 0 } };    

    static boolean solveQueens(){
        if(solveQueensRec(0)==false){
            return false;
        }

        printBoard();
        return true;
    }

    static boolean solveQueensRec(int col){
        if(col==N){
            return true;
        }

        for(int i=0;i<N;i++){
            if(isSafe(i,col)==true){
                board[i][col]=1;
                if(solveQueensRec(col+1)==true)
                return true;
                board[i][col]=0;
            }
        }
        return false;
    }

    static boolean isSafe(int row,int col){

        for(int i=0;i<col;i++){
            if(board[row][i]==1){
                return false;
            }
        }

        for(int i=row,j=col;i>=0&&j>=0;i--,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        for(int i=row,j=col;i<N&&j>=0;i++,j--){
            if(board[i][j]==1){
                return false;
            }
        }

        return true;
    }

    static void printBoard(){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        solveQueens();
    }
    
}
