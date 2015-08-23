package com.slowstarter.designpatterns.observer.weather;

public class WeatherStation {

	public static void main(String[] args) {
		
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditonsDisplay = new CurrentConditionsDisplay(weatherData);
		
		weatherData.setMeasurements(80, 65, 30.4f);
		
	}
}
