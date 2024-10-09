def call(String Creds,tag,version){
  echo "this is test stage"
  withCredentials([usernamePassword(
      "credentialsId":"${creds}",
      passwordVariable:"dockerPassword",
      usernameVariable:"dockerUsername")]){
    sh "docker login -u ${dockerUsername} -p ${dockerPassword}"
    sh "docker image tag django-app:latest ${dockerUsername}/${tag}:${version}"
    sh "docker push ${dockerUsername}/${tag}:${version}"
  }
  echo "test is complete"
}
