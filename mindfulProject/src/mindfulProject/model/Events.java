package mindfulProject.model;

public class Events {
	private String name;
	private String date;
	private String time;
	private String crowd;
	private String image;
	
	
	public Events(String name, String date, String time, String crowd, String image) {
		super();
		this.name = name;
		this.date = date;
		this.time = time;
		this.crowd = crowd;
		this.image = image;
	}
	
	public Events() {
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getCrowd() {
		return crowd;
	}
	public void setCrowd(String crowd) {
		this.crowd = crowd;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}


	
}
