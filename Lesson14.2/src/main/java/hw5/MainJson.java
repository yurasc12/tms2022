package hw5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class MainJson {
    public static final String DIRNAME = "Lesson14.2/src/main/resources/";

    public static void main(String[] args) throws FileNotFoundException {
        String inputJson = DIRNAME + "car.json";
        ObjectMapper objectMapper = new ObjectMapper();
        InputStream input = new FileInputStream(inputJson);
        Car car = null;
        try {
            car = objectMapper.readValue(input, Car.class);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                input.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(car);


        Car carNew = new Car();
        carNew.setBrand("Bmw");
        carNew.setMaxSpeed(290);
        carNew.setPrice(29000);
        String outputJson = DIRNAME + "carnew.json";
        OutputStream outStream = new FileOutputStream(outputJson);
        try {
            objectMapper.writeValue(outStream, carNew);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
