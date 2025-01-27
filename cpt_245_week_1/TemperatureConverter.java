public class TemperatureConverter {
    

    private static void convertToCelsius(double degreesInFahrenheit) {

        // #### Assignment Starts Here ####

        /**
         * 
         * Please write an "algorithm" below taking the "input parameter" degreesInFarenheit
         * and converting it to the variable "degreesInCelsius" which will be printed below
         *  
         */

        /** Attempt at figuring it out

         int Fahrenheit = (int) degreesInFahrenheit;
        
        float degreesInCelsius = ( (Fahrenheit - 32) * 5 / 9);
        */
        /*AI generrated line 22 */
        double degreesInCelsius = (degreesInFahrenheit - 32) * 5.0 / 9.0;

        // #### Assignment Ends Here ####


        System.out.println(degreesInFahrenheit + " to Celsius is: " + degreesInCelsius);

    }

    public static void main(System[] args) {

        double degreesInFahrenheit = 25;
        

        convertToCelsius(degreesInFahrenheit);


    }
}
