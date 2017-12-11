package com.tigerrobocop.liv.fcm.fcm;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Livia on 02/12/2017.
 */

public class FCM_InstanceIDService extends FirebaseInstanceIdService
{
    private static String TAG = FCM_InstanceIDService.class.getName();

    public FCM_InstanceIDService() {
    }

    @Override
    public void onTokenRefresh() {
        // Get updated InstanceID token.
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();
        Log.d(TAG, "Refreshed token: " + refreshedToken);

        // TODO: Implement this method to send any registration to your app's servers.
         //sendRegistrationToServer(refreshedToken);


    }
}
