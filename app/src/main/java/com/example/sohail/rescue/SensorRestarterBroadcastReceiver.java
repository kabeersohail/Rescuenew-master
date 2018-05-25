package com.example.sohail.rescue;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

/**
 * Created by fabio on 24/01/2016.
 */
public class SensorRestarterBroadcastReceiver extends BroadcastReceiver {

//    static boolean k;

    @Override
    public void onReceive(Context context, Intent intent) {
//        GPSTracker gpsTracker = new GPSTracker(context);
//        k = gpsTracker.canGetLocation();
//        if(k){
            Toast.makeText(context,"Service Stopped", Toast.LENGTH_SHORT).show();
            Log.i(SensorRestarterBroadcastReceiver.class.getSimpleName(), "Service Stops! Oooooooooooooppppssssss!!!!");
            FirebaseUser firebaseUser = FirebaseAuth.getInstance().getCurrentUser();
            if(firebaseUser!=null){
                context.startService(new Intent(context, HelloService.class));
            }
            else {
                context.startService(new Intent(context, HelloService.class));
                Toast.makeText(context,"firebase or location",Toast.LENGTH_SHORT).show();
            }
//        }
    }

}
