import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        Scanner s=new Scanner(System.in);
//        Random random=new Random();
//        int ranChislo= random.nextInt(0,100);
//
//        Dragon dragon=new Dragon(2000,150,150,0);
//        Hero hero=new Hero(1000,100,120,250,150);
//        for (int i = 0; true; i++) {
//            System.out.println("Hero Hp do "+hero.getHp());
//            hero.bitDragonToHero(dragon);
//            System.out.println("Hero Hp posle "+hero.getHp()+"\n");
//            System.out.println("Dragon Hp do "+dragon.getHp());
//            dragon.bitHeroToDragon(hero,ranChislo);
//            System.out.println("HP of Dragon posle "+dragon.getHp()+"\n");
//
//            if (dragon.getHp()<=0){
//                System.out.println("geroi pobedil");
//                break;
//            } else if (hero.getHp()<=0) {
//                System.out.println("dragon pobedil");
//                break;
//            }
//        }
//
//    }
//}


        int[] massivs = {23, 23, 56, 23, 43};
        System.out.println(Arrays.toString(massivs));

        MySet mySet = new MySet(massivs);
    }
}














