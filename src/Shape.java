

public class Shape {
	private Point point;
	
	public Shape() {
		
	}
	public Shape(Point point) {
		this.point = point;
	}
	
	public void show() {
		System.out.println("점 [x = "+point.getX()+", y = "+point.getY()+"] 를 그렸습니다.");
	}
	
	public void show(boolean visible) {
		if (visible) {
			show();
		} else {
			System.out.println("점 [ x = "+point.getX()+", y = "+point.getY()+" ] 을 지웠습니다." );
		}
	}


}
