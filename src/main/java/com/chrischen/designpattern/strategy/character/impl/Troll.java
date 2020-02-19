package com.chrischen.designpattern.strategy.character.impl;

import com.chrischen.designpattern.strategy.character.Character;
import com.chrischen.designpattern.strategy.weapon.BowAndArrowBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Troll extends Character {

    private final static Logger log = LoggerFactory.getLogger(Troll.class);

    public Troll() {
        super.weapon = new BowAndArrowBehavior();
    }

    @Override
    public void startGame() {
        log.info("game start init Troll character!");
    }
}
