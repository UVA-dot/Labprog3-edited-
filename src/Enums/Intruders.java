package Enums;

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