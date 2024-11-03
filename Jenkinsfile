@Library('jenkins-shared-library') _
def gv

pipeline {
    agent any
    tools {
        maven 'maven-3.9'
    }

    stages {
        stage("init") {
            steps {
                script {
                    gv = load "script.groovy"
                }
            }
        }

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

        stage('Deploy') {
            steps {
                script {
                    echo 'Deploying the app'
                }
            }
        }
    }
}
