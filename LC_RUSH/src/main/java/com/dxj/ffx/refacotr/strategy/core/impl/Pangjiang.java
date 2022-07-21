package com.dxj.ffx.refacotr.strategy.core.impl;

import com.dxj.ffx.refacotr.strategy.core.SaiyaJin;
import com.dxj.ffx.refacotr.strategy.core.enums.SecondName;
import com.dxj.ffx.refacotr.strategy.behavior.TurnedBehavior;

/**
 * 小芳，
 */
public class Pangjiang extends SaiyaJin {
    public Pangjiang(SecondName secondName, TurnedBehavior turnedBehavior) {
        super(secondName, turnedBehavior);
    }

    @Override
    public void introduce() {
        System.out.println("我是小芳，最后一个赛亚人,我还是个女生");
    }
}
