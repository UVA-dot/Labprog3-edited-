package Enums;
import Enums.Places;
import Interfaces.*;
import Enums.*;
import Classes.*;
import Abstract.Character;

public enum Actions{
    LAUGH(" хохотал"),
    INSPIRE(" внушил"),
    BELIEVE(" поверил"),
    FIRED(" сгорал"),
    TAME(" курощать"),
    KNEW(" знал"),
    KNOW(" знать"),
    LIE(" лежать"),
    LET(" предоставил"),
    DONE(" сделал"),
    SCARE(" спугнуть");
    private final String name;
    Actions(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}