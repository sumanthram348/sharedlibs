def call(Map pipelineParams) {
  pipeline {
    agent any

    stages {
        stage('Hello') {
            steps {
                      def mvnHome =  tool name: 'maven3', type: 'maven'   
                      sh "${mvnHome}/bin/mvn pipelineParams.action package"
            }
        }
    }
}
}
