# ServletDemo_RequestDispatcher Project
- This is web project using Servlet
- Use RequestDispatcher to move to another Servlet where :
    - RequestDispatcher will send the same request & response objects to the next Servlet which process the request
    - the respnse obj of the first Servlet will view the result
- create Dynamic web project
- create AddServlet which will have 3 methods doGet() , doPost() & service()
- request will direct to suitable method based on it's type (get or post) , then will be redirect to service() to apply the logic
- when user send request to sum 2 numbers , request will go to AddServlet to handl it 
- fetch parameters from the request , then apply summition to get the result
- Assign the result to the request obj to be transfered with it
- using RequestDispatcher to move to the ResultServlet
- In the ResultServlet , we can get the result from the request obj which hold it 
- print the result using response obj 

  ### Prerequisites
  - java 25
  - Servlet-api 6.1.0
  - STS Eclipse 
