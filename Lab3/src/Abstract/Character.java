package Abstract;

import Interfaces.SimpleInterface;

import java.util.Objects;

public abstract class Character implements SimpleInterface {
    protected String name;
    protected int age;
    protected String cur_state = "";
    public Character(){
        this.name = "Персонаж";
        this.age = 0;
    }
    public Character(String name) {
        this.name = name;
    }
    public Character(String name, int age){ this.name = name; this.age = age;}
    public void setName(String name){
        this.name = name;
    }
    public void setState(String cur_state){
        this.cur_state = this.name + cur_state;
    }
    public void appendState(String cur_state){
        this.cur_state += cur_state;
    }
    public String getState(){
        return this.cur_state;
    }
    @Override
    public String getName(){
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Character character = (Character) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}