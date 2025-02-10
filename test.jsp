<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Form</title>
</head>
<body>
   <div>
    <form action="process.jsp" method="POST">
        
        <input type="text" name="name" placeholder="Enter your name">
        <input type="email" name="email" placeholder="Enter your email" > <br>
        <Textarea name="message" placeholder="Enter your message"></Textarea>
        <button type="submit">Submit</button>
    </form>
   </div>
</body>
</html>