package com.sakura.creationalPatterns.PrototypePattern.impl;

import com.sakura.creationalPatterns.PrototypePattern.Animal.Animal;

public class Duck extends Animal {

    public Duck() {
        type = "duck";
    }

    @Override
    public void animal() {
        System.out.println("te is duck");
    }
}
