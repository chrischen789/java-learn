package com.chrischen.designpattern.strategy.character.impl;

import com.chrischen.designpattern.strategy.character.Character;
import com.chrischen.designpattern.strategy.weapon.SwordBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Knight extends Character {

    private final static Logger log = LoggerFactory.getLogger(Queen.class);

    public Knight() {
        super.weapon = new SwordBehavior();
    }

    @Override
    public void startGame() {
        log.info("game start init Knight character!");
    }


}
