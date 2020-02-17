package com.zipcodewilmington.assessment1.part3;

/**
 * Created by leon on 2/16/18.
 */
public class Dog extends Pet {
    /**
     * @param name name of this Dog
     * @param age age of this dog
     */


    public Dog(String name, Integer age) {
        super(name, age);
    }

    /**
     * @param age age of this dog
     */
    public Dog(Integer age) {
        super(age);
    }

    /**
     * @param name name of this dog
     */
    public Dog(String name) {
        super(name);

    }

    /**
     * nullary constructor
     * by default, a dog's
     * name is DogName
     * age is 0
     */
    public Dog(String name, Integer age, PetOwner owner) {
        super(name, age, owner);
    }

    public Dog() {

    }
    /**
     * @return bark as a string
     */

    @Override
    public String speak() {
        return "Bark";
    }
}
