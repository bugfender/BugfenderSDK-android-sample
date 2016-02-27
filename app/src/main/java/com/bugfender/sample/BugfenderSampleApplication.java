package com.bugfender.sample;

import android.app.Application;
import com.bugfender.sdk.Bugfender;

public class BugfenderSampleApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();

    // Initialize the bugfender sdk.
    Bugfender.init(this, "APPLICATION_TOKEN", BuildConfig.DEBUG);
  }
}
