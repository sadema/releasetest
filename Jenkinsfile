pipeline {
    agent { 
        docker {
            image 'sadema/jenkins-maven:3.5.2-ibmjava-8-alpine' 
            args '-v /home/jenkins:/home/jenkins/.m2'
        }
    }
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
