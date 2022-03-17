

public class Table {

    private int height;

    private int width;

    private final int[][] matrix;


    public Table(int w, int h){
        matrix = new int[w+1][h+1];
        for (int i = 0; i <= w; i++){
            matrix[i] = new int[h+1];
            for(int j = 0; j <= h; j++){
                matrix[i][j] = i*j;
            }
        }
    }

    public String display_prompt(int fc, int tc, int fr, int tr){
        return String.format("Multiplication Table ([%d..%d]x[%d..%d])",fc,tc,fr,tr);

    }


    public void display(int w, int h){
        String prompt = display_prompt(1, w,1 , h);
        System.out.println(prompt + "\n");

        for (int i = 0; i <= w; i++){
            if(i == 0) {
                System.out.print("\t");
            }
            for(int j = 0; j <= h; j++){
                if(j == 0) {
                    if(i != 0){
                        System.out.print(i + "\t");
                    }
                    continue;
                }
                if(i == 0) {
                    System.out.print(j + "\t");
                }else {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }

    public void display(int fc, int tc, int fr, int tr){

        String prompt = display_prompt(fc, tc,fr , tr);
        System.out.println(prompt + "\n");


        int row = fr-1;
        int col = fc-1;

        for(int i = fr-1; i <= tr; i++){
            for(int j = fc-1; j <= tc; j++){
                if(i == row && j == col) {
                    System.out.print("       ");
                    continue;
                }
                if(i == row)
                    System.out.printf("%6d ", j);
                else if(j == col)
                    System.out.printf("%6d ", i);
                else
                    System.out.printf("%6d ", matrix[i][j]);
            }
            System.out.println();
        }
    }

}
