## local

run espresso tests: `./gradlew connectedAndroidTest`

## docker

* build docker image: `docker build -t docker-android .`
* interactive shell on docker container: `docker run -it docker-android bash`
* run tests in docker: `docker run docker-android bash -c './gradlew connectedAndroidTest'`

## TODO

install and run emulator before starting test in docker