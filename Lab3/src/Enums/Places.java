package Enums;
import Enums.Places;
import Interfaces.*;
import Enums.*;
import Classes.*;
import Abstract.Character;

public enum Places{
    SOFA("на диванчике"),
    HOME("в своём домике"),
    ROOF("на крыше");
    private final String name;
    Places(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}