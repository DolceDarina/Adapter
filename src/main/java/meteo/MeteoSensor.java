package meteo;

import java.time.LocalDateTime;

// Принцип Interface Segregation: Интерфейс содержит только необходимые методы для работы с датчиками.
public interface MeteoSensor {
    int getId();

    Float getTemperature();

    Float getHumidity();

    Float getPressure();

    LocalDateTime getDateTime();
}