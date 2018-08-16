pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh'./quickstartWeb/gradlew clean assemble -p quickstartWeb/'
            }
        }
        stage('Test') {
            steps {
                echo 'Testing..'
                sh'./quickstartWeb/gradlew test -p quickstartWeb/'
            }
        }

        stage('Publish') {
            steps {
                echo 'Publish..'
                sh'./quickstartWeb/gradlew uploadArchives -p quickstartWeb/'
            }
        }

        stage('Deploy') {
            steps {
                echo 'Deploy..'
                sh'./quickstartWeb/gradlew -b deploy.gradle deploy -Pdev_server=10.28.135.36 -Puser_server=ubuntu -Pwar_path=BuildWar -Puser_home=/home/go/llavedocker.pem   -p quickstartWeb/'
            }
        }
    }
      post {
             always {
             junit 'quickstartWeb/build/test-results/test/*.xml'
             publishHTML (target: [
               allowMissing: false,
               alwaysLinkToLastBuild: false,
               keepAll: true,
               reportDir: 'quickstartWeb/build/reports/tests/test',
               reportFiles: 'index.html',
               reportName: "Junit Reports"
             	])
             }

             success {
             archiveArtifacts artifacts: 'quickstartWeb/build/libs/*.jar', fingerprint: true
            }
         }
}


