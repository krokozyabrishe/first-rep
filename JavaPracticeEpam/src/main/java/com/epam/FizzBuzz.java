package com.epam;
import org.apache.log4j.Logger;

public class FizzBuzz {
    private static Logger logger = Logger.getLogger(FizzBuzz.class);

    public static void main(String[] args) {
        for (int i = 1; i < 100; i++) {
            if (i % 3 == 0) {
                logger.info("Поделилось 3");
                System.out.print("Fizz");
            }
            if (i % 5 == 0) {
                logger.info("Поделилось 5");
               System.out.print("Buzz");
            }
        }
    }
}
