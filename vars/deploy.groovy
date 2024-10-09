def call(String file_name){
  echo "this is deploy stage"
  sh "docker compose -f ${file_name} down"
  sh "docker-compose -f ${file_name} up -d"
  echo "deployment is done"
}
