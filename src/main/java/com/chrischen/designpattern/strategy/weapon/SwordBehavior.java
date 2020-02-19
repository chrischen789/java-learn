package com.chrischen.designpattern.strategy.weapon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SwordBehavior implements WeaponBehavior {

    private final static Logger log = LoggerFactory.getLogger(SwordBehavior.class);

    @Override
    public void useWeapon() {
        log.info("now use Sword to kill!");
    }
}
