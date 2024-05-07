# spring-jdbc-template

REST API PROJECT WITH POST, GET AND DELETE OPTIONS WITH BROWSER DISPLAY.
IN BROWSER U CAN VIEW ALL COLLECTION ELEMENTS OR VIEW SINGLE ELEMENT, DESCRIPTION BELOW FOR POSTMAN AND INTELLIJ. HAVE A GREAT DAY :)

TO RUN PROJECT U NEED ATLEAST JAVA VERSION 19 INSTALLED AND MAVEN 3.1

RUN: 
1. OPEN CONSOLE 
2. GO TO PROJECT LOCATION FROM CONSOLE EX. cd C:\projects\spring-jdbc-template
3. IN CONSOLE ENTER: mvn package exec:java -Dexec.args="" 
4. WHEN SPRING APPLICAITON IS READY TO USE U SHOULD SEE IN TERMINAL: "Completed initialization in [value] ms"
5. IN YOUR BROWSER GO TO: "http://localhost:9000/books" TO SEE WHOLE COLLECTION 
6. EXIT BY KILLING THE PROCESS OR CLOSE CONSOLE WINDOW

REST API
1. RETURNS WHOLE COLLECTION 
GET http://localhost:9000/books

2. DELETES COLLECTION ELEMENT BY PASSING ID OF ELEMENT 
DELETE http://localhost:9000/books/{id}

3. ADDS ELEMENT TO COLLECTION, ARGS: "title", "author"

POST http://localhost:9000/books
Content-Type: application/json

{
  "title": "EXAMPLE BOOK",
  "author": "GALL ANONIM"
}

  EXAMPLE FOR POSTMAN:
  3.1. CREATE WORKSPACE -> WORKSPACE -> CREATE WORKSPACE
  3.2. OPEN NEW TAB IN WORKSPACE
  3.3. SELECT POST METHOD 
  3.4. NEXT TO POST ENTER: "localhost:9000/books"
  3.5. GO TO "body" (UNDER POST AND LINK) SELECT "raw" AND ENTER:
  {
      "title": "title",
      "author": "author"
  }
  
  3.5. IF U GOT STATUS 200 OK IT MEANS ELEMENT HAS BEEN ADDED TO COLLECTION

  EXAMPLE FOR INTELLIJI 
  3.1. SETTINGS BAR "Tools" -> "HTTP Client" -> "Create request in HTTP Client"
  3.2. ENTER: 
  POST http://localhost:9000/books
  Content-Type: application/json
  
  {
    "title": "EXAMPLE BOOK",
    "author": "GALL ANONIM"
  }
  
  3.3. IF U GOT STATUS 200 OK IT MEANS ELEMENT HAS BEEN ADDED TO COLLECTION
  EXAMPLE RESPONSE: 
  http://localhost:9000/books
  
  HTTP/1.1 200 
  Content-Type: application/json
  Transfer-Encoding: chunked
  Date: Tue, 23 Apr 2024 15:06:30 GMT
  Keep-Alive: timeout=60
  Connection: keep-alive
  
  {
    "id": 7,
    "author": "GALL ANONIM",
    "title": "EXAMPLE BOOK"
  }
  
  Response file saved.
  > 2024-04-23T170630.200.jsonwse
  
  Response code: 200; Time: 4ms (4 ms); Content length: 54 bytes (54 B)

# Gallery

### Get books
![REST-JPA-Spring_1](https://github.com/KaczyStary/spring-jdbc-template/assets/98557409/e25e6091-6a97-4e2c-983a-0ed61f7d65e1)

### Post car
![REST-JPA-Spring_2](https://github.com/KaczyStary/spring-jdbc-template/assets/98557409/6c68a498-b053-4ed4-ac20-5440c39ab50b)

### Get car by brand
![REST-JPA-Spring_3](https://github.com/KaczyStary/spring-jdbc-template/assets/98557409/a5a026d7-07fc-4e8a-a612-3517e017b457)

### Get car by production year
![REST-JPA-Spring_4](https://github.com/KaczyStary/spring-jdbc-template/assets/98557409/54856987-2835-4d10-995e-85ff21495e86)

### Get ebooks 
![REST-JPA-Spring_5](https://github.com/KaczyStary/spring-jdbc-template/assets/98557409/eb7f8ed4-eab4-4caa-8288-e3b7803d1c53)

### Get ebook by tag
![REST-JPA-Spring_6](https://github.com/KaczyStary/spring-jdbc-template/assets/98557409/3c053c2c-e155-46ca-a49c-9c5dceaea65c)
