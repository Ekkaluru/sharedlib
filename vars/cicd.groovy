def Git(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}

def Maven()
{
  sh "mvn package"
}
def Deploy(jobname,ipaddress,context)
{
  sh "scp /home/ubuntu/slave1/workspace/${jobname}/webapp/target/webapp.war  ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${context}.war" 
}
def Testing(jobname)
{
  sh " java -jar /home/ubuntu/slave1/workspace/${jobname}/testing.jar"
}
