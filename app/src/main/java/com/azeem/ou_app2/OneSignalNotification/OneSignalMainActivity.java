package com.azeem.ou_app2.OneSignalNotification;

import android.app.Application;
import android.content.Intent;
import android.util.Log;

import com.azeem.ou_app2.MainScreen.CoursesMainActivity;
import com.azeem.ou_app2.MainScreen.JobsAndInternshipsMainActivity;
import com.onesignal.OSNotificationAction;
import com.onesignal.OSNotificationOpenResult;
import com.onesignal.OneSignal;
import org.json.JSONObject;

@SuppressWarnings("unused")

public class OneSignalMainActivity extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        OneSignal.startInit(this)
                .inFocusDisplaying(OneSignal.OSInFocusDisplayOption.Notification)
                .setNotificationOpenedHandler(new NotificationOpenedHandler())
                .unsubscribeWhenNotificationsAreDisabled(true)
                .init();
    }

    public class NotificationOpenedHandler implements OneSignal.NotificationOpenedHandler
    {
        @Override
        public void notificationOpened(OSNotificationOpenResult result)
        {
            OSNotificationAction.ActionType actionType = result.action.type;
            JSONObject data = result.notification.payload.additionalData;
            String activityToBeOpened;
            String activity;
            String info;

            if (data != null)
            {
                activityToBeOpened = data.optString("activityToBeOpened", null);
                info = data.optString("info", null);
                if (activityToBeOpened != null && activityToBeOpened.equals("courses"))
                {
                    // Log.i("OneSignal", "customkey set with value: " + activityToBeOpened);

                    Intent intent = new Intent(OneSignalMainActivity.this, CoursesMainActivity.class);
                    intent.putExtra("info",info);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
                }
                if (activityToBeOpened != null && activityToBeOpened.equals("jobs"))
                {
                    Intent intent = new Intent(OneSignalMainActivity.this, JobsAndInternshipsMainActivity.class);
                    intent.putExtra("info",info);
                    intent.setFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_NO_HISTORY);
                    startActivity(intent);
                }
            }
        }
    }
}