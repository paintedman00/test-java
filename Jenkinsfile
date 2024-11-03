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
         steps {
            script {
               when {
                  expression {
                     BRANCH_NAME == 'main'
                  }
                  echo 'Building the image !!!'
               }
            }
         }
      }

      stage('Deploy') {
         steps {
            script {
               when {
                  expression {
                     BRANCH_NAME == 'main'
                  }
               }
               echo 'Deploying the app'
            }
         }
      }
   }
}
