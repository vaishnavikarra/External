pipeline {
    agent any

    stages {

        stage('Compile') {
            steps {
                bat 'javac Factorial.java TestFactorial.java'
            }
        }

        stage('Test') {
            steps {
                bat 'java TestFactorial'
            }
        }

        stage('Run') {
            steps {
                bat 'java Factorial'
            }
        }

        stage('Package JAR') {
            steps {
                bat 'jar cfm Factorial.jar manifest.txt Factorial.class'
            }
        }

        stage('Archive JAR') {
            steps {
                archiveArtifacts artifacts: 'Factorial.jar'
            }
        }

    }

    post {
        success {
            echo "Successfully executed the pipeline"
        }
        failure {
            echo "Pipeline Failed"
        }
    }
}
