#!/usr/bin/env groovy

def call() {
    echo "Building the application for branch $GIT_BRANCH"
    sh 'mvn clean package'
}
