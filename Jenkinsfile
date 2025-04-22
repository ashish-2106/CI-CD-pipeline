pipeline {
    agent any

    stages {
        stage('Build') {
            steps {
                sh './build.sh'
            }
        }

        stage('Run') {
            steps {
                sh './run.sh'
            }
        }

        stage('Test') {
            steps {
                sh './test.sh'
            }
        }
    }

    post {
        success {
            echo '🎉 CI Pipeline completed successfully!'
        }
        failure {
            echo '💥 Something went wrong in the pipeline!'
        }
    }
}
