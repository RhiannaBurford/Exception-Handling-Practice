

public class Thermostat {

    public void setTemperature(int temp) throws InvalidTemperatureException{
        if (15 > temp || temp > 30){
            throw new InvalidTemperatureException("Temperature should not be in this range");
        }
    }

    public void updateHomeSettings(){
        try {
            setTemperature(10);
        }
        catch (InvalidTemperatureException e){
            System.out.println("ERROR: " + e.getMessage());
        }
    }
}
