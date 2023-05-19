import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Tile[][] Mars = new Tile[10][10];
    public static void printTable()
    {
        for(byte i=0;i<10;i++)
        {
            for(byte j=0;j<10;j++)
            {
                System.out.print(Mars[i][j].presents);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Mars Colonization!Please type START to start the game!");
        Scanner scan = new Scanner(System.in);
        String variabileStart = scan.next();
        variabileStart = variabileStart.toUpperCase();
        while (!variabileStart.equals("START")) {
            System.out.println("Please type START to start the game");
            variabileStart = scan.next();
            variabileStart = variabileStart.toUpperCase();
        }

        System.out.println("Please choose how many engineers do you want: ");
        Scanner scan1 = new Scanner(System.in);
        int numberOfEngineers = scan.nextInt();
        while (numberOfEngineers <= 0) {
            System.out.println("Please introduce a number of engineers greater than 0");
            numberOfEngineers = scan.nextInt();
        }

        System.out.println("Please choose how many medics do you want: ");
        Scanner scan2 = new Scanner(System.in);
        int numberOfMedics = scan.nextInt();
        while (numberOfMedics <= 0) {
            System.out.println("Please introduce a number of medics greater than 0");
            numberOfMedics = scan.nextInt();
        }

        System.out.println("Please choose how many colonists do you want: ");
        Scanner scan3 = new Scanner(System.in);
        int numberOfColonists = scan.nextInt();
        while (numberOfColonists <= 0) {
            System.out.println("Please introduce a number of colonist greater than 0");
            numberOfColonists = scan.nextInt();
        }

        for (byte i = 0; i < 10; i++) {
            for (byte j = 0; j < 10; j++) {
                Mars[i][j] = new Tile(i, j);
            }
        }

        ArrayList<Engineer> engineers = new ArrayList<>(numberOfEngineers);
        ArrayList<Medic> medics = new ArrayList<>(numberOfMedics);
        ArrayList<Colonist> colonists = new ArrayList<>(numberOfColonists);

        for (int i = 0; i < numberOfEngineers; i++) {
            Engineer e1 = new Engineer((byte) 4, (byte) 4, Engineer.generateName(), Engineer.generateAge());
            System.out.println(e1.name + ", " + e1.age);
            engineers.add(e1);
            Mars[4][4].presents.add(e1);
        }


        for (int i = 0; i < numberOfMedics; i++) {
            Medic m1 = new Medic((byte) 4, (byte) 4, Medic.generateName(), Medic.generateAge());
            System.out.println(m1.name + ", " + m1.age);
            medics.add(m1);
            Mars[4][4].presents.add(m1);
        }

        for (int i = 0; i < numberOfColonists; i++) {
            Colonist c1 = new Colonist((byte) 4, (byte) 4, Colonist.generateName(), Colonist.generateAge());
            System.out.println(c1.name + ", " + c1.age);
            colonists.add(c1);
            Mars[4][4].presents.add(c1);
        }

         //engineers.get(1).moveUp(engineers.get(1));
        //System.out.println(engineers.get(1).x);
       // System.out.println(engineers.get(1).y);

        //engineers.get(1).moveUp(engineers.get(1));
        //System.out.println(engineers.get(1).x);
        //System.out.println(engineers.get(1).y);

        //engineers.get(1).moveUp(engineers.get(1));
        //System.out.println(engineers.get(1).x);
        //System.out.println(engineers.get(1).y);

        printTable();
        Medic m1 = new Medic((byte) 2, (byte) 2, Medic.generateName(), Medic.generateAge());
        Colonist c1 = new Colonist((byte) 2, (byte) 3, Colonist.generateName(), Colonist.generateAge());
        Engineer e1=new Engineer((byte)1,(byte)3,Engineer.generateName(),Engineer.generateAge());
        //c1.explore();
       // c1.moveDown();
        //c1.moveDown();

        //colonists.get(1).moveUp(colonists.get(1));
       // System.out.println(colonists.get(1).x);
       // System.out.println(colonists.get(1).y);

       // System.out.println(c1.x+" "+c1.y);
        //c1.moveUpPlayer();
        //c1.explore();
        //c1.moveDownPlayer();
        //System.out.println(c1.x+" "+c1.y);
        //c1.moveLeftPlayer();
        //System.out.println(c1.x+" "+c1.y);
       // c1.moveRightPlayer();
       // System.out.println(c1.x+" "+c1.y);
        //System.out.println(c1.x);

        //System.out.println(m1.x+" "+m1.y);
        //m1.moveDownPlayer();
        //System.out.println(m1.x+" "+m1.y);
        //m1.moveLeftPlayer();
       // System.out.println(m1.x+" "+m1.y);
       // m1.moveRightPlayer();
        //System.out.println(m1.x+" "+m1.y);
        //m1.moveUpPlayer();
        //System.out.println(m1.x+" "+m1.y);
       // m1.heal();
       // System.out.println(m1.x+" "+m1.y);
         //System.out.println(m1.x+" "+m1.y);
         //m1.moveDownPlayer();

            // System.out.println(e1.x+" "+e1.y);
        //e1.build();
        //System.out.println(e1.x+" "+e1.y);
        //e1.repair();
       // System.out.println(e1.x+" "+e1.y);





    }



}
