package com.coderdojowarehouse.todo;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoServlet extends HttpServlet {

    protected void doGet(final HttpServletRequest request,
                         final HttpServletResponse response)
            throws ServletException, IOException {
        request.setAttribute("items", getTodoItems(request));
        final RequestDispatcher dispatcher = request.getRequestDispatcher("todo.jsp");
        dispatcher.forward(request, response);
    }

    private List<TodoItem> getTodoItems(final HttpServletRequest request) {
        final List<TodoItem> items = new ArrayList<>();
        final TodoItem item = new TodoItem();
        item.setDescription("Cut the grass");
        items.add(item);
        return items;
    }
}
