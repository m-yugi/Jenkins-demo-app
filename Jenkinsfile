pipeline{
    agent any
    stages{
        stage("clone stage"){
            steps{
                cleanWs()
                git branch: "master",
                url:"https://github.com/m-yugi/Jenkins-demo-app.git"
            }
        }
        stage("building application"){
            steps{
                sh "mvn clean install package"
            }
        }
        stage("Build docker image"){
            steps{
                script{
                    docker.build("jenkins-demo-test")
                }
            }
        }
    }
        post{
            success{
                echo "Pipeline succeeded!"
            }
            failure{
                ehco "Pipeline failed!"
            }
            always{
                cleanWs();
            }
        }
}