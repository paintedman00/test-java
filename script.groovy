@Library('jenkins-shared-library')_

pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }

    stages {
        stage('Build Jar File') {
            steps {
                script {
                    buildJar()
                }
            }
        }

        stage('build image') {
            steps {
                script {
                    buildImage()
                }
            }
        }
    }

        stage('Deploy') {
            steps {
                script {
                    echo 'Deploying the app'
                }
            }
        }
}

