package com.peerapongme.labs.tutsplusdagger2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.peerapongme.labs.tutsplusdagger2.components.DaggerVehicleComponent;
import com.peerapongme.labs.tutsplusdagger2.components.VehicleComponent;
import com.peerapongme.labs.tutsplusdagger2.models.Vehicle;
import com.peerapongme.labs.tutsplusdagger2.modules.VehicleModule;

public class MainActivity extends AppCompatActivity {

    Vehicle mVehicle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VehicleComponent vehicleComponent = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();

        mVehicle = vehicleComponent.provideVehicle();

        Toast.makeText(this, String.valueOf(mVehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }
}
