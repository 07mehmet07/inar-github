package week_09.assigment;

public class Location {

    public int row;

    public int column;

    public double maxValue;


    Location(int row, int column, double maxValue) {

        this.row = row;

        this.column = column;

        this.maxValue = maxValue;


    }

    public static Location locateLargest(double[][] a) {

        double maxValue = a[0][0];
        int row = 0;
        int column = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {

                if (a[i][j] > maxValue) {

                    maxValue = a[i][j];

                    row = i;
                    column = j;


                }

            }
        }

        return new Location(row, column, maxValue);
    }


}
