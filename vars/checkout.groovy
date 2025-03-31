def call(String url, String branch){
  echo 'fetching the code'
  git([url: "${url}",branch: "${branch}"])
}
