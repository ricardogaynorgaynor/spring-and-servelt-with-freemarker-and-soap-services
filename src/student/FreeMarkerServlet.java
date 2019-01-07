package student;

import olmies.AllFacultiesResponse;
import olmies.ArrayOfFacultyResult;
import olmies.FacultyResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "FreeMarkerServlet", urlPatterns = "/FreeMarkerServlet")
public class FreeMarkerServlet extends HttpServlet {

    private Schoolclient schoolclient = new Schoolclient();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        ArrayOfFacultyResult result = schoolclient.getAllFaculties();
        List<FacultyResult> facultyResults = new ArrayList<>();
        int i = 1;
        for(FacultyResult facultyResult: result.getFacultyResult()){
            facultyResults.add(facultyResult);
        }

        response.setContentType("text/html");
        request.setAttribute("faculties", facultyResults);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/index.ftl");


        dispatcher.forward(request, response);

    }
}
