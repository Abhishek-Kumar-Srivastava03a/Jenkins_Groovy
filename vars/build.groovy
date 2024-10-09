def call(String tag,version){
  echo "this is build stage"
  sh "whoami"
  sh "docker build -t ${tag}:${version}."
  echo "app build successful"
}
