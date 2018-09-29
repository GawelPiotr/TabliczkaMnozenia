package sda;

public class PetlaFor {

        public static void main(String[] args) {
            /**
             * for(;;){} = while(true| !false| funkcja() ){}
             * while(liczba >= numer) while (liczba >= (numer -3)) {}
             * for (warunek_startu;warunek_konca;krok_z_jakim){}
             */

            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
            System.out.println("-----");
            for (int i = 0; i < 10; ) {
                System.out.println(i++);
            }
            System.out.println("------");
            for (int i = 0; i < 10; ) {
                System.out.println(++i);
            }
            System.out.println("------");
            for (int i = 100; i > 20; i -= 6) {
                System.out.println(i);
            }
            System.out.println("------");
            int i = 1;
            for (; ; ) {

                i *= 5;
                if (i > 100) {
                    break;
                }
                System.out.println(i);
            }
            System.out.println("------");

            for (i = 0; i < 10; i++) { // for (int i =0; i<10; i++) nie zadziała

            }
            System.out.println("-------");
            for (i = 1; i < 111; i++) {
                if (i % 10 == 0) {
                    continue;
                }

                System.out.println(i);
            }
            System.out.println("-------");
//
//        for(i = podajStart(); i >podajKoniec(); obliczKrok(i)){
//            System.out.println(i);
//        }

            /**
             * sposoby zwiekszenia wartosci liczby i o "jedne"
             * inkrementacja i++
             * i+=1
             * i = i +1
             *
             * i++ post inkrementacja
             * ++i pre inkrementacja
             *
             * analogicznie dla odejmowania
             * i-=1
             * degrementacja i--
             * i = i-1
             * dla mnżenia i dzielenia
             * i*=6 <==> i = i*6
             * i/=6 <==> i = i/6
             * i%=2 <==> i = i%2 [reszta z dzielenia - modulo]
             */

        }
    }
