package meteo;

import java.time.LocalDateTime;

// Принцип Single Responsibility: Класс отвечает только за адаптацию данных от ST500 к MeteoSensor.
// Принцип Liskov’s Substitution: ST500Adapter может быть использован вместо любого другого класса, реализующего MeteoSensor.
public class ST500Adapter implements MeteoSensor {
    private SensorTemperature sensorTemperature;

    public ST500Adapter(SensorTemperature sensorTemperature) {
        this.sensorTemperature = sensorTemperature;
    }

    public int getId() {
        return sensorTemperature.identifier();
    }

    public Float getTemperature() {
        return (float) sensorTemperature.temperature();
    }

    public Float getHumidity() {
        return null; // У ST500 нет данных о влажности
    }

    public Float getPressure() {
        return null; // У ST500 нет данных о давлении
    }

    public LocalDateTime getDateTime() {
        return LocalDateTime.of(sensorTemperature.year(), 1, 1, 0, 0)
                .plusDays(sensorTemperature.day() - 1)
                .plusSeconds(sensorTemperature.second());
    }
}