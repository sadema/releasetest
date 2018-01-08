pipeline {
    agent { docker 'maven:3.5.2-ibmjava-alpine' }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/sadema/releasetest.git', branch: 'develop'
            }
        }
        stage('Build') {
            steps {
                sh 'mvn clean package'
                junit '**/target/surefire-reports/TEST-*.xml'
            }
        }
    }
}
