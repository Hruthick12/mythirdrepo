def create_tag(String tag){

sh """
    git log -1
    git tag -a ${tag} -m "this tag has been created in jenkins"
    git push origin ${tag}
    """
}
return this