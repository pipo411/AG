pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh'''
                chmod +x quickstart/gradlew
                ./quickstart/gradlew clean assemble -p quickstart/
                make
                '''
                archiveArtifacts artifacts: '**/target/*.jar', fingerprint: true
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh'./quickstart/gradlew clean test -p quickstart/'
            }
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'
                 sh'./quickstart/gradlew clean build -p quickstart/'
            }
        }
    }
}
