package comli.example.c4q.jets.notifier;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v4.app.NotificationCompat;



/**
 * Created by c4q on 2/6/18.
 */

public class Notification_receiver extends BroadcastReceiver{
    @Override
    public void onReceive(Context context, Intent intent) {

        NotificationManager notificationManager =(NotificationManager) context.getSystemService(context.NOTIFICATION_SERVICE);

        Intent repeating_intent = new Intent(context, Repeating_Acitivity.class);
        repeating_intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);

        PendingIntent pendingIntent = PendingIntent.getActivity(context,100,repeating_intent,PendingIntent.FLAG_UPDATE_CURRENT);

        NotificationCompat.Builder builder = new NotificationCompat.Builder(context)
                .setContentIntent(pendingIntent)
                .setSmallIcon(com.bumptech.glide.R.drawable.notification_template_icon_bg)
                .setContentTitle("Hey bro")
                .setContentText("Just trying bro")
                .setAutoCancel(true);

        notificationManager.notify(100,builder.build());
    }
}
