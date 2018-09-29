package sda;

public class InstrukcjaIf {
    void prostyIF(boolean warunek){
        if(warunek){
            System.out.println("warunek jest prawdziwy");
        }else {
            System.out.println("warunek jest fałszywy");
        }
    }
    void jakaToLiczba(int liczba){
        if (liczba == 0){
            System.out.println("To jest ZERO");
        }
        else if (liczba<0){
            System.out.println("To liczba ujemna");
        }
        else{
            System.out.println("To liczba dodatnaia");
        }
    }
    void czyJestesPelnoletni(int wiek){
        String opis = (wiek <18) ? "Nieletni " : "Pełnoletni";
        System.out.println(opis);
    }
}
