pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh'''
                chmod +x quickstart/gradlew
                ./quickstart/gradlew clean assemble -p quickstart/
                '''

            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh'./quickstart/gradlew clean testJacocoReport -p quickstart/'
            }
        }
       
      post {
             always {
             archiveArtifacts artifacts: 'quickstart/build/libs/*.jar', fingerprint: true
             junit '**/*.xml'
             }
         }
}
