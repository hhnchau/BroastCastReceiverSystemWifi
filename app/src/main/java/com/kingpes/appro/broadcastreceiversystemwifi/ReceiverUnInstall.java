package com.kingpes.appro.broadcastreceiversystemwifi;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by appro on 21/05/2018.
 */

public class ReceiverUnInstall extends BroadcastReceiver {

    Context context;

    @Override
    public void onReceive(Context context, Intent intent) {

        this.context = context;

        String action = intent.getAction();
        if (action == null)
            return;

        // when package removed
        if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
            Log.e(" BroadcastReceiver ", "onReceive called " + " PACKAGE_REMOVED ");
            Toast.makeText(context, " onReceive !!!! PACKAGE_REMOVED", Toast.LENGTH_LONG).show();
        }
        // when package installed
        else if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED")) {

            Log.e(" BroadcastReceiver ", "onReceive called " + "PACKAGE_ADDED");
            Toast.makeText(context, " onReceive !!!!." + "PACKAGE_ADDED", Toast.LENGTH_LONG).show();

        }

    }
}
