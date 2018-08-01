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
                post {
                        success  {
                            archiveArtifacts artifacts: 'build/libs/**/*.jar', fingerprint: true
                            junit 'build/reports/**/*.xml'
                        }
                    }
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
