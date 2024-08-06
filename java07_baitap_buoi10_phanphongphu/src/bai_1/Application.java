package bai_1;
public class Application {
	public static void main(String[] args) {
		
		FullTimeEmployee ft = new FullTimeEmployee();
		PartTimeEmployee pt = new PartTimeEmployee();
		
		ft.import_infor();
		System.out.println();
		pt.import_infor();
		System.out.println();
		ft.display_infor();
		System.out.println();
		pt.display_infor();
	}

}
