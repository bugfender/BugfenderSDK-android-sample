package com.bugfender.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.bugfender.sdk.Bugfender;

public class MainActivity extends AppCompatActivity {

  @Override protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    //Bugfender logs
    //Bugfender debug log
    Bugfender.d("DEBUG", "This message is a debug");

    //Bugfender error log
    Bugfender.e("ERROR", "This message is a error");

    //Bugfender warning log
    Bugfender.w("WARNING", "This message is a warning");

    //Bugfender send issue
    Bugfender.sendIssue("Title", "Message");
  }
}
