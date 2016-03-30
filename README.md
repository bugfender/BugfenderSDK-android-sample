# Example application using Bugfender in Android

![Beta](https://bugfender.com/wp-content/uploads/2016/02/BETA.png)

## Essential points
* Add Bugfender maven repository to your `build.gradle` in the root project: `maven {
            url 'https://oss.sonatype.org/content/repositories/snapshots'
        }`
* Add Bugfender SDK dependency to your module `<module>/build.gradle`: `compile 'com.bugfender.sdk:android:0.1.8-SNAPSHOT'`
* Add the required permissions to your `AndroidManifest.xml` if you don't have them already `android.permission.ACCESS_NETWORK_STATE` and `android.permission.INTERNET`
* Initialize Bugfender in your `Application#onCreate()` with `Bugfender.init(this, "<YOUR APP KEY>", BuildConfig.DEBUG);`
* Log anything you want with `Bugfender.d()`, `Bugfender.w()`, `Bugfender.e()`
* If you detect an issue you can send it with `Bugfender.sendIssue("Title", "Message");`

## SDK status
The SDK is still under development but the existent functionality has been thoroughly tested and **it is suitable for production**. There are no known issues with the SDK at the moment.

The following functionalities are missing (compared to the iOS SDK):

* [Device associated data] (https://bugfender.com/blog/associated-device-information)
* Automated UI Event logging
* Automated logcat logging

### Contributions
We are releasing this early version because we want to get all possible feedback. Please feel free to open an issue or contact us at https://bugfender.com/contact .
