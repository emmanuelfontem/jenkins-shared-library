#!/usr/bin/env groovy

def call() {
    echo "Building Docker image..."
    withCredentials([usernamePassword(credentialsId: 'dockerhub-repo', usernameVariable: 'USER', passwordVariable: 'PASS')]) {
        sh 'docker build -t esendege/demo-app:jma-2.0 .'
        sh 'echo $PASS | docker login -u $USER --password-stdin'
        sh 'docker push esendege/demo-app:jma-2.0'
    }
}