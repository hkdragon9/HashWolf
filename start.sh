#! /bin/bash

java -jar ./backend/gs-rest-service/initial/target/gs-rest-service-0.1.0.jar &

node app.js &

exit 0
