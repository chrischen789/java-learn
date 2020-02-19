package com.chrischen.designpattern.strategy;

import com.chrischen.designpattern.strategy.character.Character;
import com.chrischen.designpattern.strategy.character.impl.King;
import com.chrischen.designpattern.strategy.weapon.SwordBehavior;
import org.junit.Test;


public class StrategyTest {

    @Test
    public void initCharacter() {
        Character king = new King();
        king.startGame();
        king.fight();
        king.setWeapon(new SwordBehavior());
        king.fight();
    }

}
