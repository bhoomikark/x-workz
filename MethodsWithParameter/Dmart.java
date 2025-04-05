class Dmart
{
	static void no_of_items(int TotalNo)
	{
		System.out.println("To see total no of items: ");
		System.out.println(TotalNo);
		
	}
	static void nearBy(String[] Places)
	{
		System.out.println("To see near by places where Dmart present");
		for(String index:Places)
		{
			System.out.println("-"+index);
		}
		
	}
	static void DMart(boolean OpenOrClose)
	{
		System.out.println("To check whether Dmart is open or not");
		System.out.println(OpenOrClose);
	}
	static void Available(int book,String BookName,boolean AvailableOrNot)
	{
		System.out.println("To check available books");
		
		System.out.println("no of book Available: "+book);
		System.out.println("Book name: "+BookName);
		System.out.println("Available or not: "+AvailableOrNot);
	}
	static void Pens(int NoOfPen,String PenName,boolean IsAvailable)
	{
		System.out.println("Checking available pens");
        System.out.println("Number of pens available: " + NoOfPen);
        System.out.println("Pen name: " + PenName);
        System.out.println("Available or not: " + IsAvailable);
	}
	static void BedCover(int BedCoverAvailable,String Colour)
	{
		System.out.println("Checking bed cover availability");
        System.out.println("Number of bed covers available: " + BedCoverAvailable);
        System.out.println("Colour of bed cover: " + Colour);
	
	}
	static void GoodLife(long StockAvailable,boolean CheckOutofDate)
	{
		 System.out.println("Checking GoodLife product stock");
        System.out.println("Stock available: " + StockAvailable);
        System.out.println("Out of date or not: " + CheckOutofDate);
		
	}
}