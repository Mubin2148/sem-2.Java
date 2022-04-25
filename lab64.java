interface EventListener{
	public void performEvent();
}

interface MouseListener extends EventListener{
	public void mouseClicked();
	public void mousePressed();
	public void mouseReleased();
	public void mouseMoved();
	public void mouseDragged();
}

interface KeyListener extends EventListener{

	public void keyPressed();
	public void keyReleased();
}

class EventDemo implements MouseListener,KeyListener{

	public void performEvent(){
		System.out.println("performEvent");
	}

	public void mouseClicked(){
		System.out.println("mouseClicked");
	}

	public void mousePressed(){
		System.out.println("mousepresed");
	}

	public void mouseReleased(){
		System.out.println("mouseReleased");
	}

	public void mouseMoved(){
	System.out.println("mousemoved");
	}

	public void mouseDragged(){
		System.out.println("mouseDragged");
	}

	public void keyPressed(){
		System.out.println("keyPressed");
	}

	public void keyReleased(){
		System.out.println("keyReleased");
	}
}

class lab64{

	public static void main(String[] args) {

		EventDemo e1=new EventDemo();
		e1.performEvent();
		e1.mouseMoved();
		e1.mouseReleased();
		e1.mouseDragged();
		e1.mouseClicked();
		e1.mousePressed();
		e1.keyReleased();
		e1.keyPressed();
	}
}