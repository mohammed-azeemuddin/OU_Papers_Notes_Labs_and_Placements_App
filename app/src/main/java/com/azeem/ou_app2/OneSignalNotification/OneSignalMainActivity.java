package com.azeem.ou_app2.OneSignalNotification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.azeem.ou_app2.R;
import com.onesignal.OneSignal;

public class OneSignalMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one_signal_main);

        // OneSignal Initialization
        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

    }
}
