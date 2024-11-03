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
               // Use env.BRANCH_NAME to access the environment variable
               env.BRANCH_NAME == 'main'
            }
         }
         steps {
            echo 'Building the image !!!'
         }
      }

      stage('Deploy') {
         when {
            expression {
               // Use env.BRANCH_NAME to access the environment variable
               env.BRANCH_NAME == 'main'
            }
         }
         steps {
            echo 'Deploying the app'
         }
      }
   }
}
