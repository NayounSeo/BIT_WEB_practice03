

public class Shape {
	private Point point;
	
	public Shape() {
		
	}
	public Shape(Point point) {
		this.point = point;
	}
	
	public void show() {
		System.out.println("�� [x = "+point.getX()+", y = "+point.getY()+"] �� �׷Ƚ��ϴ�.");
	}
	
	public void show(boolean visible) {
		if (visible) {
			show();
		} else {
			System.out.println("�� [ x = "+point.getX()+", y = "+point.getY()+" ] �� �������ϴ�." );
		}
	}


}
