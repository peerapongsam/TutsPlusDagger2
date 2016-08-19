package com.peerapongme.labs.tutsplusdagger2.components;

import com.peerapongme.labs.tutsplusdagger2.models.Vehicle;
import com.peerapongme.labs.tutsplusdagger2.modules.VehicleModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by peerapong on 8/19/16.
 */
@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {
    Vehicle provideVehicle();
}
