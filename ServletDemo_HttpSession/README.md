# ServletDemo_HttpSession Project
- This is web project using Servlet , use HttpSession for Session Management & to move from Servlet to another :
- create Dynamic web project
- create AddServlet which will have 3 methods doGet() , doPost() & service()
- request will direct to suitable method based on it's type (get or post) , then will be redirect to service() to apply the logic
- when user send request to sum 2 numbers , request will go to AddServlet to handl it 
- fetch parameters from the request , then apply summition to get the result
- get HttpSession obj from request & set result to it
- response obj to will be transfer to the ResultServlet using sendRedirect() method
- In the ResultServlet , we can get the result from the session obj which hold it to be printed to the user

  ### Prerequisites
  - java 25
  - Servlet-api 6.1.0
  - STS Eclipse 
