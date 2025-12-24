# ServletDemo_Cookies Project
- This is web project using Servlet , use Cookies for Session Management & to move from Servlet to another :
- create Dynamic web project
- create AddServlet which will have 3 methods doGet() , doPost() & service()
- request will direct to suitable method based on it's type (get or post) , then will be redirect to service() to apply the logic
- when user send request to concatenate fist & last name , request will go to AddServlet to handl it 
- fetch parameters from the request , then apply concatenation to get fullname
- create Cookie obj to which will hold fullname & assigned to response obj
- response obj to will be transfer to the ResultServlet using sendRedirect() method
- In the ResultServlet , we can get Cookies from request &  Fetch fullname from the Cookie which hold it 
- Response will breturn back to the client with the fullname 

  ### Prerequisites
  - java 25
  - Servlet-api 6.1.0
  - STS Eclipse 
