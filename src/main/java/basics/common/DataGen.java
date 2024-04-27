package basics.common;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataGen {

    public static String firstName(){
        Faker faker = new Faker(new Locale("en-IND"));
       return faker.name().firstName();
    }
    public static String lastName(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().lastName();
    }
    public static String email(){
        Faker faker = new Faker(new Locale("en-IND"));
        return faker.name().firstName()+"@testmail.com";
    }

    public static void main(String[] args) {

    }
}
