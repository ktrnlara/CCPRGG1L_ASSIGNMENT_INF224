public class Assignment2 {
    public static void main(String[] args) throws Exception {

//Use a while loop to print your FIRSTNAME three times.
// while loop

    int count1 = 0;

    while (count1 !=3){
    System.out.println("MA. KATRINA");
    count1 ++;
    }
        
//Use a do-while loop to print your MIDDLENAME four times.
// do while loop

    int count2 = 0;

    do {
        System.out.println("PEDRIALVA");
        count2 ++;
    } while (count2 != 4);
	
//Use a for loop to print your SURNAME five times.
//for loop

    for (int count3 = 0; count3  != 5;  count3 ++) {
    System.out.println("LARA");

    }
	
//Create a char array that consists all of the characters of your FIRSTNAME and use a for loop to print each character of your FIRSTNAME. (example: ELIZER)
// char array
        
    char [] myFirstName = {'M', 'A', 'K', 'A', 'T', 'R', 'I', 'N', 'A'};

    // MA KATRINA

    for (int i = 0; i < myFirstName.length; i++){
    System.out.println(myFirstName[i]);
    }
	
//Use a for loop to print the char array of your FIRSTNAME in REVERSE order (example: REZILE)
// char array in reverse

    // ANIRTAK AM
    
    for (int i = myFirstName.length - 1; i >= 0; i--) {
    System.out.println(myFirstName[i]);

    
        }
    }
}
