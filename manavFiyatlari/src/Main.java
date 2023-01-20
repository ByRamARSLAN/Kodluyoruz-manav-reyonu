import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo, total;
        Double armut=2.14, elma=3.67, domates=1.11, muz=0.95, patlican=5.00;

        Scanner inpArmut = new Scanner(System.in);
        Scanner inpElma = new Scanner(System.in);
        Scanner inpDomates = new Scanner(System.in);
        Scanner inpMuz = new Scanner(System.in);
        Scanner inpPatlican = new Scanner(System.in);

        System.out.print("Armut kaç kilo? : ");
        armutKilo = inpArmut.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        elmaKilo = inpElma.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domatesKilo = inpDomates.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muzKilo = inpMuz.nextDouble();

        System.out.print("patlıcan kaç kilo? : ");
        patlicanKilo = inpPatlican.nextDouble();

        total = armut*armutKilo + elma*elmaKilo + domates*domatesKilo + muz*muzKilo + patlican*patlicanKilo;

        System.out.print("Ödenecek toplam tutar : " + total);
    }
}