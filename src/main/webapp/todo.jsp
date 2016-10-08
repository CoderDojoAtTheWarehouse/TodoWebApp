<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.List,com.coderdojowarehouse.todo.TodoItem" %>
<html>
  <head>
    <title>Todo List</title>
  </head>
  <body>
  <h1>Todo List</h1>
    <%
      final List<TodoItem> items = (List<TodoItem>)request.getAttribute("items");
      for (final TodoItem item: items) {
    %>
        <blockquote><%= item.getDescription() %></blockquote>
    <%
      }
    %>

  </body>
</html>
