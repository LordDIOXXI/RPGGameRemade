package org.example;

import java.util.Random;

import static java.lang.Math.floorDiv;

public class Character {

    //Instantiate variables
    private int hitPoints, str, dex, con, intel, wis, cha, strMod, dexMod, conMod, intMod, wisMod, chaMod;
    private String name;
    Random rand = new Random();

    //character constructor
    public Character(){
        name=null;
        hitPoints=0;
        str=10;
        dex=10;
        con=10;
        intel=10;
        wis=10;
        cha=10;
        strMod=0;
        dexMod=0;
        conMod=0;
        intMod=0;
        wisMod=0;
        chaMod=0;
    }

    //Random number generator for stat rolling
    private int randomStat(){
        int stat=rand.nextInt(20);
        return stat;
    }

    //Set hitpoints equal to 20 + the constitution modifier
    private void setHitPoints(){
        this.hitPoints = 20 + conMod;
    }

    //Set Stats for character class
    public void createCharacter(){
        this.str = randomStat()+1;
        this.dex = randomStat()+1;
        this.con = randomStat()+1;
        this.intel = randomStat()+1;
        this.wis = randomStat()+1;
        this.cha = randomStat()+1;
        modSet();
        setHitPoints();
    }

    //Doest the math to set the correct modifier for each stat
    private int tempModMath(int mod){
        double tempStatMod = floorDiv(mod - 10, 2);
        return (int)tempStatMod;
    }

    //Set stat modifiers
    private void modSet(){

        this.strMod = tempModMath(str);
        this.dexMod= tempModMath(dex);
        this.conMod= tempModMath(con);
        this.intMod= tempModMath(intel);
        this.wisMod= tempModMath(wis);
        this.chaMod= tempModMath(cha);
    }

    //Set Player name
    public void setPlayerName(String newName){this.name = newName;}

    //Various Getters for character class
    public String getPlayerName(){return name;}
    public int getStrength(){return str;}
    public int getDexterity(){return dex;}
    public int getConstitution(){return con;}
    public int getIntelligence(){return intel;}
    public int getWisdom(){return wis;}
    public int getCharisma(){return cha;}
    public int getHitPoints(){return hitPoints;}
    public int getStrMod(){return strMod;}
    public int getDexMod(){return dexMod;}
    public int getConMod(){return conMod;}
    public int getIntMod(){return intMod;}
    public int getWisMod(){return wisMod;}
    public int getChaMod(){return chaMod;}

}