pipeline {
    agent any
    tools {
        maven 'MAVEN_3_6_3'
        jdk 'JDK_1_11'
    }
    stages {
        stage ('Compile Stage 2022-01') {

            steps {
                withMaven(maven : 'MAVEN_3_6_3') {
                    bat 'mvn clean compile'
                }
            }
        }
        stage ('Testing Stage 2022-01') {

            steps {
                withMaven(maven : 'MAVEN_3_6_3') {
                    bat 'mvn test'
                }
            }
        }
        stage ('package Stage') {
            steps {
                withMaven(maven : 'MAVEN_3_6_3') {
                    bat 'mvn package'
                }
            }
        }
    }
}