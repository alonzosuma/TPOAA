package Patron_Observer;
import java.util.ArrayList;
import java.util.List;

class WeatherStation implements Subject{
    private List<Observer> observers;
    private int temperature;

    public WeatherStation() {
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver (Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver (Observer observer) {
        observers.remove (observer);
    }

    @Override
    public void notifyObservers (){
        for (Observer observer : observers){
            observer.update(temperature);
        }

    }

    public void setTemperature (int temperatura) {
        this.temperature = temperatura;
        notifyObservers();
    }
}
