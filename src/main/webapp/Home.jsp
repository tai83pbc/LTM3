<%@ page language="java" contentType="text/html; charset=UTF8"
    pageEncoding="UTF8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF8">
<title>Insert title here</title>
<style type="text/css">
        .video-grid {
            display: grid;
            grid-template-columns: repeat(auto-fill, minmax(300px, 1fr));
            gap: 20px;
        }

        .video {
            background-color: #fff;
            border-radius: 8px;
            overflow: hidden;
            box-shadow: 0 2px 8px rgba(0, 0, 0, 0.1);
            transition: transform 0.3s, box-shadow 0.3s;
        }

        .video:hover {
        	cursor: pointer;
            transform: scale(1.03);
            box-shadow: 0 4px 12px rgba(0, 0, 0, 0.2);
        }

        .video img {
            width: 100%;
            height: 180px;
            object-fit: cover;
        }

        .video .info {
            padding: 10px;
        }

        .video .info h4 {
            font-size: 16px;
            margin-bottom: 5px;
        }

        .video .info p {
            font-size: 14px;
            color: #555;
        }

        .video .info p span {
            color: #888;
        }
</style>
<script type="text/javascript">
</script>
</head>
<body>
<div>
    		<h1>Video đã xử lý hoàn tất</h1>
    		<br>
	    	<div class="video-grid">
	            <div class="video" onclick="window.top.location.href = 'ViewWatch';">
	                <img src="Image/300x180.png" alt="Video Thumbnail">
	                <div class="info">
	                    <h4>Tiêu Đề Video</h4>
	                    <p><span>2 ngày trước</span></p>
	                </div>
	            </div>
	            <div class="video">
	                <img src="Image/300x180.png" alt="Video Thumbnail">
	                <div class="info">
	                    <h4>Tiêu Đề Video</h4>
	                    <p><span>2 ngày trước</span></p>
	                </div>
	            </div>
	    	</div>
    	</div>
    	<br>
    	<div>
    		<h1>Video đang xử lý</h1>
    		<br>
	    	<div class="video-grid">
	            <div class="video">
	                <img src="Image/300x180.png" alt="Video Thumbnail">
	                <div class="info">
	                    <h4>Tiêu Đề Video</h4>
	                    <p><span>2 ngày trước</span></p>
	                </div>
	            </div>
	            <div class="video">
	                <img src="Image/300x180.png" alt="Video Thumbnail">
	                <div class="info">
	                    <h4>Tiêu Đề Video</h4>
	                    <p><span>2 ngày trước</span></p>
	                </div>
	            </div>
	    	</div>
    	</div>
</body>
</html>