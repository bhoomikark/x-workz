class ParameterAndReturnType
{
static String nameOfPerson(long mobileNo)
{
if(mobileNo==9632358154L)
{
System.out.println("||||| 1---MobileNo|||||");
return "Ram";
}
else if(mobileNo==9732358154L)
{
System.out.println("||||| 2---MobileNo |||||");
return "Abhinav";
}
else if(mobileNo==9732368154L)
{
System.out.println("||||| 3---MobileNo |||||");
return "Abhijith";
}
else if(mobileNo==9732358254L)
{
System.out.println("||||| 4---MobileNo |||||");
return "Abhilash";
}
else if(mobileNo==9132358154L)
{
System.out.println("||||| 5---MobileNo |||||");
return "Bhuvan";
}
else if(mobileNo==9232358154L)
{
System.out.println("||||| 6---MobileNo |||||");
return "Bhushan";
}
else if(mobileNo==9740632732L)
{
System.out.println("||||| 7---MobileNo |||||");
return "Bhoomika";
}
else if(mobileNo==9332358154L)
{
System.out.println("||||| 8---MobileNo |||||");
return "Chloe";
}
else if(mobileNo==9712358154L)
{
System.out.println("||||| 9---MobileNo |||||");
return "Dan";
}
else if(mobileNo==9722358154L)
{
System.out.println("||||| 10---MobileNo |||||");
return "Emma";
}
else if(mobileNo==9742358154L)
{
System.out.println("||||| 11---MobileNo |||||");
return "Finn";
}
else if(mobileNo==9752358154L)
{
System.out.println("||||| 12---MobileNo |||||");
return "Grace";
}
else if(mobileNo==9732158154L)
{
System.out.println("||||| 13---MobileNo |||||");
return "Harry";
}
else if(mobileNo==9732338154L)
{
System.out.println("||||| 14---MobileNo |||||");
return "Ivy";
}
else if(mobileNo==9732351154L)
{
System.out.println("||||| 15---MobileNo |||||");
return "Jack";
}
else if(mobileNo==9732352154L)
{
System.out.println("||||| 16---MobileNo |||||");
return "Kate";
}
else if(mobileNo==9732358255L)
{
System.out.println("||||| 17---MobileNo |||||");
return "Leo";
}
else if(mobileNo==9732358354L)
{
System.out.println("||||| 18---MobileNo |||||");
return "Mia";
}
else if(mobileNo==9732358454L)
{
System.out.println("||||| 19---MobileNo |||||");
return "Noah";
}
else if(mobileNo==9732358554L)
{
System.out.println("||||| 20---MobileNo |||||");
return "Oliver";
}
else if(mobileNo==9732358654L)
{
System.out.println("||||| 21---MobileNo |||||");
return "Paul";
}
else if(mobileNo==9732358754L)
{
System.out.println("||||| 22---MobileNo |||||");
return "Shawn";
}
else if(mobileNo==9732358054L)
{
System.out.println("||||| 23---MobileNo |||||");
return "Ryan";
}
System.out.println("|||||| Returns not found |||||");
return "Number Not found";
}
static String ownerName(String companyName)
{
	if(companyName=="Google")
	{
		System.out.println("---COMPANY1---");
		return "Larry Page";
	}
	else if(companyName=="Accenture")
	{
		System.out.println("---COMPANY2  -->  Accenture---");
		return "Arthur Andersen";
	}
	else if(companyName=="Cognizant")
	{
		System.out.println("---COMPANY3---");
		return "Kumar Mahadev";
	}
	else if(companyName=="LTI Mindtree")
	{
		System.out.println("---COMPANY4---");
		return "Larsen and Toubro Infotech";
	}
	else if(companyName=="TCS")
	{
		System.out.println("---COMPANY5---");
		return "J.R.D Tata";
	}
	else if(companyName=="Microsoft")
	{
		System.out.println("---COMPANY6---");
		return "Bill Gates";
	}
	else if(companyName=="Apple")
	{
		System.out.println("---COMPANY7  --> Apple---");
		return "Steve Jobs";
	}
	else if(companyName=="Amazon")
	{
		System.out.println("---COMPANY8---");
		return "Jreff Bezos";
	}
	else if(companyName=="Facebook")
	{
		System.out.println("---COMPANY9---");
		return "Mark Zuckerberg";
	}
	else if(companyName=="Tesla")
	{
		System.out.println("---COMPANY10---");
		return "Elon Musk";
	}
	
	else if(companyName=="Infosys")
	{
		System.out.println("---COMPANY11---");
		return "Narayana Murthy";
	}
	else if(companyName=="Wipro")
	{
		System.out.println("---COMPANY12---");
		return "Mohamed Premji";
	}
	System.out.println("---Company Not Found---");
	return "Not Found";
}
static int price(String foodItem)
{
	if(foodItem=="Pizza")
	{
		System.out.println("--- ItemNo1 ==> Pizza ---");
		return 250;
	}
	else if(foodItem=="Burger")
	{
		System.out.println("--- ItemNo2 ==> Burger ---");
		return 120;
	}
	else if(foodItem=="Pasta")
	{
		System.out.println("--- ItemNo3 ==> Pasta ---");
		return 180;
	}
	else if(foodItem=="Dosa")
	{
		System.out.println("--- ItemNo4 ==> Dosa ---");
		return 90;
	}
	else if(foodItem=="Idli")
	{
		System.out.println("--- ItemNo5 ==> Idli ---");
		return 120;
	}
	else if(foodItem=="Samosa")
	{
		System.out.println("--- ItemNo6 ==> Samosa ---");
		return 20;
	}
	else if(foodItem=="Biryani")
	{
		System.out.println("--- ItemNo7 ==> Biryani ---");
		return 120;
	}
	else if(foodItem=="Pav Bhaji")
	{
		System.out.println("--- ItemNo8 ==> Pav Bhaji ---");
		return 150;
	}
	else if(foodItem=="Noodles")
	{
		System.out.println("--- ItemNo9 ==> Noodles ---");
		return 130;
	}
	else if(foodItem=="Sandwich")
	{
		System.out.println("--- ItemNo10 ==> Sandwich ---");
		return 100;
	}
	else if(foodItem=="Chaat")
	{
		System.out.println("--- ItemNo11 ==> Chaat ---");
		return 80;
	}
	
	else if(foodItem=="Paratha")
	{
		System.out.println("--- ItemNo12 ==> Paratha ---");
		return 110;
	}
	else if(foodItem=="	Momos")
	{
		System.out.println("--- ItemNo13 ==> Momos ---");
		return 90;
	}
	else if(foodItem=="Momos")
	{
		System.out.println("--- ItemNo13 ==> Momos ---");
		return 90;
	}
	else if(foodItem=="Momos")
	{
		System.out.println("--- ItemNo14 ==> Momos ---");
		return 90;
	}
	else if(foodItem=="	Fries")
	{
		System.out.println("--- ItemNo15 ==> Fries ---");
		return 70;
	}
	else if(foodItem=="	Dal Rice")
	{
		System.out.println("--- ItemNo16 ==> Dal Rice ---");
		return 140;
	}
	else if(foodItem=="	Ice Cream")
	{
		System.out.println("--- ItemNo17 ==> Ice Cream ---");
		return 60;
	}
	else if(foodItem=="	Tea")
	{
		System.out.println("--- ItemNo18 ==> Tea ---");
		return 20;
	}
	else if(foodItem=="	Juice")
	{
		System.out.println("--- ItemNo19 ==> Juice ---");
		return 50;
	}
	
	System.out.println("     The food item is not thier in the list    ");
	return 00;
}
static int balance(long accNo)
{
	if(accNo==987654321012L)
	{
		System.out.println("=== AccountNumber1 is 987654321012 ===");
		return 25000;
		
	}
	else if(accNo==123456789034L)
	{
		System.out.println("=== AccountNumber2 is 123456789034 ===");
		return 50000;
		
	}
	else if(accNo==456789123056L)
	{
		System.out.println("=== AccountNumber3 is 456789123056 ===");
		return 15600;
		
	}
	else if(accNo==321098765090L)
	{
		System.out.println("=== AccountNumber4 is 321098765090 8 ===");
		return 10500;
		
	}
	else if(accNo==654321098012L)
	{
		System.out.println("=== AccountNumber5 is 654321098012 ===");
		return 89000;
		
	}
	else if(accNo==234567890134L)
	{
		System.out.println("=== AccountNumber6 is 234567890134 ===");
		return 32700;
		
	}
	else if(accNo==123456789035L)
	{
		System.out.println("=== AccountNumber7 is 123456789034 ===");
		return 32800;
		
	}
	else if(accNo==567890123256L)
	{
		System.out.println("=== AccountNumber8 is 567890123256 4 ===");
		return 44800;
		
	}
	else if(accNo==890123456378L)
	{
		System.out.println("=== AccountNumber9 is 890123456378 ===");
		return 60200;
		
	}
	else if(accNo==1112233445566L)
	{
		System.out.println("=== AccountNumber10 is 112233445566 ===");
		return 37900;
		
	}
	else if(accNo==223344556677L)
	{
		System.out.println("=== AccountNumber11 is 223344556677 ===");
		return 98500;
		
	}
	else if(accNo==123456789034L)
	{
		System.out.println("=== AccountNumber12 is 123456789034 ===");
		return 98500;
		
	}
	else if(accNo==334455667788L)
	{
		System.out.println("=== AccountNumber13 is 334455667788 ===");
		return 12400;
		
	}
	else if(accNo==445566778899L)
	{
		System.out.println("=== AccountNumber14 is 445566778899 ===");
		return 75100;
		
	}
	else if(accNo==556677889900L)
	{
		System.out.println("=== AccountNumber15 is 556677889900 ===");
		return 5600;
		
	}
	else if(accNo==667788990011L)
	{
		System.out.println("=== AccountNumber16 is 667788990011 ===");
		return 8900;
		
	}
	else if(accNo==778899001122L)
	{
		System.out.println("=== AccountNumber17 is 778899001122 ===");
		return 93700;
		
	}
	System.out.println("    AccNo Not found    ");
	return 0;
	
}
static int getPriceBySource(String source) {
    if (source=="Bangalore") {
        System.out.println("=== Source is Bangalore ===");
        return 5000;
    } else if (source=="Delhi") {
        System.out.println("=== Source is Delhi ===");
        return 7000;
    } else if (source=="Mumbai") {
        System.out.println("=== Source is Mumbai ===");
        return 6500;
    } else if (source=="Kolkata") {
        System.out.println("=== Source is Kolkata ===");
        return 6000;
    } else if (source=="Chennai") {
        System.out.println("=== Source is Chennai ===");
        return 5500;
    } else if (source=="Hyderabad") {
        System.out.println("=== Source is Hyderabad ===");
        return 6200;
    } else if (source=="Pune") {
        System.out.println("=== Source is Pune ===");
        return 5800;
    } else if (source=="Ahmedabad") {
        System.out.println("=== Source is Ahmedabad ===");
        return 6100;
    } else if (source=="Jaipur") {
        System.out.println("=== Source is Jaipur ===");
        return 5700;
    } else if (source=="Lucknow") {
        System.out.println("=== Source is Lucknow ===");
        return 5900;
    } else if (source=="Bhopal") {
        System.out.println("=== Source is Bhopal ===");
        return 5300;
    } else if (source=="Indore") {
        System.out.println("=== Source is Indore ===");
        return 5400;
    } else if (source=="Chandigarh") {
        System.out.println("=== Source is Chandigarh ===");
        return 5600;
    } else if (source=="Coimbatore") {
        System.out.println("=== Source is Coimbatore ===");
        return 5200;
    } else if (source=="Visakhapatnam") {
        System.out.println("=== Source is Visakhapatnam ===");
        return 5100;
    } else if (source=="Nagpur") {
        System.out.println("=== Source is Nagpur ===");
        return 5000;
    } else if (source=="Mysore"){
        System.out.println("=== Source is Mysore ===");
        return 4900;
    } else if (source=="Thiruvananthapuram") {
        System.out.println("=== Source is Thiruvananthapuram ===");
        return 4800;
    } else if (source=="Vijayawada") {
        System.out.println("=== Source is Vijayawada ===");
        return 4700;
    } else if (source=="Goa"){
        System.out.println("=== Source is Goa ===");
        return 4500;
    } else {
        System.out.println("Source not found!");
        return -1; // Indicating an invalid source
    }
}
static boolean Alive(String LiveOrNotLive)
{
	if(LiveOrNotLive=="human")
	{
		System.out.println("===  1==>human  ===");
		return true;
	}
	else if(LiveOrNotLive=="Dog")
	{
		System.out.println("===  2==>Dog  ===");
	return true;
	}
	
	else if(LiveOrNotLive=="Cat")
	{
		System.out.println("===  3==>Cat  ===");
		return true;
	}
	else if(LiveOrNotLive=="Rock")
	{
		System.out.println("===  4==>Rock  ===");
		return false;
	}
	else if(LiveOrNotLive=="Car")
	{
		System.out.println("===  5==>Car  ===");
		return false;
	}
	else if(LiveOrNotLive=="lion")
	{
		System.out.println("===  6==>lion  ===");
		return true;
	}
	else if(LiveOrNotLive=="Eagle")
	{
		System.out.println("===  7==>Eagle  ===");
		return true;
	}
	else if(LiveOrNotLive=="Pen")
	{
		System.out.println("===  8==>Pen  ===");
		return false;
	}
	System.out.println("  Things Not found  ");
	return false;
}
}