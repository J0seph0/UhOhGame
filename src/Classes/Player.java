package Classes;

import java.util.ArrayList;

public class Player {
    //our player class will have some details about them
    int age;
    String name, typeOfCharacter;
    ArrayList<String> achievements = new ArrayList<String>();

    public Player(int age, String name, String typeOfCharacter, ArrayList<String> achievements){
        this.age = age;
        this.name = name;
        this.typeOfCharacter = typeOfCharacter;
        this.achievements = achievements;
    }


}
