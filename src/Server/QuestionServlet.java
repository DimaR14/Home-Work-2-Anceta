package Server;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Data", urlPatterns = "/data")
public class QuestionServlet extends HttpServlet {
     private int question1Yes = 0;
     private int question1No = 0;
     private int question2Yes = 0;
     private int question2No = 0;

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("Name");
        String ln = req.getParameter("Last name");
        String age = req.getParameter("Age");
        String q1 = req.getParameter("question1");
        String q2 = req.getParameter("question2");
        if(q1.equals("yes")){
            question1Yes++;
        }if(q1.equals("no")){
            question1No++;
        }
        if(q2.equals("yes")){
            question2Yes++;
        }if(q2.equals("no")){
            question2No++;
        }
        PrintWriter pw = resp.getWriter();
        pw.write("<html>");
        pw.write("<head><title>Result</title></head>");
        pw.write("<body>");
        pw.write("Question 1: Yes = " + question1Yes + ", No = " + question1No +"</br>");
        pw.write("Question 2: Yes = " + question2Yes + ", No = " + question2No);
    }

}
