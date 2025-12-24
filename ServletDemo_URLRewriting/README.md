# ServletDemo_URLRewriting Project
- This is web project using Servlet , use URLRewriting for Session Management & to move from Servlet to another :
- use URLRewriting method to hold data in the URL without need to session or cookie objects
- create Dynamic web project
- create AddServlet which will have 3 methods doGet() , doPost() & service()
- request will direct to suitable method based on it's type (get or post) , then will be redirect to service() to apply the logic
- when user send request to concatenate fist & last name , request will go to AddServlet to handl it 
- fetch parameters from the request , then apply concatenation to get fullname
- response obj to will be transfer to the ResultServlet using sendRedirect() method
- fullname will be added to the URL that will be handled by the next Servlet
- In the ResultServlet , we can get the fullname from the request
- Response will breturn back to the client with the fullname 

  ### Prerequisites
  - java 25
  - Servlet-api 6.1.0
  - STS Eclipse 
