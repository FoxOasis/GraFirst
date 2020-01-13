import java.util.Random;

public class Zadanie2 {
    public static void main(String[] args){
    double danaPierwsza = 3;
    double danaDruga = 5;
    double danaTrzecia = 9.5;
    System.out.println((danaPierwsza + danaDruga) * danaTrzecia);
    System.out.println((danaPierwsza - danaDruga) / danaTrzecia);
danaPierwsza ++;
        System.out.println(danaPierwsza);
        System.out.println((danaPierwsza + danaDruga) >= danaTrzecia);
        System.out.println(danaPierwsza == danaDruga);
 Random rand = new Random();
        double danalosowa;
 danalosowa = rand.nextDouble();
        System.out.println(danalosowa);
    }
}

