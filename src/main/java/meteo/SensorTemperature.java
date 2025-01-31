package meteo;

// Принцип Interface Segregation: Интерфейс содержит только необходимые методы для работы с датчиком ST500.
public interface SensorTemperature {
    int identifier();
    double temperature();
    int year();
    int day();
    int second();
}