pipeline{
    agent any
    tools{
        maven 'maven-plugin'
        jdk 'java-21'
    }
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
        stage("running the application"){
            steps{
                sh "mvn spring-boot:run"
            }
        }
    }
        post{
            success{
                echo "Pipeline succeeded!"
            }
            failure{
                echo "Pipeline failed!"
            }
            always{
                cleanWs();
            }
        }
}