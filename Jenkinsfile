pipeline {
    agent any
    stages{
        stage('checking'){
            steps {
                git branch: 'master', url: 'https://github.com/ADirin/lectDemo_11.git'

            }
        }

        stage('build'){
            steps{
                bat 'mvn clean install'
            }
        }

    }
}