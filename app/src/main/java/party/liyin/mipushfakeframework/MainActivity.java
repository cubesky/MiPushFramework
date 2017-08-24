package party.liyin.mipushfakeframework;

import android.os.Bundle;
import android.app.Activity;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

import com.xiaomi.xmsf.R;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //noinspection deprecation
//        TextView descrView = ((TextView)findViewById(R.id.decrView));
//        descrView.setText(Html.fromHtml(getString(R.string.descr)));
//        descrView.setMovementMethod(LinkMovementMethod.getInstance());
    }

}
