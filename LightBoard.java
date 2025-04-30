public class LightBoard 
{
    /**
     * The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;

    /**
     * Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols) 
    {
        lights = new boolean[numRows][numCols];
        for(int r = 0; r < numRows; r++)
        {
            for(int c = 0; c < numCols; c++)
            {
                if(Math.random() < 0.4) lights[r][c] = true;
            }
        }
    }

    public void setLights(boolean[][] arr)
    {
        lights = arr;
    }

    public double test()
    {
        double on = 0;
        for(boolean[] row : lights)
        {
            for(boolean b : row)
            {
                if(b) on++;
            }
        }
        return on / (lights.length * lights[0].length);
    }

    /**
     * Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col) 
    {
        boolean light = lights[row][col];
        int colLights = 0;
        for(int r = 0; r < lights.length; r++)
        {
            if(lights[r][col]) colLights++;
        }
        if(light && colLights % 2 == 0) return false;
        else if(!light && colLights % 3 == 0) return true;
        else return light;
    }

    // There may be additional instance variables, constructors, and methods not
    // shown.
}