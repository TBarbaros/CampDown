package software;

public class Main {

	public static void main(String[] args){
		
		Software software1 = new Software();
		software1.id=1;
		software1.detail="4 Camera";
		software1.name="Plate Recognition System";
		software1.unitPrice = 16000;
		
		
		Software software2 = new Software();
		software2.id=2;
		software2.detail="Student System";
		software2.name="Server and Client";
		software2.unitPrice = 8000;
		
		Software software3 = new Software();
		software3.id=3;
		software3.detail="2'li Access Panel";
		software3.name="Access System";
		software3.unitPrice = 35000;
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Yazýlým";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Cihazlar";
		
       SoftwareManager productManager = new SoftwareManager();
		
		productManager.addToCart(software1);
		productManager.addToCart(software2);
		productManager.addToCart(software3);
		
		Software[] softwares = {software1,software2,software3};
		
		for(Software product : softwares)
		{
			System.out.println(product.name);
		}
		
		
		
		System.out.println(softwares.length);
		
	}

}
