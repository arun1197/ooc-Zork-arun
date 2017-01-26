My .gitignore consist of 3 rules.

Rule 1: /*.iml
	I exclude all the iml's file because maven(pom.xml) handles the version control.


Rule 2: /target
	I exclude target folder because when we build the project, it generates a target folder for us automatically.

Rule 3: /.idea
	I exclude .idea because the files in idea folder should be verion controlled.