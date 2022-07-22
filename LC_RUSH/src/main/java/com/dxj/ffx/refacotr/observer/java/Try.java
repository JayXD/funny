package com.dxj.ffx.refacotr.observer.java;

public class Try {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        DashBoard dashBoard = new DashBoard(weatherData);

        weatherData.rain();

    }
}
