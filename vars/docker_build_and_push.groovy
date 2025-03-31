def call(String credentialsId,String Repo_name){
                  withCredentials([usernamePassword(credentialsId: "${credentialsId}", usernameVariable: 'USERNAME', passwordVariable: 'PASSWORD')]){
                    script{
                        def docker_image = docker.build("${env.USERNAME}/${Repo_name}:${env.BUILD_ID}")
                        withDockerRegistry(credentialsId: "${credentialsId}") {
                            docker_image.push("${env.BUILD_ID}")
                        }
                    }
                    
                }
}
