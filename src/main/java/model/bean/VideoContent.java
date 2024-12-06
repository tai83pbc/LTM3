package model.bean;

import java.sql.Timestamp;

public class VideoContent {
	private int videoContentId;
    private int videoId;
    private String path;
    private Resolution resolution ;
    
    public VideoContent(int videoContentId, int videoId, String path, Resolution resolution) {
		super();
		this.videoContentId = videoContentId;
		this.videoId = videoId;
		this.path = path;
		this.resolution = resolution;
	}
	public VideoContent() {
		// TODO Auto-generated constructor stub
	}
	public int getVideoContentId() {
		return videoContentId;
	}
	public void setVideoContentId(int videoContentId) {
		this.videoContentId = videoContentId;
	}
	public int getVideoId() {
		return videoId;
	}
	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Resolution getResolution() {
		return resolution;
	}
	public void setResolution(Resolution resolution) {
		this.resolution = resolution;
	}
    
}
