# DevOps 
DevOps Git Maven Docker DockerHub Kubernetes


docker build  --build-arg  JAR_FILE=target/devops-application.jar -t  mimaraslan/devops-application:v001 .







## Jenkins configs


pipeline {
agent any

    tools {
        maven 'Maven3'
       // java 'Java17'
    }

    stages {
        stage('Build Maven') {
            steps {
                checkout scmGit(branches: [[name: '*/master']], extensions: [], userRemoteConfigs: [[url: 'https://github.com/mimaraslan/java-044-devops-hello']])
                // sh 'mvn clean install'
                bat 'mvn clean install'
            }
        }
        
        stage('Docker Image') {
            steps {
               //   sh 'docker build  -t  mimaraslan/devops-application .'
                bat 'docker build  -t  mimaraslan/devops-application .'
            }
        }
        
        
        
            
        stage('Docker Image to DockerHub') {
            steps {
                script{
                    
                     withCredentials([string(credentialsId: 'dockerhub', variable: 'dockerhub')]) {
                           bat 'echo docker login -u mimaraslan -p ${dockerhub}'
                           bat 'docker push  mimaraslan/devops-application:latest'
                     }
                }
            }
        }
        
        
        stage('Kubernetes Pod') {
            steps {
            }
        }
        
     
        
        
        
    }
}
