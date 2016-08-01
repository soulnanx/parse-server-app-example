package br.com.beta.push;

import android.content.Context;
import android.content.Intent;

import com.parse.ParsePushBroadcastReceiver;

/**
 * Created by renan on 31/07/16.
 */
public class PushReceiverParse extends ParsePushBroadcastReceiver {
    private Intent intent;

    @Override
    protected void onPushOpen(Context context, Intent intentParams) {
        intent = new Intent(context, NewMainActivity.class);
        intent.putExtras(intentParams.getExtras());
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }
}
