public class Main {
    public static void main(String[] args) {

        // 1 пункт
        int[] a = new int[17];
        int t = 17;
        for (int i = 0; i<a.length; i++,t--) {
            a[i] = t;
        }


        // 2 пункт
        double[] x = new double[14];
        for (int i = 0; i<x.length; i++) {
            x[i] = Math.random()*16.0 - 7.0;
        }

        //3 пункт
        double[][] p = new double[17][14];
        for (int i = 0; i< a.length; i++) {
            for (int j = 0; j<x.length; j++) {
                switch (a[i] == 2) {

                    case (2) {
                        p[i][j] = Math.cos( Math.cbrt( Math.pow( (0.5/(1-x[j])), 3 ) ) );
                        break;
                    }

                    case (5 | 6 | 7 | 8 |10 | 12 | 13 | 14) {
                        p[i][j] = Math.pow( (Math.log( Math.pow( (Math.abs(x[j])/5), x[j] ) - 1 ) ), ( (Math.pow(3, -1)) / (0.25 + Math.pow( (3 * Math.pow(x[j], -1)), 3 ))) );
                        break;
                    } 

                    default {

                        p[i][j] = Math.cos( Math.pow( (Math.PI / (Math.pow(Math.atan((x[j]+1)/2), 2) + 0.5) ), Math.tan(Math.cos(x[j]) ) ) );
                        
                    }

            }
        }
        // Вывод 3 пункта
        for (int i=0; i<p.length; i++) {
            System.out.print("[ ");
            for (int j=0; j<p[i].length; j++) {
                System.out.printf("%.3f ", p[i][j]);
            }
            System.out.println("] ");
        }


    }

}