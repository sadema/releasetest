pipeline {
    agent { docker 'sadema/jenkins-maven:3.5.2-ibmjava-8-alpine' }
    stages {
        stage('Checkout') {
            steps {
                git url: 'https://github.com/sadema/releasetest.git', branch: 'develop'
                args '-v /home/jenkins:/home/jenkins/.m2'
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
