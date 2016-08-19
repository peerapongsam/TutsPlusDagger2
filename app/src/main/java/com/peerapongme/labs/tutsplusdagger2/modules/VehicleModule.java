package com.peerapongme.labs.tutsplusdagger2.modules;

import com.peerapongme.labs.tutsplusdagger2.models.Motor;
import com.peerapongme.labs.tutsplusdagger2.models.Vehicle;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by peerapong on 8/19/16.
 */
@Module
public class VehicleModule {

    @Provides
    @Singleton
    Motor provideMotor() {
        return new Motor();
    }

    @Provides
    @Singleton
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }
}
