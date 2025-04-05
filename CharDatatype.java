// Character Data Type Class
class CharDatatype {
    public static void main(String[] args) {
        System.out.println("Character Data Type Before Reinitialization:");
        char grade = 'A';
        char section = 'B';
        char gender = 'M';
        char bloodGroup = 'O';
        char Brandlogo = 'B';

        System.out.println("Grade: " + grade);
        System.out.println("Section: " + section);
        System.out.println("Gender: " + gender);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Brandlogo: " + Brandlogo);

        // Reinitialization
        grade = 'B';
        section = 'C';
        gender = 'F';
        bloodGroup = 'A';
        Brandlogo = 'M';

        System.out.println("\nCharacter Data Type After Reinitialization:");
        System.out.println("Grade: " + grade);
        System.out.println("Section: " + section);
        System.out.println("Gender: " + gender);
        System.out.println("Blood Group: " + bloodGroup);
        System.out.println("Brandlogo: " + Brandlogo);
    }
}

