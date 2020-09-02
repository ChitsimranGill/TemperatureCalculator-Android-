package edu.sjsu.android.temperatureconverter;

public class ConverterUtil
{
    public static float convertFahrenheitToCelsius(float fahrenheit)
    {
        return ((fahrenheit - 32)*5/9);
    }

    public static float convertCelesiusToFahrenheit(float celsius)
    {
        return ((celsius * 9)/5)+32;
    }
}
