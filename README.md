# Example application using Bugfender in Android

![Beta](https://bugfender.com/wp-content/uploads/2016/02/BETA.png)

## Essential points
* Add Bugfender maven repository to your `build.gradle` in the root project: `maven {
            url 'https://oss.sonatype.org/content/repositories/snapshots'
        }`
* Add Bugfender SDK dependency to your module `<module>/build.gradle`: `compile 'com.bugfender.sdk:android:0.3-SNAPSHOT'`
* Add the required permissions to your `AndroidManifest.xml` if you don't have them already `android.permission.ACCESS_NETWORK_STATE` and `android.permission.INTERNET`
* Initialize Bugfender in your `Application#onCreate()` with `Bugfender.init(this, "<YOUR APP KEY>", BuildConfig.DEBUG);`
* Log anything you want with `Bugfender.d()`, `Bugfender.w()`, `Bugfender.e()`
* If you detect an issue you can send it with `Bugfender.sendIssue("Title", "Message");`
* If you want to associate a value (String, Integer, Boolean or Float) to a device you can send it with (learn more about [Device associated data] (https://bugfender.com/blog/associated-device-information)):
  - `Bugfender.setDeviceString("user.email", "john@john.com");`
  - `Bugfender.setDeviceInteger("user.photo.image.width", 600);`
  - `Bugfender.setDeviceBoolean("user.is.logged", true);`
  - `Bugfender.setDeviceFloat("user.children", 3f);`
* Also you can remove a specific value associated with the device, you can remove it with: `Bugfender.removeDeviceKey("user.children");`
* Bugfender automatically generates an identifier for the application install in a device. You can retrieve it to show in your UI or send to your server: `Bugfender.getDeviceIdentifier();`

## SDK status
The SDK is still under development but the existent functionality has been thoroughly tested and **it is suitable for production**. There are no known issues with the SDK at the moment.

The following functionalities are missing (compared to the iOS SDK):

* Automated UI Event logging
* Automated logcat logging

### Contributions
We are releasing this early version because we want to get all possible feedback. Please feel free to open an issue or contact us at https://bugfender.com/contact .
