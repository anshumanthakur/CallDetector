package com.example.anshuman.parse_1;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
        // TODO: This method is called when the BroadcastReceiver is receiving
        // an Intent broadcast.
        String action = intent.getAction();
        if(action.equals(Intent.ACTION_NEW_OUTGOING_CALL)){
            Toast.makeText(context, "hey..", Toast.LENGTH_SHORT).show();
        }
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
