package meteo;

import java.time.LocalDateTime;

// Принцип Interface Segregation: Интерфейс содержит только необходимые методы для работы с датчиками.
public interface MeteoSensor {
    int getId(); // идентификатор датчика

    Float getTemperature(); // температура датчика

    Float getHumidity(); // влажность

    Float getPressure(); // давление

    LocalDateTime getDateTime(); // время чтения данных датчика
}