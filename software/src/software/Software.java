package software;

public class Software 
{
	public Software() {
		System.out.println("SoftWare Eklendi");
	}
	
	public Software(int id,String name,double unitPrice,String detail) {
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;
	} 
	
	int id;
	String name ;
	double unitPrice ;
	String detail;
	
}
