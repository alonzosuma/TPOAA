package Patron_Observer;

public class Main {
    public static void main (String[] args){
        WeatherStation weatherStation = new WeatherStation();
        Temperature_Display temperatureDisplay = new Temperature_Display();
        Weather_Warning weatherWarning = new Weather_Warning();
        weatherStation.addObserver(temperatureDisplay);
        weatherStation.addObserver(weatherWarning);
        weatherStation.setTemperature(20);
        weatherStation.setTemperature(10);
    }
}
