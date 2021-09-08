[![Release](https://jitpack.io/v/LimitedDaily/vlc-example-streamplayer.svg)](https://jitpack.io/#LimitedDaily/vlc-example-streamplayer)

## Overview
Updated VLC Version 3.4.0

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
### libvlc
```gradle
dependencies {
    implementation 'com.github.LimitedDaily.vlc-example-streamplayer:libvlc:1.0.0'
}
```

### limitvlc Lib.
```gradle
dependencies {
    implementation 'com.github.LimitedDaily.vlc-example-streamplayer:limitvlc:1.0.0'
}
```
