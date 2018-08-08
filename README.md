## local

run espresso tests: `./gradlew connectedAndroidTest`

## docker

- build docker image: `docker build -t docker-android .`
- build the android app: `docker run docker-android bash -c './gradlew assembleRelease'`
- interactive shell on docker container: `docker run -it docker-android bash`

## TODO

- install and run emulator before starting test in docker
- run tests in docker: `docker run docker-android bash -c './gradlew connectedAndroidTest'`

## notes

`export PATH=$PATH:$ANDROID_HOME/platform-tools`
`export PATH=$PATH:$ANDROID_HOME/tools`
`export PATH=$PATH:$ANDROID_HOME/tools/bin`

`sdkmanager --list`
`sdkmanager "system-images;android-25;google_apis;armeabi-v7a"`
`echo "no" | avdmanager create avd -n test2 -k "system-images;android-25;google_apis;armeabi-v7a"`
`avdmanager list avd`
`emulator -avd test2 -noaudio -no-boot-anim -no-window &`
`adb devices`
