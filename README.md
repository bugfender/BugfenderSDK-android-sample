# Bugfender Android SDK

[![Javadocs](http://www.javadoc.io/badge/com.bugfender.sdk/android.svg)](http://www.javadoc.io/doc/com.bugfender.sdk/android)

## SDK Installation
Here are the main points to getting Bugfender working on your apps:

* Get an app key at [bugfender.com](https://bugfender.com/)
* Add Bugfender SDK dependency to your module `<module>/build.gradle`: `compile 'com.bugfender.sdk:android:0.+'`
* Initialize Bugfender in your `Application#onCreate()` with:

```java
Bugfender.init(this, "<YOUR APP KEY>", BuildConfig.DEBUG);
Bugfender.enableLogcatLogging();
Bugfender.enableUIEventLogging(this);
```

* If using Proguard, you do not need to change your configuration. Bugfender is compatible out of the box.
* If you detect an issue, you can send it calling `Bugfender.sendIssue("Title", "Message");`
* If you want to associate a value (String, Integer, Boolean or Float) to a device, you can send it with (learn more about [Device associated data] (https://bugfender.com/blog/associated-device-information)):
  - `Bugfender.setDeviceString("user.email", "john@john.com");`
  - `Bugfender.setDeviceInteger("user.photo.image.width", 600);`
  - `Bugfender.setDeviceBoolean("user.is.logged", true);`
  - `Bugfender.setDeviceFloat("user.children", 3f);`
* If you want to remove a specific value associated with the device, you can do it with: `Bugfender.removeDeviceKey("user.children");`
* Bugfender automatically generates an identifier for the application install in a device. You can retrieve it to show in your UI or send it to your server: `Bugfender.getDeviceIdentifier();`

This repository contains a sample application using Bugfender.

## More information
### Docs
For more information on all methods available, please go to the [Bugfender Android reference documentation](http://www.javadoc.io/doc/com.bugfender.sdk/android).

### SDK status
The SDK is suitable for production. Please feel free to open an issue or contact us at [bugfender.com/contact](https://bugfender.com/contact) .
