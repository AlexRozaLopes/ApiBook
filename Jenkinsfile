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
                    sh ' docker build -t alexroza/api_book:pipeline-1.0 .'
                                    sh "echo $PASS | docker login -u $USER --password-stdin"
                                    sh 'docker push alexroza/api_book:pipeline-1.0'
                }
            }
        }

        stage("Deploy") {
            steps {
                script {
                    echo 'deploying the application on AWS EC2 '
                    def dockerComposeCmd = "docker-compose -f docker-compose.yaml up --detach"
                    sshagent(['ec2-server-key']) {
                     sh "scp docker-compose.yaml ec2-user@18.228.16.234:/home/ec2-user"
                     sh "ssh -o StrictHostKeyChecking=no ec2-user@18.228.16.234 ${dockerComposeCmd}"
                    }
                }

            }
        }
    }
}