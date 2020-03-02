package com.chrischen.designpattern.strategy.weapon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BowAndArrowBehavior implements WeaponBehavior {

    private final static Logger log = LoggerFactory.getLogger(BowAndArrowBehavior.class);

    @Override
    public void useWeapon() {
        log.info("now use bow and arrow to hit enemy");
    }
}
