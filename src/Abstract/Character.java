package Abstract;

import Enums.Places;
import Exceptions.IQBelowZeroException;

import Interfaces.GetSmartable;
import Interfaces.NameGetter;

import java.util.Objects;

public abstract class Character implements NameGetter, GetSmartable {
    protected String name;
    protected int age;
    protected Places place;
    protected String cur_state = "";
    protected int IQ;
    public Character(){
        this.name = "Персонаж";
        this.age = 0;
    }
    public Places getPlace(){
        return this.place;
    }
    public void setPlace(Places place){
        this.place = place;
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
    public void GetSmarter(int IQ){
        this.IQ += IQ;
        if (IQ > 0) {
            this.cur_state = String.format("%s Поумнел на %s", this.name, IQ);
        }
        else if (IQ == 0){
            this.cur_state = String.format("%s не образумел", this.name);
        }
        else {
            throw new IQBelowZeroException(String.format("%s has IQ below zero", this.name));
        }
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