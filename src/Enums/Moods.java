package Enums;

public enum Moods{
    AWESOME("В прекрасном настроении"),
    GOOD("В хорошем настроении"),
    BAD("В плохом настроении");
    private final String name;
    Moods(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}