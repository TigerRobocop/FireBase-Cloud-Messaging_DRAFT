package com.tigerrobocop.liv.fcm.fcm;

import android.app.Application;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by Livia on 02/12/2017.
 */

public class FCM_FirebaseMessagingService extends FirebaseMessagingService {

    private static String TAG = FCM_FirebaseMessagingService.class.getName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        // TODO(developer): Handle FCM messages here.
        // If the application is in the foreground handle both data and notification messages here.
        // Also if you intend on generating your own notifications as a result of a received FCM
        // message, here is where that should be initiated. See sendNotification method below.
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Log.d(TAG, "Notification Message Body: " + remoteMessage.getNotification().getBody());

       // Toast.makeText(Application.getContext(), "",  Toast.LENGTH_SHORT);
    }

}
