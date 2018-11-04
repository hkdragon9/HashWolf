#! /bin/bash

java -jar ./backend/gs-rest-service/initial/target/gs-rest-service-0.1.0.jar &

java -jar ./frontend/gs-rest-service/initial/target/gs-rest-service-0.1.0.jar &

exit 0
