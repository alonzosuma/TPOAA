package Patron_Observer;

public class Weather_Warning implements Observer{
    private static final int TEMPERATURA_LIMITE =30;

    @Override
    public void update (int temperature) {
        if (temperature > TEMPERATURA_LIMITE){
            System.out.println("Weather Warning: ¡Alerta! La temperatura ha superado los + " + TEMPERATURA_LIMITE + " grados.");
        }
    }
}