package party.liyin.mipushfakeframework.service

import android.app.IntentService
import android.content.Intent
import android.widget.Toast
import com.xiaomi.xmsf.R
import party.liyin.mipushfakeframework.utils.FakeBuildUtils


class FakeBuildIntentService : IntentService("FakeBuildIntentService") {

    override fun onHandleIntent(intent: Intent?) {
        Toast.makeText(this, if(FakeBuildUtils.insertMiui()) R.string.fake_boot_success else R.string.fake_boot_fail  ,Toast.LENGTH_SHORT).show()
    }

}
