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
                sh'./quickstart/gradlew test jacocoTestReport -p quickstart/'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
            }
        }
    }
      post {
             always {
             junit 'quickstart/build/test-results/test/*.xml'
             }

             success {
             archiveArtifacts artifacts: 'quickstart/build/libs/*.jar', fingerprint: true
            }
         }
}
