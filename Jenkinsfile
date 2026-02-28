pipeline {
  agent any

  stages {
    stage('Clone') {
      steps {
        checkout scm
      }
    }

    stage('Build') {
      steps {
        bat 'mvn -B clean package'
      }
    }

    stage('Tests') {
      steps {
        bat 'mvn -B test'
      }
    }
  }
}
