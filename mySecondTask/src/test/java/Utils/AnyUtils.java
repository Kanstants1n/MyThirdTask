package Utils;

import org.apache.commons.lang3.RandomStringUtils;

public class AnyUtils {

    //random values
    public static double randomNumber = 1 + (int) (Math.random() * 6);
    public static String randomString = RandomStringUtils.randomAlphabetic(10);

    //parse double to string
    public static String parseAnyValueDoubleToString(String anyString){
        double resultValue = Double.parseDouble(anyString);
        return Double.toString(resultValue);
    }
}
