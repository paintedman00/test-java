pipeline {
   agent any

   stages {
      stage('Build Jar File') {
         steps {
            script {
               echo 'Building the app'
            }
         }
      }

      stage('build image') {
         when {
            expression {
               BRANCH_NAME == 'main'
            }
         }
         steps {
            echo 'Building the image !!!'
         }
      }

      stage('Deploy') {
         when {
            expression {
               BRANCH_NAME == 'main'
            }
         }
         steps {
            echo 'Deploying the app'
         }
      }
   }
}
