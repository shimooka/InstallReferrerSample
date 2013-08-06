package jp.doyouphp.android.sample.installreferrersample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

public class InstallReferrerReceiver3 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        if (!intent.getAction().equals("com.android.vending.INSTALL_REFERRER")) {
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        Log.i("InstallReferrerReceiver3", extras.getString("referrer"));
    }
}
