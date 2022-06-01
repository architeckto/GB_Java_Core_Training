package lesson1;

import java.util.Arrays;
import java.util.Scanner;

public class appLesson1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Runner[] runners = new Runner[4];
        runners[0] = new Runner("John", "Бегун", 300);
        runners[1] = new Runner("Smith", "Бегун", 450);
        runners[2] = new Runner("Jacob", "Бегун", 500);
        runners[3] = new Runner("Ignat", "Бегун", 700);
        Team team = new Team("Бегуны", runners);

        //System.out.println(team.getName() + "\n" + Arrays.toString(team.getRunners()));

        System.out.println("Enter track lenght: ");
        Course track = new Course(scanner.nextInt());
        System.out.println("Track lenght: " + track.getTracklength());
        String result = track.runDownTheTrack(team);
        System.out.println(result);
/*
        Jumper[] jumpers = new Jumper[4];
        jumpers[0] = new Jumper("Jim", "Прыгун", 0.7);
        jumpers[1] = new Jumper("Rian", "Прыгун", 0.9);
        jumpers[2] = new Jumper("Lora", "Прыгун", 0.3);
        jumpers[3] = new Jumper("Kamilla", "Прыгун", 0.4);
        Team team1 = new Team("Прыгуны", jumpers);

        System.out.println(team1.getName() + "\n" + Arrays.toString(team1.getJumpers()));

        Swimmer[] swimmers = new Swimmer[4];
        swimmers[0] = new Swimmer("Anna", "Пловец", 150);
        swimmers[1] = new Swimmer("Elena", "Пловец", 130);
        swimmers[2] = new Swimmer("Olga", "Пловец", 170);
        swimmers[3] = new Swimmer("Natali", "Пловец", 110);
        Team team2 = new Team("Пловцы", swimmers);

        System.out.println(team2.getName() + "\n" + Arrays.toString(team2.getSwimmers()));

*/






        /*
        Team runners = new Team();
        Team jumpers = new Team();
        Team swimmers = new Team();
        System.out.println("Enter track lenght: ");
        Course track = new Course(scanner.nextInt());
        System.out.println("Track lenght: " + track.getTracklength());

        Runner[] arrRunners = {runners.athlet1, runners.athlet2, runners.athlet3, runners.athlet4};
        for (Runner arrRunner : arrRunners) {
            System.out.println(arrRunner);
        }

        System.out.println();

        Jumper[] arrJumpers = {jumpers.athlet5, jumpers.athlet6, jumpers.athlet7, jumpers.athlet8};
        for (Jumper arrJumper : arrJumpers) {
            System.out.println(arrJumper);
        }*/
        /*
        jumpers.athlet5.jumping();
        jumpers.athlet6.jumping();
        jumpers.athlet7.jumping();
        jumpers.athlet8.jumping();


        System.out.println();
        Swimmer[] arrSwimmers = {swimmers.athlet9, swimmers.athlet10, swimmers.athlet11, swimmers.athlet12};
        for (Swimmer arrSwimmer : arrSwimmers) {
            System.out.println(arrSwimmer);
        }


        swimmers.athlet9.swimming();
        swimmers.athlet10.swimming();
        swimmers.athlet11.swimming();
        swimmers.athlet12.swimming();

         */


    }
}
