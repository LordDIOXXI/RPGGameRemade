package org.example;

public class Enemies{
    private int hitPoints, str, dex, con, intel, wis, cha, strMod, dexMod, conMod, intMod, wisMod, chaMod;

}

interface Enemy {
    public void enemyName();
    public void statBlock();
}

class Orcs{
    class Orc implements Enemy{
        public void enemyName(){

        }
        public void statBlock(){

        }
    }

    class OrcShaman implements Enemy{
        public void enemyName(){

        }
        public void statBlock(){
            int str;
        }
    }

    class OrcChieftan implements Enemy{
        public void enemyName(){

        }
        public void statBlock(){
            int str;
        }
    }

}