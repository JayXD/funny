package com.dxj.ffx.refacotr.strategy.core;

import com.dxj.ffx.refacotr.strategy.core.enums.SecondName;
import com.dxj.ffx.refacotr.strategy.behavior.TurnedBehavior;

/**
 * 赛亚人
 */
public abstract class SaiyaJin {

    private SecondName secondName;

    /**
     * 初始化时绑定，或动态设定行为
     */
    private TurnedBehavior turnedBehavior;

    public SaiyaJin(SecondName secondName, TurnedBehavior turnedBehavior) {
        this.secondName = secondName;
        this.turnedBehavior = turnedBehavior;
    }

    /**
     * 自我介绍
     * 每个人都不一样的方法
     */
    public abstract void introduce();

    /**
     * 变身
     * 一部分人相同，一部人人不同的方法
     * 直接把策略行为做为类的属性
     */
    public void turned() {
        turnedBehavior.turned();
    }

    /**
     * 对波能力
     * 一部分人相同，一部人人不同的方法
     * 把策略与对象属性做关联，实现方式多种。
     */
    public void bigBomb() {
        secondName.bigBomb();
    }

    /**
     * 战斗
     * 大家都一样的方法
     */
    public void fight() {
        System.out.println("打打打！！！");
    }

    public void assignTurned(TurnedBehavior turnedBehavior) {
        this.turnedBehavior = turnedBehavior;
    }

    public void assignSecondName(SecondName secondName) {
        this.secondName = secondName;
    }
}
