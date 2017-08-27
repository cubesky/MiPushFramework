package party.liyin.mipushfakeframework.listener

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import party.liyin.mipushfakeframework.service.FakeBuildIntentService

class BootReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val bootIntent = Intent(context,FakeBuildIntentService::class.java)
        bootIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
        context.startService(bootIntent)
    }
}
