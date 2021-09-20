
pipeline {
    agent any

    tools {
        // Install the Maven version configured as "M3" and add it to the path.
        maven "MAVEN_HOME"
    }

    stages {
        stage('Build') {
            steps {
                // Get some code from a GitHub repository
               git 'https://github.com/HrishiReddy/scm.git'

                
                 bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }
               
           
        }
             stage('upload to nexus') {
            steps {
               nexusArtifactUploader artifacts: [[artifactId: 'Testing_test', classifier: '', file: 'target/Testing_Test-2.0.0.jar', type: 'jar']], 
                   credentialsId: 'nexus-user-credentials', groupId: 'Testing', nexusUrl: 'localhost:8081', nexusVersion: 'nexus3',
                   protocol: 'http', repository: 'scm', version: '2.0.0'
            }

             }
        
    }
}
