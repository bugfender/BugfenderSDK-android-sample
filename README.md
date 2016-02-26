# Example application using Bugfender in Android

![Beta](https://bugfender.com/wp-content/uploads/2016/02/BETA.png)

## Essential points
* Add Bugfender maven repository to your `build.gradle` in the root project: `maven {
            url 'https://oss.sonatype.org/content/repositories/snapshots'
        }`
* Add Bugfender SDK dependency to your module `<module>/build.gradle`: `compile 'com.bugfender.sdk:android:0.1.5-SNAPSHOT'`
* Add the required permissions to your `AndroidManifest.xml` if you don't have them already `android.permission.ACCESS_NETWORK_STATE` and `android.permission.INTERNET`
* Initialize Bugfender in your `Application#onCreate()` with `Bugfender.init(this, "<YOUR APP KEY>");`
* Log anything you want with `Bugfender.d()`, `Bugfender.w()`, `Bugfender.e()`
* If you detect an issue you can send it with `Bugfender.sendIssue("Title", "Message");`

## SDK status
Please bear in mind that the SDK is still in beta development and thus **it is not suitable for production**. There are a number of known issues with the SDK and web interface that still need to be addressed during the next weeks.

### Contributions
We are releasing this early version because we want to get all possible feedback. Please feel free to open an issue or contact us at https://bugfender.com/contact .
