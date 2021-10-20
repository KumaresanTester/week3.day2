package week3.day2;

public class Desktop implements Software, HardWare {

	public void hardwareResources() {
		System.out.println("This is Hardware Resources");
	}

	public void softwareResources() {
		System.out.println("This is Software Resources");
	}

	public void desktopModel() {
		System.out.println("This is Desktop Model");
	}
	
	public static void main(String[] args) {
		Desktop obj=new Desktop();
		obj.softwareResources();
		obj.hardwareResources();
		obj.desktopModel();
	}

}
