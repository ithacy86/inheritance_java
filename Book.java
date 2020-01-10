/**
*Base Class   : Book
*Author       : Rishi Sidhu
*Organization : AI Graduate
**/
public class Book
{
	public String author;                              
	public float costPrice;               
	public float salePrice;
	public String title;
	public int pages;
	public Book(String au, float cp, float sp, String tl, int pg){ 
		author 			= au;
		costPrice		= cp;
		salePrice	 	= sp;
		title 			= tl;
		pages 			= pg;
	}

	//Compute net profit per book
	public float netProfit()
	{
		return (salePrice - costPrice);
	}
	//Compute tax on net profit per book @ 30%
	public float getTax()
	 {
	 	return (0.3f*this.netProfit());
	 }
}