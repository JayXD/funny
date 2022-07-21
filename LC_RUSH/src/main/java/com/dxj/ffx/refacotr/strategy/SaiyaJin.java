package com.dxj.ffx.refacotr.strategy;

/**
 * 赛亚人
 */
public abstract class SaiyaJin {

    public abstract void introduce();

    /**
     * 变身
     */
    public void turned() {
        System.out.println("啊！！！！->变身成超级赛亚人");
    }


    /**
     * 战斗
     */
    public void fight() {
        System.out.println("打打打！！！");
    }

}
