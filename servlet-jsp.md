Let's see the steps, you need to follow to create the first servlet example.<br>
-	Create a Dynamic web project<br>
-	create a servlet<br>
-	add servlet-api.jar file<br>
-	Run the servlet<br>
1) *Create the dynamic web project:*
For creating a dynamic web project 
click on <br> File Menu -> New -> Dynamic web project -> write your project name e.g. first -> Finish.
2) *Create the servlet in eclipse IDE:*
For creating a servlet, explore the project by <br>
clicking the + icon -> explore the Java Resources -> right click on project or application -> New -> servlet -> write your servlet name<br>
e.g. Hello -> uncheck all the checkboxes except doGet() -> next -> Finish.
4) *Add jar file in eclipse IDE:*
For adding a jar file,<br>
Right click on your project -> Build Path -> Configure Build Path
 -> click on Libraries tab in Java Build Path -> click on Add External JARs button
 -> select the servlet-api.jar file under tomcat/lib -> ok.
5) *Start the server and deploy the project:*
For starting the server and deploying the project in one step<br>
Right click on your project -> Run As -> Run on Server -> choose tomcat server -> next -> addAll -> finish.
