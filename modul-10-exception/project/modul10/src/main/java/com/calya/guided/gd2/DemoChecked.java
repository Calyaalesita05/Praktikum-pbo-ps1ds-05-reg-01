package com.calya.guided.gd2;

import java.io.FileReader;
import java.io.IOException;

public class DemoChecked {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("data.txt");
            System.out.println("file berhasil dibuka"); 
        } catch (IOException e) {
            System.out.println("Terjadi eksepsi");
        }

        System.out.println("Program selesai"); 
    }
}
