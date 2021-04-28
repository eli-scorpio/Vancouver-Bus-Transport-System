
package testProgram;

import functions.Function3;
import java.io.FileNotFoundException;

public class testFunction3
{
    public static void main(String[] args) throws FileNotFoundException
    {
        Function3 function3 = new Function3();
        
        function3.printTripsWithGivenArrivalTimes("5:35:39");
        function3.printTripsWithGivenArrivalTimes("29:00:00");
        function3.printTripsWithGivenArrivalTimes("27:10:12");
    }
}
