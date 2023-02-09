package com.prog2.data;

import javax.swing.*;
import java.io.Serializable;

public class CharacterSheet implements Serializable {

    // basic information
    public String characterName;
    public CharacterClass characterClass;
    public int level;
    public Race characterRace;
    public Background background;
    public Alignment alignment;
    public String playerName;
    public int xp;

    // hit-points and armour
    public int armorClass;
    public int initiative;
    public int speed;
    public int maxHp;
    public int hitDiceType;
    public int amountHitDice;

    public CharacterSheet(){

    }

}
