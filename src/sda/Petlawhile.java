package sda;

public class Petlawhile {

    void printWhileLoopWithBrak() {
        int i = 0;
        while (true) {
            System.out.println(i);
            if (i > 15) {
                break;
            }
            i++;

            }
        System.out.println("-------");
    }
        void printWhileLoopWithContinue() {
            int i = 0;
            boolean jestKoniec = false;
            while (!jestKoniec) {
                System.out.println(i);
                i++;
                if (i < 5) {
                    continue;
                }
                jestKoniec = true;
            }
        }
//        while (!jestPolaczenieZBazaDanych){
//            reconnect();
//        }

    }
