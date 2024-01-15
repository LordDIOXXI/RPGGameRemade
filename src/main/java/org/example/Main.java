package org.example;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Character player = new Character();
        //Equipment equipment = new Equipment();
        //Initialize character for play

        player.createCharacter();

        //Set name
        System.out.print("Please enter your character's name: ");
        try (Scanner sc = new Scanner(System.in)) {
            player.setPlayerName(sc.nextLine());
        }
        //Display Character stats
        System.out.println("Your character's name is: " +player.getPlayerName());
        System.out.println("--------------------------");
        System.out.println("Your stats are as follows");
        System.out.println("--------------------------");
        System.out.println("Hit Points: " + player.getHitPoints());
        //System.out.println("AC: " + equipment.getArmorClass());
        System.out.println("Strength: " + player.getStrength());
        System.out.println("Strength Mod: " + player.getStrMod());
        System.out.println("Dexterity: " + player.getDexterity());
        System.out.println("Dexterity Mod: " + player.getDexMod());
        System.out.println("Constitution: " + player.getConstitution());
        System.out.println("Constitution Mod: " + player.getConMod());
        System.out.println("Intelligence: " + player.getIntelligence());
        System.out.println("Intelligence Mod: " + player.getIntMod());
        System.out.println("Wisdom: " + player.getWisdom());
        System.out.println("Wisdom Mod: " + player.getWisMod());
        System.out.println("Charisma: " + player.getCharisma());
        System.out.println("Charisma Mod: " + player.getChaMod());
    }
}
