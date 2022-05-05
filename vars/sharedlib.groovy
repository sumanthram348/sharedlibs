def call(Map pipelineParams) {
  pipeline {
    agent any
    
    tools {
        maven "M3"
    }

    stages {
        stage('checkout git') {
                steps {
                    git branch: pipelineParams.branch, url: pipelineParams.scmUrl
                }
          } 
        stage('build') {
            steps {  
              sh "mvn ${pipelineParams.action} package"
            }
        }
    }
}
}
