package party.liyin.mipushfakeframework

import android.os.Bundle
import android.app.Activity
import kotlinx.android.synthetic.main.activity_main.*

import com.xiaomi.xmsf.R
import party.liyin.mipushfakeframework.utils.FakeBuildUtils

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fakebuild_active.setOnClickListener { runFake() }
        check()
    }

    fun check(){
        Thread(Runnable {
            val isMiuiBuild = FakeBuildUtils.isMiuiBuild()
            runOnUiThread { fakebuild.setText(getString(R.string.fake_build_status,getString(if(isMiuiBuild) R.string.fake_boot_success else R.string.fake_boot_fail))) }
        }).start()
    }

    fun runFake() {
        Thread(Runnable {
            val isMiuiBuild = FakeBuildUtils.insertMiui()
            runOnUiThread { fakebuild.setText(getString(R.string.fake_build_status,getString(if(isMiuiBuild) R.string.fake_boot_success else R.string.fake_boot_fail))) }
        }).start()
    }
}
