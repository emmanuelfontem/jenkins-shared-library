#!/usr/bin/env groovy

def call() {
    echo "Building the JAR..."
    sh 'mvn clean package'
}