package com.ayaanle.h_suuq.utils

import android.app.Notification
import android.app.NotificationChannel
import android.app.NotificationManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.graphics.BitmapFactory
import androidx.core.content.ContextCompat.getSystemService

class Notifications {
    lateinit var notificationManager : NotificationManager
    lateinit var notificationChannel : NotificationChannel
    lateinit var builder : Notification.Builder
    private val channelId = "i.apps.notifications"
    private val description = "Test notification"
    public constructor()
    {
        notificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        button.setOnClickListener{
            val intent = Intent(this , afterNotification::class.java)
            val pendingintent = PendingIntent.getActivities(this , 0, arrayOf(intent), PendingIntent.FLAG_UPDATE_CURRENT)
            val contentView = RemoteViews(packageName , R.layout.activity_after_notification)
            notificationChannel = NotificationChannel(channelId , description , NotificationManager.IMPORTANCE_HIGH)
            notificationChannel.enableLights(true)
            notificationChannel.lightColor = Color.GREEN
            notificationChannel.enableVibration(true)
            notificationManager.createNotificationChannel(notificationChannel)
            builder = Notification.Builder(this , channelId)
                .setContent(contentView)
                .setSmallIcon(R.drawable.ic_home_black_24dp)
                .setLargeIcon(BitmapFactory.decodeResource(this.resources , R.drawable.ic_launcher_background))
                .setContentIntent(pendingintent)


            notificationManager.notify(1234 , builder.build())
        }
    }
}