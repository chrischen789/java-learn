package com.chrischen.designpattern.strategy.character.impl;

import com.chrischen.designpattern.strategy.character.Character;
import com.chrischen.designpattern.strategy.weapon.KnifeBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Queen extends Character {

    private final static Logger log = LoggerFactory.getLogger(Queen.class);

    public Queen() {
        super.weapon = new KnifeBehavior();
    }

    @Override
    public void startGame() {
        log.info("game start init Queen character!");
    }
}
