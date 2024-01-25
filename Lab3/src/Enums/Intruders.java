package Enums;
import Enums.Places;
import Interfaces.*;
import Enums.*;
import Classes.*;
import Abstract.Character;

public enum Intruders {
    FILLE("Филле"), RULLE("Рулле");
    String name;
    Intruders(String name) {
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}