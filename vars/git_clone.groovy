def call(String url,branch){
  echo "this is cloning stage"
  git url:"${url}",branch:"${branch}"
  echo "git clone finished"
}
