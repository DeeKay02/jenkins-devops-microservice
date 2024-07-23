pipeline {
	agent any
	// agent { docker { image 'maven:3.9.8' } }
	environment {
		dockerHome = tool 'myDocker'
		mavenHome = tool 'myMaven'
		PATH = "${dockerHome}/bin:${mavenHome}/bin:${env.PATH}"
	}
	stages {
		stage('Checkout') {
			steps {
				sh 'mvn --version'
				sh 'docker --version'
			}
		}

		stage('Compile') {
			steps {
				sh 'mvn clean compile'
			}
		}

		stage('Test') {
			steps {
				sh 'mvn test -DskipTests'
			}
		}

		stage('Integration Test') {
			steps {
				sh 'mvn failsafe:integration-test failsafe:verify -DskipTests'
			}
		}
	}
}
