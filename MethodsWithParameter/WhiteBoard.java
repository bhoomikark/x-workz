class WhiteBoard
{
	static void Clean(String TypeOfCloth)
	{
		System.out.println("Type of cloth used to rub board");
		System.out.println(TypeOfCloth);
	}
	static void NoofBoards(int typeNo)
	{
		System.out.println("No of boards in a class are: ");
		System.out.println(typeNo);
		
	}
	static void NoOfActions(String[] ActionName)
	{
		System.out.println("No of actions that can be performed");
		for(String index: ActionName)
		{
			System.out.println(index);
		}
		
		
	}
	static void ColorOfPen(String ColourName,int NoOfPen)
	{
		System.out.println("Color of pen , Color name, no of pen");
		System.out.println(ColourName);
		System.out.println(NoOfPen);
		
	}
	static void InkColourOfPen(String ColourName,boolean noOfInkAvailable)
	{
		System.out.println("InkColor of pen : color name and ink available or not");
		System.out.println(ColourName);
		System.out.println(noOfInkAvailable);
		
	}
	
	static void writeContent(String fontSize,boolean Is_Bold,int noOfLines)
	{
		System.out.println("To write on white board : the Font Size , should be bold or not,no of lines");
		System.out.println(fontSize);
		System.out.println(Is_Bold);
		System.out.println(noOfLines);
		
	}
	static void eraseContent(int NoOfLines,int NoOfPara,boolean yesorno)
	{
		System.out.println("To erase the content , no of lines , no of para, should erase content or not");
		System.out.println(NoOfLines);
		System.out.println(NoOfPara);
		System.out.println(yesorno);
	}

}