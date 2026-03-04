pipeline {
    agent any

    tools {
        jdk 'JDK17'
        maven 'Maven3'
    }

    stages {
        stage('Cloner depuis Git') {
            steps {
                checkout scm
            }
        }

        stage('Compiler') {
            steps {
                bat 'mvn clean compile'
            }
        }

        stage('Tests unitaires') {
            steps {
                bat 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }

        stage('Packager') {
            steps {
                bat 'mvn package -DskipTests'
            }
        }
    }

    post {
        success {
            echo 'Build et tests terminés avec succès.'
        }
        failure {
            echo 'Le pipeline a échoué.'
        }
    }
}