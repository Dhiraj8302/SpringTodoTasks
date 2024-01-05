Backend:
db-connection-1 folder refers to backend Spring boot logic Which runs on PORT 8083
http://localhost:8083
Open folder in Spring Boot -> Open "DbConnection1Application" class -> right click -> Run as -> 4 Spring Boot App.


Frontend :
to-do frontend Folder refers to Angular App used for Frontend which runs on PORT 4200
http://localhost:4200
Open it in VS Code
In the project directory, you can run:
"ng serve"
 it Runs the app in the development mode.
Open http://localhost:4200 to view it in the browser.

The page will reload if you make edits.
You will also see any errors in the console.
Required Angular CLI Version : 17.0

*Note- in "db-connection-1\src\main\resources\application.properties" 
        spring.datasource.url=jdbc:oracle:thin:@localhost:1521:XE  (Edit It according to database you are using)
        spring.datasource.username= (Username of your database)
        spring.datasource.password= (Password of your database)
