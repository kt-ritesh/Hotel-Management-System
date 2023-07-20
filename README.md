<center>
<h1>Hotel-Management-System</h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/maven-3.0.5-brightgreen.svg" />
</a>
</center>
This project is a Hotel Management System project built using Spring Boot with Java.

---

## Framework Used
* Spring Boot

---

## Language Used
* Java

---

## Data Model

The All ...ModelClass  is defined inside the model packages which has the following attributes:
   
  ### Hotel Room Model
  * Room id : This is room id which is @id of the our model.
  * Room No : It contains room number.
  * Room Type : It contains type of room we have like AC, NON AC, etc......
  * Room Price : It contains room price.
  * Room Status :  It contiant room occupied or not.

## Data Flow

1. The user sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.

4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

---

## Functions used :-

### API Endpoints :-
</br>

* PostMapping("room"):

This endpoint makes a call to method in Service class which is connected to database. In database we add a new room given through API.


* GetMapping("room/{id}"): 

This endpoint returns the room by there specified room id through API.

* GetMapping("rooms"): 

This endpoint returns all room details.

* PutMapping("room/{id}"): 

This endpoint makes a call to method in Service class which is connected to database, and it will update the room details.


* DeleteMapping("room/{id}"): 

This endpoint will delete room details by there specified room id.

---

## 📝Project Summary

I have created Hotel Management System project using spring boot, In this project user  Can delete , update , get ,  can find. etc...
