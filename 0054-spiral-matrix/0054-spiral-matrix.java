class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int startRow = 0;
        int endRow = matrix.length -1;
        int startCol = 0;
        int endCol = matrix[0].length -1;

        List<Integer> output = new ArrayList<>();

        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int i=startCol; i<=endCol; i++){
                output.add(matrix[startRow][i]);
            }

            //right
            for(int i=startRow+1; i<=endRow; i++){
                output.add(matrix[i][endCol]);
            }

            //bottom
            if(startRow<endRow){
                for(int i=endCol-1; i>=startCol; i--){
                    output.add(matrix[endRow][i]);
                }
            }
            
            //left
            for(int i=endRow-1; i>startRow; i--){
                if(startCol==endCol){
                    break;
                }
                output.add(matrix[i][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return output;
    }
}