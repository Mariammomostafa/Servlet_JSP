# ServletDemo_SendRedirect Project
- This is web project using Servlet
- Use SendRedirect to move to another Servlet where :
    - SendRedirect will send the response object of the first Servlet to the client (browser)
    - client will send new request to the next Servlet which process that request 
    - the respnse obj of the second Servlet will view the result
- create Dynamic web project
- create AddServlet which will have 3 methods doGet() , doPost() & service()
- request will direct to suitable method based on it's type (get or post) , then will be redirect to service() to apply the logic
- when user send request to sum 2 numbers , request will go to AddServlet to handl it 
- fetch parameters from the request , then apply summition to get the result
- Get session obj from request & set result to it
- using SendRedirect to move to the ResultServlet
- In the ResultServlet , we can get the result from the session obj which hold it 
- print the result using response obj 

  ### Prerequisites
  - java 25
  - Servlet-api 6.1.0
  - STS Eclipse 
