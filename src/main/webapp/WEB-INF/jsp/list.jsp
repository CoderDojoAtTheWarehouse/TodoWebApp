<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.List,com.coderdojowarehouse.todo.domain.TodoItem" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Todo List</title>
    <link href="assets/css/bootstrap.min.css" rel="stylesheet">
    <link href="assets/css/bootstrap-theme.min.css" rel="stylesheet">
    <!--[if lt IE 9]>
      <script src="assets/js/html5shiv.min.js"></script>
      <script src="assets/js/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
    <div class="jumbotron">
      <div class="container">
        <h1>Todo List</h1>
      </div>
    </div>
    <div class="container">
      <div class="row">
        <div class="col-md-12">
          <table>
            <thead>
              <tr><th>Task</th></tr>
            </thead>
            <tbody>
              <%
                final List<TodoItem> items = (List<TodoItem>)request.getAttribute("items");
                for (final TodoItem item: items) {
              %>
                  <tr><td><%= item.getDescription() %></td></tr>
              <%
                }
              %>
            </tbody>
          </table>
        </div>
        <a href="/todo?action=add" class="btn btn-default">Add</a>
      </div>
    </div>
    <script src="assets/js/jquery.min.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
  </body>
</html>
