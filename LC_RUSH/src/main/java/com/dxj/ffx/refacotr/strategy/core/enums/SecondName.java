package com.dxj.ffx.refacotr.strategy.core.enums;

public enum SecondName {
    /**
     * 老孙家
     */
    SUN,
    /**
     * 贝吉塔家
     */
    CLOTHES,
    ;

    public void bigBomb() {
        switch (this) {
            case SUN:
                System.out.println("勇者无敌，天下第一");
                break;
            case CLOTHES:
                System.out.println("对波也不行，炸后现敌影");
                break;
            default:
                System.out.println("达咩");
        }
    }
}
