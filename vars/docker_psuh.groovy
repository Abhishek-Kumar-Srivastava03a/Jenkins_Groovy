def call(String Creds){
  echo "this is test stage"
  withCredentials([usernamePassword(
      "credentialsId":"${creds}",
      passwordVariable:"dockerPassword",
      usernameVariable:"dockerUsername")]){
    sh "docker login -u ${env.dockerUsername} -p ${env.dockerPassword}"
    sh "docker image tag django-app:latest ${env.dockerUsername}/django-app:latest"
    sh "docker push ${env.dockerUsername}/django-app:latest"
  }
  echo "test is complete"
}
