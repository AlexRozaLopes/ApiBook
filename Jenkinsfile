pipeline {
    agent any

    tools {
        gradle 'Gradle_7.3'
    }
    stages {
        stage("Build jar file") {
            steps {
                echo 'building the application'
                sh 'gradle build'
            }
        }

        stage("Build Docker image") {
            steps {
                echo 'testing the application'
                withCredentials([usernamePassword(credentialsId: 'docker-hub-repo', passwordVariable: 'PASS', usernameVariable: 'USER')]){
                    sh 'sudo docker build -t alexroza/api_book:pipeline-1.0 .'
                                    sh "echo $PASS | docker login -u $USER --password-stdin"
                                    sh 'docker push alexroza/api_book:pipeline-1.0'
                }
            }
        }

        stage("Deploy") {
            steps {
                echo 'deploying the application'
            }
        }
    }
}