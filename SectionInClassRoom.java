class SectionInClassRoom
{
public static void main(String[] args)
{
System.out.println("Creating array for characters and accessing: ");
char  section1='A';
char section2='B';
char section3='C';
char section4='D';
char section5='E';
char section6='F';
char section7='G';
char section8='H';
char section9='I';
char section10='J';
char sections[]={section1,section2,section3,section4,section5,section6,section7,section8,section9,section10};
for(char section: sections )
{
System.out.println("Section: "+section);
}

}
}