package Enums;
import Enums.Places;
import Interfaces.*;
import Enums.*;
import Classes.*;
import Abstract.Character;

public enum Endings{
    Y("у"),
    A("а"),
    E("е");
    private final String name;
    Endings(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}