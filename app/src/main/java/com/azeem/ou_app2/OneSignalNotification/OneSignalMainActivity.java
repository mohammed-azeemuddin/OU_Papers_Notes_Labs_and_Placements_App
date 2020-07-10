package com.azeem.ou_app2.OneSignalNotification;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.azeem.ou_app2.MainScreen.MainActivity;
import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;

import org.json.JSONObject;

public class OneSignalMainActivity extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        OneSignal.startInit(this)
                .setNotificationOpenedHandler(new ExampleNotificationOpenedHandler())
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();

    }

    private class ExampleNotificationOpenedHandler implements OneSignal.NotificationOpenedHandler {

        // This fires when a notification is opened by tapping on it.
        @Override
        public void notificationOpened(OSNotificationOpenResult result) {

            JSONObject data = result.notification.payload.additionalData;

            String customKey = null;
            String openURL = null;
            Object activityToLaunch = MainActivity.class;

            if (data != null) {
                customKey = data.optString("customkey", null);
                openURL = data.optString("openURL", null);
            }

            // The following can be used to open an Activity of your choice.
            // Replace - getApplicationContext() - with any Android Context.
            // Intent intent = new Intent(getApplicationContext(), YourActivity.class);

            Intent intent = new Intent(OneSignalMainActivity.this, (Class<?>) activityToLaunch);
            intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.putExtra("openURL", openURL);
            Log.i("OneSignalExample", "openURL = " + openURL);
            startActivity(intent);

        }
    }
}
