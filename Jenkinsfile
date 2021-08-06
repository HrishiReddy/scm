
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
                //git 'https://github.com/HrishiReddy/scm.git'

                // Run Maven on a Unix agent.
                sh "mvn -Dmaven.test.failure.ignore=true clean package"

                // To run Maven on a Windows agent, use
                 //bat "mvn -Dmaven.test.failure.ignore=true clean package"
            }

            post {
                // If Maven was able to run the tests, even if some of the test
                // failed, record the test results and archive the jar file.
                success {
                    junit '**/target/surefire-reports/TEST-*.xml'
                    archiveArtifacts 'target/*.jar'
                }
            }
        }
             stage('upload to nexus') {
            steps {
              nexusArtifactUploader artifacts: [[artifactId: 'Testing_test', classifier: '', file: 'target/TestingProgram/0.0.1-SNAPSHOT.war', type: 'war']], credentialsId: 'nexus-user-credentials', groupId: 'Testing', nexusUrl: 'localhost:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'http://localhost:8081/repository/sample/', version: '0.0.1-SNAPSHOT'
            }

             }
        
    }
}
