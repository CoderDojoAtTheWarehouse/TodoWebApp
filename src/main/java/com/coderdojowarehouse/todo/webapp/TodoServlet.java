package com.coderdojowarehouse.todo.webapp;

import com.coderdojowarehouse.todo.domain.TodoItem;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TodoServlet extends HttpServlet {

    @Override
    protected void doPost(final HttpServletRequest request,
                          final HttpServletResponse response)
            throws ServletException, IOException {

        // 3. Get the item list from the session (Hint see doGet)

        // 4. Use request.getParameter() to read the value of the task description frpm the form

        // 5. Create a item with the description and add it to the item list

        // 6. Use a sendRedirect to redirect to the list.jsp page
    }

    @Override
    protected void doGet(final HttpServletRequest request,
                         final HttpServletResponse response)
            throws ServletException, IOException {

        final String action = request.getParameter("action");
        if (action == null || action.equals("list")) {

            request.setAttribute("items", getTodoItems(request.getSession()));
            final RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/list.jsp");
            dispatcher.forward(request, response);

        } else if (action.equals("add")) {

            // 1. Forward the user to the add.jsp page (see above for list.jsp)

        } else {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }

    private List<TodoItem> getTodoItems(final HttpSession session) {
        List<TodoItem> items = (List<TodoItem>)session.getAttribute("items");
        if (items == null) {
            items = new ArrayList<>();
            TodoItem item = new TodoItem();
            item.setDescription("Clean your room");
            items.add(item);
            item = new TodoItem();
            item.setDescription("Do your homework");
            items.add(item);
            session.setAttribute("items", items);
        }
        return items;
    }
}
