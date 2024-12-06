package model.bean;

import java.sql.Timestamp;

public class Video {
	private int videoId;
    private int userId;
    private String title;
    private Timestamp createdAt;
	public Video(int videoId, int userId, String title, Timestamp createdAt) {
		super();
		this.videoId = videoId;
		this.userId = userId;
		this.title = title;
		this.createdAt = createdAt;
	}
    
    public Video() {
		// TODO Auto-generated constructor stub
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
    
}
