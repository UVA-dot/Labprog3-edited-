package Enums;

public enum Places{
    SOFA("на диванчике"),
    HOME("дом"),
    ROOF("на крыше"),
    INROOM("в комнате"),
    BASKET("корзинка"),
    KITCHEN("кухня"),
    BESIDETHEWALL("За стеной");
    private final String name;
    Places(String name){
        this.name = name;
    }
    @Override
    public String toString(){
        return this.name;
    }
}