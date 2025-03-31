@Library('Shared-github') _
pipeline{
    agent{
        label 'worker'
    }
    environment{
        Repo_name = 'jenkins-test'
    }
    
    stages{
        // stage('checkout'){
        //     steps{
        //         check('https://github.com/nishantxrana/django-notes-app-jenkins.git','main')
        //     }
        // }
        stage("Build & Push Docker image") {
            steps {
                docker_build_and_push("DockerHub","${env.Repo_name}")
            }
        }
    }
}
