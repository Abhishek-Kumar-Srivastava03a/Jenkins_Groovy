def call(String creds,tag,version){
  echo "this is test stage"
  withCredentials([usernamePassword("credentialsId":"${creds}",passwordVariable:"dockerPassword",usernameVariable:"dockerUsername")]){
    sh "docker login -u ${dockerUsername} -p ${dockerPassword}"
    sh "docker image tag {tag}:${version} ${dockerUsername}/${tag}:${version}"
    sh "docker push ${dockerUsername}/${tag}:${version}"
  }
  echo "test is complete"
}
