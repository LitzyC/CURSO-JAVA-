public class Exercise15 {
    //Conversor de temperaturas
    //Crear funciones para convertir 
    //entre Celsius, Fahrenheit y Kelvin.
    
    
    public static double celsiusfarenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    
    public static double celsiuskelvin(double celsius) {
        return (celsius * 9/5) + 273.15;
    }
    
    public static double farenheitcelsius(double farenheit) {
        return (farenheit - 32 ) * 5/9;
    }
    
    public static double farenheitkelvin(double farenheit) {
        return (farenheit + 459.57 ) * 5/9;
    }

   /* public static double kelvincelsius(double kelvin) {
        return kelvin - 273.15;
    }

    public static double kelvinfarenheit(double kelvin) {
        return ((kelvin-273.15)*1.8) + 32;
    }*/

    public static void main(String[] args) {
    }
}
