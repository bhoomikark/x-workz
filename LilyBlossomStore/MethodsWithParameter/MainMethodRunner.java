class MainMethodRunner{
public static void main(String[] args)
{
  int NoOfTimes=2;
  Paper.paperFold(NoOfTimes);
  boolean trueorfalse=true;
  Paper.paperThrow(trueorfalse);
  String colour="white";
  Paper.paperColour(colour);
  String Quality="Thin";
  int NoOfPages=4;
  Paper.PaperType(Quality,NoOfPages);
  int Pages=5;
  boolean YesorNo=false;
  Paper.PaperSize(Pages,YesorNo);
  String Name="BoxLine";
  boolean RuledorUnruled=true;
  int NoofLines=40;
  Paper.TypeofLines(Name,RuledorUnruled,NoofLines);
  
  int length=10;
  int breadth=5;
  int height=20;
  Paper.PaperLength(length,breadth,height);
  
  String TypeOfCloth="Cotton";
  WhiteBoard.Clean(TypeOfCloth);
  
  int typeNo=4;
  WhiteBoard.NoofBoards(typeNo);
  
  String[] Action={"Rub","Write"};
  WhiteBoard.NoOfActions(Action);
  
  String ColourName="Blue";
  int NoOfPen=2;
  WhiteBoard.ColorOfPen(ColourName,NoOfPen);
  
  
  String fontSize="Bold";
  boolean Is_Bold=true;
  int noOfLines=2;
  WhiteBoard.writeContent(fontSize,Is_Bold,noOfLines);
  
  int NoOfLines=45;
  int NoOfPara=4;
  boolean yesorno=true;
  WhiteBoard.eraseContent(NoOfLines,NoOfPara,yesorno);
  
  boolean YesorNo1=true;
  TubeLight.turn_on(YesorNo1);
  boolean TrueorFalse=false;
   TubeLight.turn_off(TrueorFalse);
   
   String Name1="Philips";
  TubeLight.BrandName(Name1);
  
  String[] Names={"Tungston","Copper"};
  int NoofWire=10;
  boolean GoodConductororNot=false;
 TubeLight.MaterialsUsed(Names,NoofWire,GoodConductororNot);
 
 boolean MediumorLow=true;
 int VolumeAdjust=4;
 String ColourofLight="White";
 TubeLight.AdjustBrightness(MediumorLow,VolumeAdjust,ColourofLight);
 
 int duration=3;
 String mode="ON";
 TubeLight.set_Timer(duration,mode);
 
 
 float duration1=2.0f;
 boolean trueorAutoOff=true;
 TubeLight.set(duration1,trueorAutoOff);
  // Dmart functionality
        int TotalNoOfItems = 500;
        Dmart.no_of_items(TotalNoOfItems);

        String[] nearbyPlaces = {"Malleshwaram", "JP Nagar", "Indiranagar"};
        Dmart.nearBy(nearbyPlaces);

        boolean OpenOrClose = true;
        Dmart.DMart(OpenOrClose);

        int NoOfBooks = 10;
        String BookName = "Harry Potter";
        boolean AvailableOrNot = true;
        Dmart.Available(NoOfBooks, BookName, AvailableOrNot);

        int NoOfPens = 20;
        String PenBrand = "Reynolds";
        boolean IsAvailable = true;
        Dmart.Pens(NoOfPens, PenBrand, IsAvailable);

        int BedCoverAvailable = 15;
        String BedCoverColour = "Blue";
        Dmart.BedCover(BedCoverAvailable, BedCoverColour);

        long StockAvailable = 2000;
        boolean CheckOutofDate = false;
        Dmart.GoodLife(StockAvailable, CheckOutofDate);
		
		
  // FoodItem functionality
        String[] foodNames = {"Pizza", "Burger", "Pasta", "Rasmalai"};
        FoodItem.ItemName(foodNames);

        int totalFoodItems = 10;
        FoodItem.TotalNo(totalFoodItems);

        boolean RasmalaiAvailable = true;
        FoodItem.Rasmalai(RasmalaiAvailable);

        String foodToCook = "Biryani";
        int cookingTime = 45;
        FoodItem.cook(foodToCook, cookingTime);

        String foodToStore = "Ice Cream";
        float storageTemp = -18.0f;
        FoodItem.store(foodToStore, storageTemp);

        String foodToServe = "Paneer Tikka";
        int serveQuantity = 3;
        String plateType = "Steel Plate";
        FoodItem.serve(foodToServe, serveQuantity, plateType);

        String foodToBuy = "Chocolate";
        float price = 50.0f;
        int buyQuantity = 5;
        FoodItem.buy(foodToBuy, price, buyQuantity);
		
		// Beer functionalities
        String[] beerTypes = {"Lager", "Stout", "Pale Ale", "Pilsner", "Wheat Beer"};
        Beer.type(beerTypes);

        int totalBeers = 50;
        Beer.NoOfBeer(totalBeers);

        String preferredBrand = "Heineken";
        Beer.BrandUPrefer(preferredBrand);

        int beerQuantity = 500; // in ml
        String glassType = "Mug";
        Beer.pourBeer(beerQuantity, glassType);

        int numberOfSips = 10;
        boolean isChilled = true;
        Beer.drinkBeer(numberOfSips, isChilled);

        String ingredient = "Barley Malt";
        int fermentationDays = 14;
        double alcoholPercentage = 5.2;
        Beer.brewBeer(ingredient, fermentationDays, alcoholPercentage);

        String flavour = "Citrusy";
        int bitternessLevel = 7;
        double userRating = 4.5;
        Beer.rateBeer(flavour, bitternessLevel, userRating);
		
		Mask.available(100); // Total masks available

        Mask.MaskType("N95"); // Type of mask

        Mask.Fit(true); // Fit status (true for tight, false for loose)

        Mask.wearMask("Medium", "Black"); // Wearing mask with size and color

        Mask.removeMask(true, "Cotton"); // Checking if reusable and material type

        Mask.washMask(40, "Mild Detergent", true); // Washing mask

        Mask.adjustMask("Elastic", true, 8);
		
    

 
  
  
  
  
 
  
  
  
  
  
}
}