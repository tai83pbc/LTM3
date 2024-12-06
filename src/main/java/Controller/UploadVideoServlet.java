package Controller;

import java.io.File;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/UploadVideoServlet")
@MultipartConfig
public class UploadVideoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public UploadVideoServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String appPath = request.getServletContext().getRealPath("");
        String uploadDirPath = appPath + File.separator + "uploads";
        File uploadDir = new File(uploadDirPath);
        if (!uploadDir.exists()) {
            uploadDir.mkdir();
        }

        Part filePart = request.getPart("videoFile");
        if (filePart == null) {
            response.getWriter().println("<script>alert('Không tìm thấy file upload. Vui lòng thử lại.'); history.back();</script>");
            return;
        }

        String fileName = filePart.getSubmittedFileName();
        String uploadPath = uploadDirPath + File.separator + fileName;

        // Lưu file
        filePart.write(uploadPath);

        // Gửi phản hồi kèm thông báo và chuyển hướng
        response.setContentType("text/html; charset=UTF-8");
        response.getWriter().println(
            "<script>" +
            "alert('Video đã được upload thành công!');" +
            "window.location.href = 'Home.jsp';" +
            "</script>"
        );
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
