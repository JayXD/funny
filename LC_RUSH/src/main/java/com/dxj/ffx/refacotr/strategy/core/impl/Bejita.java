package com.dxj.ffx.refacotr.strategy.core.impl;

import com.dxj.ffx.refacotr.strategy.core.SaiyaJin;
import com.dxj.ffx.refacotr.strategy.core.enums.SecondName;
import com.dxj.ffx.refacotr.strategy.behavior.TurnedBehavior;

public class Bejita extends SaiyaJin {

    public Bejita(SecondName secondName, TurnedBehavior turnedBehavior) {
        super(secondName, turnedBehavior);
    }

    @Override
    public void introduce() {
        System.out.println("我是贝吉塔，俗称万年老二");
    }
}
