[![Release](https://jitpack.io/v/LimitedDaily/vlc-example-streamplayer.svg)]
(https://jitpack.io/#LimitedDaily/vlc-example-streamplayer)


## Setup
Add the JitPack repository in your build.gradle (top level module):
```gradle
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

And add next dependencies in the build.gradle of the module:
```gradle
dependencies {
    implementation 'com.github.LimitedDaily:vlc-example-streamplayer:0.0.4' 
}
```