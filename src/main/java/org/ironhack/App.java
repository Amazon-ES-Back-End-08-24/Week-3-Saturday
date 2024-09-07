package org.ironhack;

import com.google.gson.Gson;
import org.ironhack.classes.User;

public class App {
    public static void main(String[] args) {

        // JSON formato ligero de intercambio de datos

//        {
//                "name": "John",
//                "age": 30,
//        }

        String json = "{\"name\": \"John\",\"age\": 30}";
        System.out.println("This is my JSON \n" + json);
        Gson gson = new Gson();

        // TipoDeDatoAlQueTraducir nombre = gson.fromJson(loQueQueremosTraducir , claseALaQueTraducimos);
        User user = gson.fromJson(json, User.class);

//        System.out.println(user.getName());
//        System.out.println(user.getAge());

        System.out.println("This is my user from JSON \n" + user.toString());

        User user1 = new User("Pepito", 37);
        System.out.println("This is my user1 \n" + user1.toString());

        //System.out.println(user1 instanceof User);
        String json1 = gson.toJson(user1);
        System.out.println("This is my JSON from user1 \n" + json1);
    }
}
