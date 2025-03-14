def call(String url , String branch){
   echo "This code is Cloning" 
   git url: "${url}", branch: "${branch}"
   echo "Cloned Successfully"
}
