package com.chrischen.designpattern.strategy.weapon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class KnifeBehavior implements WeaponBehavior {

    private static final Logger log = LoggerFactory.getLogger(KnifeBehavior.class);

    @Override
    public void useWeapon() {
        log.info("now use Knife to hit enemy");
    }
}
