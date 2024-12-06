package model.BO;

import model.DAO.VideoContentDAO;

public class VideoContentBO {
	private VideoContentDAO VideoContentDAO;
	public VideoContentBO() {
		VideoContentDAO = VideoContentDAO.getInstance();
	}
}
