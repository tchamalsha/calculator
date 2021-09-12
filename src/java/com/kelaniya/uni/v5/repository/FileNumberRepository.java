package com.kelaniya.uni.v5.repository;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileNumberRepository implements NumberRepository {

    public Double[] getNumbers() throws IOException {
        //read the numbers from text file
        List<String> numbersStrs = Files.readAllLines(Paths.get("C:\\Users\\tharu\\OneDrive\\Desktop\\software\\calculator\\src\\java\\numbers.txt"));

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));

        return new Double[]{number1,number2};

    }
}
