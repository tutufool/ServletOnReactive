package com.leon.app.webfluxsample;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TestServlet extends HttpServlet {

  /**
   * 
   */
  private static final long serialVersionUID = 1L;

  @Override
  protected final void doGet(final HttpServletRequest request, final HttpServletResponse response)
      throws ServletException, IOException {

    final RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/any");

    dispatcher.forward(request, response);

  }
}
