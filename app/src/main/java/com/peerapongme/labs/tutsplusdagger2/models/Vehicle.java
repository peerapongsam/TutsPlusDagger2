package com.peerapongme.labs.tutsplusdagger2.models;

/**
 * Created by peerapong on 8/19/16.
 */

public class Vehicle {
    private Motor motor;

    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value) {
        motor.accelerate(value);
    }

    public void stop() {
        motor.brake();
    }

    public int getSpeed() {
        return motor.getRpm();
    }
}
