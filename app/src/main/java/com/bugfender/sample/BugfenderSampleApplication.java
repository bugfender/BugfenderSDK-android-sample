package com.bugfender.sample;

import android.app.Application;
import com.bugfender.sdk.Bugfender;

public class BugfenderSampleApplication extends Application {

  @Override public void onCreate() {
    super.onCreate();

    // Initialize Bugfender
    Bugfender.init(this, "APPLICATION_TOKEN", BuildConfig.DEBUG); //TODO: replace with your app token here
    Bugfender.enableLogcatLogging();
    Bugfender.enableUIEventLogging(this);
  }
}
