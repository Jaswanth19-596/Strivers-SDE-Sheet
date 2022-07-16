List<String> construct(char board[][]){
        List<String> list = new ArrayList<>();
        
        for(char ch[] : board){
            list.add(new String(ch));
        }
        return list;
    }
    
    void solve(int col,char board[][],List<List<String>> res,boolean rowTracker[],boolean downDiagonal[],boolean upDiagonal[],int n){
        
        if(col == board.length){
            res.add(construct(board));
            return;
        }
        
        
        for(int row = 0;row<board.length;row++){
            if(rowTracker[row] == false && upDiagonal[n-1+col-row] == false && downDiagonal[row+col] == false){
                
                rowTracker[row] = true;
                upDiagonal[n-1+col-row] = true;
                downDiagonal[row+col] = true;
                
                board[row][col] = 'Q';
                solve(col+1,board,res,rowTracker,downDiagonal,upDiagonal,n);
                board[row][col] = '.';
                
                rowTracker[row] = false;
                upDiagonal[n-1+col-row] = false;
                downDiagonal[row+col] = false;
            }
        }
        
    }
    
    
    
    public List<List<String>> solveNQueens(int n) {
        char board[][] = new char[n][n];
        
        for(char ch[] : board){
            Arrays.fill(ch,'.');
        } 
        
        List<List<String>> res = new ArrayList<List<String>>();
        
        boolean rowTracker[] = new boolean[board.length];
       
        boolean downDiagonal[] = new boolean[2*n-1];
        boolean upDiagonal[] = new boolean[2*n-1];
        


        solve(0,board,res,rowTracker,downDiagonal,upDiagonal,n);
        
        return res;
    }
}