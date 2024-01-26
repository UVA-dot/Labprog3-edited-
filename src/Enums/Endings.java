package Enums;

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