package meteo;

public class Main {

    public static void main(String[] args) {
        // Принцип Single Responsibility: Класс Main отвечает только за запуск программы.
        MeteoStore meteoDb = new MeteoStore();

        // Используем существующий датчик MS200
        MeteoSensor ms200_1 = new MS200(1);
        meteoDb.save(ms200_1);

        // Принцип Open/Closed: Добавляем поддержку нового датчика ST500 через адаптер.
        // Мы не изменяем существующий код, а расширяем его.
        ST500Info st500Info = new ST500Info();
        SensorTemperature sensorTemperature = st500Info.getData();
        MeteoSensor st500Adapter = new ST500Adapter(sensorTemperature); // Адаптер для ST500
        meteoDb.save(st500Adapter); // Сохраняем данные через адаптер
    }
}