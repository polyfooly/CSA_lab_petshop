package me.indychkov.demo;

public class AnimalNotFoundException extends Exception {
    public AnimalNotFoundException(long id) {
        super(String.format("Animal with id %s is not found!", id));
    }
}

