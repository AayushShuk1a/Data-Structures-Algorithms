public class RatInAMaze {

    static int N;

    static boolean isSafe(int maze[][],int i,int j){
        if(i<N&&j<N&&maze[i][j]==1){
            return true;
        }

        return false;
    }

    static boolean solveMazeRes(int maze[][],int i,int j,int sol[][]){
        if((i==N-1&&j==N-1)&&maze[i][j]==1){
            sol[i][j]=1;
            return true;
        }

        if(isSafe(maze,i,j)==true){
            sol[i][j]=1;

            if(solveMazeRes(maze, i+1, j, sol)==true){
                return true;
            }

            if(solveMazeRes(maze, i, j+1, sol)==true){
                return true;
            }

            sol[i][j]=0;
        }

        return false;

    }

    static boolean SolveMaze(int maze[][]){
        int sol[][]=new int[N][N];

        if(solveMazeRes(maze,0,0,sol)==false){
            System.out.println("Solution doesn't exist");
            return false;
        }

        printSolution(sol);
        return true;
    }

    static void printSolution(int sol[][]){
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(sol[i][j]+" ");
            }
            System.out.println(" ");
        }
    }


    public static void main(String[] args) {
        int maze[][] = { { 1, 0, 0, 0 }, 
        { 1, 1, 0, 1 }, 
        { 0, 1, 0, 0 }, 
        { 1, 1, 1, 1 } }; 

        N = maze.length; 
        System.out.println(SolveMaze(maze));
    }
    
}
