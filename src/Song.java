
public class Song {
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	public Song(String artist, String title, String album, int year, int track, String composer) {
		this.artist = artist;  //this를 붙여 줌으로서 스택이 아니라 인스턴스 변수를 가리키게 된다.
		//연보라색 아티스트는 레퍼런스값이다@@@@@@@@@@@@@@@@@@@@@@@@@
		this.title = title;
		this.album = album;
		this.year = year;
		this.track = track; 
		this.composer = composer;
	}
	
	public Song(String artist, String title) {
	/*	this.artist = artist;
		this.title = title;
		this.album = "";
		this.composer = "";*/
		this(artist, title, "Unknown", 0, 0, "Unknown");
	}
	
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void show() {
		System.out.println(artist+" "+title+" ( "+album+", "+year+", "+track+"번 track, "+composer+" 작곡 ) ");
	}
}
