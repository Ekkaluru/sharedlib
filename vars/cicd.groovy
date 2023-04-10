def Git(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}

def Maven()
{
  sh "mvn package"
}
def Deploy(jobname,ipadress,contextpath)
{
  sh "scp /var/lib/jenkins/workspace/${jobname}/webapp/target/webapp.war  ubuntu@${ipaddress}:/var/lib/tomcat9/webapps/${context}.war" 
}
