package com.dxj.ffx.refacotr.observer.notes;

import com.dxj.ffx.refacotr.observer.notes.core.DashBoard;
import com.dxj.ffx.refacotr.observer.notes.core.WeatherData;

public class Try {
    public static void main(String[] args) {

        WeatherData weatherData = new WeatherData();

        DashBoard dashBoard = new DashBoard();
        dashBoard.resign(weatherData);


        weatherData.rain();
    }
}
