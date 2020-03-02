package com.chrischen.designpattern.strategy.character;

import com.chrischen.designpattern.strategy.weapon.WeaponBehavior;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class Character {

    private final static Logger log = LoggerFactory.getLogger(Character.class);

    protected WeaponBehavior weapon;

    public abstract void startGame();

    public void fight() {
        weapon.useWeapon();
    }

    public void setWeapon(WeaponBehavior weapon) {
        this.weapon = weapon;
        log.info("change now weapon!");
    }
}
