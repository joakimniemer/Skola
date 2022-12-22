package litetspel;

import java.util.List;
import java.util.Scanner;

import litetspel.misc.Interactive;
import litetspel.object.BlackStone;
import litetspel.object.Hest;
import litetspel.object.Player;
import litetspel.object.RedStone;
import litetspel.object.Spegel;

public class OvningEtt {

    public static void main(String[] args) {

       // List<Interactive> items = List.of(new Hest("häst"), new RedStone("röd")); 

        Scanner scan = new Scanner(System.in);
        Interactive redstone = new RedStone();
        Interactive blackstone = new BlackStone();
        Interactive hest = new Hest();
        Interactive spegel = new Spegel();

        String answer;

        System.out.print("Välj spelarnamn:");
        Player player = new Player(scan.nextLine());

        System.out.println("Du ser: en röd sten, en svart sten, en häst och en spegel.");
        do {

            System.out.println("Vad vill du använda?");
            answer = scan.nextLine();
            if (answer.equals("en röd sten")) {
                redstone.interact(player);
            } else if (answer.equals("en svart sten")) {
                blackstone.interact(player);
            } else if (answer.equals("en häst")) {
                hest.interact(player);
            } else if (answer.equals("en spegel")) {
                spegel.interact(player);
            }

        } while (!answer.equals("avsluta"));
        System.out.println("Ha en bra dag! Ses snart igen.");

        





        scan.close();
    }
}