/**
*Sub Class    : EBook
*Author       : Rishi Sidhu
*Organization : AI Graduate
**/
public class EBook extends Book
{
	public String downloadSite;
	public int sizeMB;
	public EBook(String au, float cp, float sp, String tl, int pg, String ds, int sz){
		super(au,cp,sp,tl,pg);
		downloadSite 	= ds;
		sizeMB 			= sz;
	}

	//Get the per page size
	public float pageSize()
	{
		return ((float)sizeMB/(float)pages);
	}

	//Print book title
	public void printTitle()
	{
		System.out.print("The title of this book is: "+ title);
	}

	//Compute tax on net profit per book @ 30% + A fixed $2 ebook tax
	public float getTax()
	{
		return (0.3f*this.netProfit() + 2);
	}

}