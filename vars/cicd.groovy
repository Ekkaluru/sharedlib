def Git(repo)
{
  git "https://github.com/intelliqittrainings/${repo}"
}

def Maven()
{
  sh "mvn package"
}
