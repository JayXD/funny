package com.dxj.ffx.refacotr.observer.notes;

import com.dxj.ffx.refacotr.observer.notes.core.DashBoard;
import com.dxj.ffx.refacotr.observer.notes.core.WeatherData;

public class Try {
    public static void main(String[] args) {
        DashBoard dashBoard = new DashBoard();
        WeatherData weatherData = new WeatherData();

        weatherData.assignObservers(dashBoard);
        weatherData.rain();
    }
}
