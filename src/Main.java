import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class Main {
    public static void main(String[] args) {
        Scanner inputObject = new Scanner(System.in);
        System.out.println("\n\t\t\t\tROCK PAPER SCISSORS GAME");
        System.out.println("\t\t\t\t\t  â\tğï¸\tâï¸");
        char shootUser;
        do{
            System.out.print("\nEnter R for ROCK, p for PAPER and S for SCISSORS----->");
            shootUser=inputObject.next().charAt(0);
            if (shootUser != 'r' && shootUser != 'p' && shootUser != 's') {
                System.out.println("\t\t\tINVALID INPUT");
            }
        }while(shootUser!='r' && shootUser!='p' && shootUser!='s');

        shootUser=Character.toUpperCase(shootUser);
        if(shootUser=='R'){
            System.out.println("USER THROWS--->  â");
        } else if (shootUser=='P') {
            System.out.println("USER THROWS is--->  ğï¸");
        }
        else {
            System.out.println("USER THROWS is--->  âï¸");
        }

        Random random=new Random();
        int shootComputer=random.nextInt(3);
        char[] rules={'R','P','S'};
        if(rules[shootComputer]=='R'){
            System.out.println("COMPUTER THROWS--->  â");
        } else if (rules[shootComputer]=='P') {
            System.out.println("COMPUTER THROWS is--->  ğï¸");
        }
        else {
            System.out.println("COMPUTER THROWS is--->  âï¸");
        }
       // System.out.println("computer throws---->"+rules[shootComputer]);

        if(shootUser==rules[shootComputer]){
            System.out.println("\n\t\tğğ ITS A DRAW ğğ");
        }
        else if(shootUser=='R' && rules[shootComputer]=='S'){
            System.out.println("\n\t\tğ¥³ğ¥³ YOU WIN ğ¥³ğ¥³");
        } else if (shootUser=='P' && rules[shootComputer]=='R') {
            System.out.println("\n\t\tğ¥³ğ¥³ YOU WIN ğ¥³ğ¥³");
        } else if (shootUser=='S' && rules[shootComputer]=='P') {
            System.out.println("\n\t\tğ¥³ğ¥³ YOU WIN ğ¥³ğ¥³");
        }
        else{
            System.out.println("\n\t\tğ¥¹ğ¥¹ YOU LOOSE ğ¥¹ğ¥¹");
        }
    }
}