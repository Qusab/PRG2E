package Testy;

public class City {
    String CityName;
    Geolocation x,y;

    public City(String cityName) {
        CityName = cityName;
    }

    @Override
    public String toString() {
        return CityName + x + y;
    }
}
