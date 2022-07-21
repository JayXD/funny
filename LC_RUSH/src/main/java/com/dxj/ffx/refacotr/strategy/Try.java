package com.dxj.ffx.refacotr.strategy;

import com.dxj.ffx.refacotr.strategy.behavior.impl.TurnedToSelf;
import com.dxj.ffx.refacotr.strategy.behavior.impl.TurnedToSuper;
import com.dxj.ffx.refacotr.strategy.core.SaiyaJin;
import com.dxj.ffx.refacotr.strategy.core.enums.SecondName;
import com.dxj.ffx.refacotr.strategy.core.impl.Bejita;
import com.dxj.ffx.refacotr.strategy.core.impl.Pangjiang;
import com.dxj.ffx.refacotr.strategy.core.impl.SunWukong;

public class Try {
    public static void main(String[] args) {
        SaiyaJin sunWukong = new SunWukong(SecondName.SUN, new TurnedToSuper());
        sunWukong.introduce();
        sunWukong.turned();
        sunWukong.bigBomb();


        Pangjiang pangjiang = new Pangjiang(SecondName.SUN, new TurnedToSelf());
        pangjiang.introduce();
        pangjiang.turned();
        pangjiang.bigBomb();


        Bejita bejita = new Bejita(SecondName.CLOTHES, new TurnedToSuper());
        bejita.introduce();
        bejita.turned();
        bejita.bigBomb();

    }

}
