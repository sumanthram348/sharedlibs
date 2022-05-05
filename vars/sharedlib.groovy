def call(Map pipelineParams = [:]) {
  pipeline {
    agent any
    
    tools {
        maven "M3"
    }

    stages {
        stage('Hello') {
            steps {  
              sh "mvn pipelineParams.action package"
            }
        }
    }
}
}
