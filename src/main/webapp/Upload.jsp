<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Upload Video - TCT TUBE</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <style>
        * {
            margin-left:-50px;
            padding: 0;
            box-sizing: border-box;
        }

        body {
            font-family: 'Arial', sans-serif;
            background-color: #f9f9f9;
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        h1 {
            margin-bottom: 20px;
            color: #2575fc;
        }

        form {
            background-color: #fff;
            padding: 20px;
            border-radius: 8px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 400px;
            text-align: center;
        }

        input[type="file"] {
            margin: 20px 0;
        }

        button {
            background-color: #2575fc;
            color: white;
            border: none;
            padding: 10px 20px;
            border-radius: 5px;
            cursor: pointer;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #1a5ec8;
        }

        .back-link {
            margin-top: 20px;
            color: #2575fc;
            text-decoration: none;
            font-size: 14px;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <h1>TCT TUBE - Upload Video</h1>
    <form action="UploadVideoServlet" method="POST" enctype="multipart/form-data">
        <label for="videoFile">Chọn video để tải lên:</label>
        <input type="file" id="videoFile" name="videoFile" accept="video/*" required>
        <br>
        <button type="submit">Tải Lên</button>
    </form>
    <a href="Home.jsp" class="back-link"><i class="fas fa-arrow-left"></i> Quay về Trang Chủ</a>
</body>
</html>