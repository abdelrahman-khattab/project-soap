# E-Commerce-soap
### Built-using-JAX-WS.

## 📃 Documentation
📧[Postman RESTful API Docs](https://documenter.getpostman.com/view/7632032/UyxdL9Jc)

## 📦 Features
* SOAP 1.1

## ⚙ Technologies used
* JAX-WS (Metro)
* JAX-B
* Maven
* Tomcat 10.0
* Postman

 ## 🛠 Run with Maven
    **Maven**
* Change the configuration of Tomcat in `pom.xml`. 
* Deploy the application using the following maven command:
 ```
mvn clean package compile tomcat7:redeploy
```
* REST: change the URL in the Postman collection environment variables to match the port you chose for your Tomcat deployment

**🐬MySQL**
* Create a database schema and provide the username and password in the persistence.xml
* Hibernate will automatically create the tables for you
