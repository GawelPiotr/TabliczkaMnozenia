package sda;

public class TabliczkaMnozenia {

    void printFormaty(){
        System.out.printf("%4d\n" ,10);
        System.out.printf("%4.2f\n", 10.0103);
        System.out.printf("%s\n" , "napis");
        System.out.printf("\n\n\tDziewczynka o imieniu %s ma w koszuczku %d jabłek o wadze %.2f kilogramów", "Alicja", 7, 7.329);
    }

    void printTabliczkaMnozenia(){
        /**
         *    1 2 3 4 5 6 7 8 9
         *  1 1
         *  2 2
         *  3
         *  4
         *  5
         *  6
         *  7
         *  8
         *  9
         *
         */

        for (int k =1; k<=10; k++){
            for (int w =1; w<=10; w++){
                System.out.printf("%4d" , k * w);
            }
            System.out.println("");
        }
    }
}
