class Solution {
    
    
    boolean validate(int i,int j,char [][]board,char ch){
        
        for(int k = 0;k<9;k++){
            
            if(board[k][j] == ch)   return false;
            
            if(board[i][k] == ch)   return false;
            
            if(board[(i/3)*3 + k/3][((j/3)*3)+(k%3)] == ch) return false;
            
        }
        return true;
    }
    
    boolean solve(char [][]board){
        
        
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(board[i][j] == '.'){
                    for(char ch = '1';ch<='9';ch++){
                        if(validate(i,j,board,ch)){
                            board[i][j] = ch;
                            if(solve(board) == true) return true;
                            else{
                                board[i][j] = '.';
                            }                            
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    
    public void solveSudoku(char[][] board) {
        solve(board);        
    }
}