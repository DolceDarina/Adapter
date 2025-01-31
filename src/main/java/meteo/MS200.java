package meteo;

import java.time.LocalDateTime;

// Принцип Single Responsibility: Класс отвечает только за предоставление данных от датчика MS200.
// Принцип Liskov’s Substitution: Класс MS200 может быть использован вместо любого другого класса, реализующего MeteoSensor.
public class MS200 implements MeteoSensor {
    private int id;

    public MS200(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public Float getTemperature() {
        return (float) 20;
    }

    public Float getHumidity() {
        return (float) 60;
    }

    public Float getPressure() {
        return (float) 752.4;
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.now();
    }
}