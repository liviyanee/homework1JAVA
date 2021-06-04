package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(info(32,12));
        System.out.println(info(45,35));
        System.out.println(info(13,37));
        System.out.println(info(55,16));
        System.out.println(info(18,9));
        System.out.println(info(generateRandomAge(),24));


    }
    public static String info (int age,int temp ){

        if (age > 20 && age < 40 && temp > 20 && temp < 30 ) {

            return "Можно идти гулять";

        }
        else if (age < 20 && temp > 0 && temp <28) {
            return "Можно идти гулять";

        }
        else if (age > 45 && temp > 10 && temp < 25){
            return "Можно идти гулять";
        }
        else {
        return    "Оставайтесь дома";
        }

        }
    public static int generateRandomAge(){
        Random random = new Random();
        int age = random.nextInt(56);
        return age;
    }
    }


