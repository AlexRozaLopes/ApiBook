pipeline {
    agent any

    tools {
        Maven 'Maven'
    }
    stages {
        stage("Build jar file") {
            steps {
                echo 'building the application'
                sh 'mvn package'
            }
        }

        stage("Build Docker image") {
            steps {
                echo 'testing the application'
                withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', usernameVariable: USER, passwordVariable: PASS)])
                sh 'docker build -t docker push alexroza/api_book:pipeline-1.0 .'
                sh "echo $PASS | docker login -u $USER --password-stdin"
                sh 'docker push alexroza/api_book:pipeline-1.0'
            }
        }

        stage("Deploy") {
            steps {
                echo 'deploying the application'
            }
        }
    }
}