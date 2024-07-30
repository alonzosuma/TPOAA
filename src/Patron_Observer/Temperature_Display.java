package Patron_Observer;

public class Temperature_Display implements Observer{

    @Override
    public void update (int temperature) {
        System.out.println("Temperature Display: La temperatura actual es de: " + temperature);
    }
}
