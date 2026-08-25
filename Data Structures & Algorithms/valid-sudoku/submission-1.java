class Solution {
    public boolean isValidSudoku(char[][] board) {

        // Check rows
        for(int i = 0; i < board.length; i++)
        {
            HashSet<Character> seenrow = new HashSet<>();
            HashSet<Character> seencol = new HashSet<>();

            for(int j = 0; j < board.length; j++)
            {
                if(board[i][j] != '.')
                {
                    if(!seenrow.add(board[i][j]))
                    {
                        return false;
                    }
                }

                if(board[j][i] != '.')
                {
                    if(!seencol.add(board[j][i]))
                    {
                        return false;
                    }
                }
            }
        }

        

        // Check 3 × 3 boxes
        for(int r = 0; r < 3; r++)
        {
            for(int c = 0; c < 3; c++)
            {
                HashSet<Character> seen1 = new HashSet<>();

                for(int i = 0; i < 3; i++)
                {
                    for(int j = 0; j < 3; j++)
                    {
                        int row = r * 3 + i;
                        int column = c * 3 + j;

                        if(board[row][column] != '.')
                        {
                            if(!seen1.add(board[row][column]))
                            {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        return true;
    }
}