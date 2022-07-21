package com.dxj.ffx.refacotr.strategy.core.impl;

import com.dxj.ffx.refacotr.strategy.core.SaiyaJin;
import com.dxj.ffx.refacotr.strategy.core.enums.SecondName;
import com.dxj.ffx.refacotr.strategy.behavior.TurnedBehavior;

public class SunWukong extends SaiyaJin {

    public SunWukong(SecondName secondName, TurnedBehavior turnedBehavior) {
        super(secondName, turnedBehavior);
    }

    @Override
    public void introduce() {
        System.out.println("我是孙悟空，你也可以叫我卡卡罗特");
    }
}
