package com.dxj.ffx.refacotr.strategy.behavior.impl;

import com.dxj.ffx.refacotr.strategy.behavior.TurnedBehavior;

public class TurnedToSelf implements TurnedBehavior {
    @Override
    public void turned() {
        System.out.println("变成我自己,瓜吧");
    }
}
