package com.dxj.ffx.refacotr.strategy.behavior.impl;

import com.dxj.ffx.refacotr.strategy.behavior.TurnedBehavior;

public class TurnedToSuper implements TurnedBehavior {
    @Override
    public void turned() {
        System.out.println("啊！！！超级赛亚人变身！！！");
    }
}
