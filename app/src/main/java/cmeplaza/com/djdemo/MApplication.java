package cmeplaza.com.djdemo;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import com.dji.sdk.sample.internal.controller.DJISampleApplication;
import com.secneo.sdk.Helper;

/**
 * Created by klx on 2018/1/29.
 * 自定义的Application
 */

public class MApplication extends Application {
    private DJISampleApplication djiSampleApplication;

    @Override
    protected void attachBaseContext(Context paramContext) {
        super.attachBaseContext(paramContext);
        Helper.install(MApplication.this);
        if (djiSampleApplication == null) {
            djiSampleApplication = new DJISampleApplication();
            djiSampleApplication.setContext(this);
        }
    }

    @Override
    public void onCreate() {
        super.onCreate();
        djiSampleApplication.onCreate();
    }
}
