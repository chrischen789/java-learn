package com.chrischen.designpattern.strategy.weapon;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AxeBehavior implements WeaponBehavior {

    private final static Logger log = LoggerFactory.getLogger(AxeBehavior.class);

    @Override
    public void useWeapon() {
        log.info("now use Axe ha ha ha!");
    }
}
