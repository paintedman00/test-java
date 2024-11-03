@Library('jenkins-shared-library') 

 def gv


pipeline {
   agent any
   tools {
      maven 'maven-3.9'
   }

   stages {
      stage('init') {
            steps {
            script {
               gv = load 'script.groovy'
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
               buildImage 'paintedman00/app-demo:jma-3.0'
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
