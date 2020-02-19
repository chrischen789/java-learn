package com.chrischen.designpattern.strategy.character.impl;

import com.chrischen.designpattern.strategy.character.Character;
import com.chrischen.designpattern.strategy.weapon.AxeBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class King extends Character {

    private final static Logger log = LoggerFactory.getLogger(King.class);

    public King() {
        super.weapon = new AxeBehavior();
    }

    @Override
    public void startGame() {
        log.info("game start King character init!");
    }
}
