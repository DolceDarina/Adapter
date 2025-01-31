package meteo;

// Принцип Single Responsibility: Класс отвечает только за сохранение данных.
// Принцип Dependency Inversion: Класс зависит от абстракции MeteoSensor, а не от конкретной реализации.
public class MeteoStore {
    public boolean save(MeteoSensor meteoSensor) {
        System.out.format("Saving data from sensor [%d] at %s%n temperature - %f ; humidity - %f ; pressure - %f \n\r",
                meteoSensor.getId(),
                meteoSensor.getDateTime(),
                meteoSensor.getTemperature(),
                meteoSensor.getHumidity(),
                meteoSensor.getPressure());
        return true;
    }
}