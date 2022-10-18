public class Assignment2 {
    public static void main(String[] args) throws Exception {

//Use a while loop to print your FIRSTNAME three times.
// while loop
    int count = 0;

    while (count !=3){
    System.out.println("MA. KATRINA");

    count ++;
    }
        
//Use a do-while loop to print your MIDDLENAME four times.
// do while loop

    int i = 0;

    do {
    System.out.println("PEDRIALVA");

    i ++;
    } while (i != 4);
	
//Use a for loop to print your SURNAME five times.
//for loop

    for (int l = 0; l != 5;  l++) {
    System.out.println("LARA");

    }
	
//Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)
// char array
        
    String[] myFirstName = {"M","A","K","A","T","R","I","N","A"};

    for (int counter = 0; counter < myFirstName.length; counter++) {
    System.out.println(myFirstName[counter]);

    }
	
//Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)
// char array in reverse
        
    String[] myfirstname = {"A","N","I","R","T","A","K","A","M"};

    for (int l = 0; l < myFirstName.length; l++) {
    System.out.println(myfirstname[l]);
    
}
    }
}
	


