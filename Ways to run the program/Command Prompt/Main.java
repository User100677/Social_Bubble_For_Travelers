import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.lang.Math;

class IncomingPassenger{ /* This is the first part of the coursework */

    Scanner info = new Scanner(System.in);
    private String firstName;
    private String lastName ;
    private String country;
    public int departureDay;
    public int departureMonth;
    public int departureYear;
    int group;  /* The ranking of the country based on the severity and spread of COVID-19.*/

    LocalDate arrivalDate = LocalDate.now();  /* Get the current date*/
    DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy"); /* format the date pattern from yyyy-MM-dd to dd/MM/yyy*/
    public String formattedArrivalDate = arrivalDate.format(formatDate);

    public void passengerInfo(){  /*get the user personal information*/

        System.out.println("Please enter your first name: ");
        this.firstName = info.nextLine();
        System.out.println("Please enter your last name: ");
        this.lastName = info.nextLine();
        System.out.println("Please enter your country: ");
        this.country = info.nextLine();
        System.out.println("Please enter your departure day: ");
        this.departureDay = info.nextShort();
        System.out.println("Please enter your departure month: ");
        this.departureMonth=info.nextShort();
        System.out.println("Please enter your departure year: ");
        this.departureYear = info.nextShort();



    }

    public String getFirstName(){

        return this.firstName;
    }
    public String getLastName(){

        return this.lastName;
    }
    public String getCountry(){

        return this.country;
    }

    public void Quarantine(){  /*Determined and display the quarantine period. And also Determined the rank of the country.*/

        if(country.compareToIgnoreCase("Brunei")==0){      /* Brunei is in rank 1 */
            group = 1;
            LocalDate quarantineDate = arrivalDate.plusDays(7);  /* add the quarantine days to the current date */
            String formattedQuarantineDate = quarantineDate.format(formatDate);

            System.out.println("You are coming from Brunei. Your country severity and spread of COVID-19 is rank " + group + " in Malaysia (The rank is based on the severity of Covid spread in your country(with 5 being the worst)).");
            System.out.println("Your quarantine period will be 7 days.");
            System.out.println("Your quarantine period is from " + formattedArrivalDate + " until " + formattedQuarantineDate + "");
        }
        else
        if(country.compareToIgnoreCase("Cambodia")==0){  /* Cambodia is in rank 2 */
            group = 2;
            LocalDate quarantineDate = arrivalDate.plusDays(7);   /* add the quarantine days to the current date */
            String formattedQuarantineDate = quarantineDate.format(formatDate);

            System.out.println("You are coming from Cambodia. Your country severity and spread of COVID-19 is rank " + group + " in Malaysia(The rank is based on the severity of Covid spread in your country(with 5 being the worst)).");
            System.out.println("Your quarantine period will be 7 days.");
            System.out.println("Your quarantine period is from " + formattedArrivalDate + " until " + formattedQuarantineDate + "");
        }
        else
        if(country.compareToIgnoreCase("Taiwan")==0){   /* Taiwan is in rank 3 */
            group = 3;
            LocalDate quarantineDate = arrivalDate.plusDays(7);       /* add the quarantine days to the current date */
            String formattedQuarantineDate = quarantineDate.format(formatDate);

            System.out.println("You are coming from Taiwan. Your country severity and spread of COVID-19 is rank " + group + " in Malaysia(The rank is based on the severity of Covid spread in your country(with 5 being the worst)).");
            System.out.println("Your quarantine period will be 7 days.");
            System.out.println("Your quarantine period is from " + formattedArrivalDate + " until " + formattedQuarantineDate + "");
        }
        else
        if(country.compareToIgnoreCase("Iceland")==0){  /* Iceland is in rank 4 */
            group = 4;
            LocalDate quarantineDate = arrivalDate.plusDays(10);  /* add the quarantine days to the current date */
            String formattedQuarantineDate = quarantineDate.format(formatDate);

            System.out.println("You are coming from Ica]eland. Your country severity and spread of COVID-19 is rank " + group + " in Malaysia(The rank is based on the severity of Covid spread in your country(with 5 being the worst)).");
            System.out.println("Your quarantine period will be 10 days.");
            System.out.println("Your quarantine period is from " + formattedArrivalDate + " until " + formattedQuarantineDate + "");
        }
        else
        if(country.compareToIgnoreCase("Egypt")==0){  /* Egypt is in rank 5 */
            group = 5;
            LocalDate quarantineDate = arrivalDate.plusDays(10);  /* add the quarantine days to the current date */
            String formattedQuarantineDate = quarantineDate.format(formatDate);

            System.out.println("You are coming from Egypt. Your country severity and spread of COVID-19 is rank " + group + " in Malaysia(The rank is based on the severity of Covid spread in your country(with 5 being the worst)).");
            System.out.println("Your quarantine period will be 10 days.");
            System.out.println("Your quarantine period is from " + formattedArrivalDate + " until " + formattedQuarantineDate + "");
        }
        else
        if(country.compareToIgnoreCase("Japan")==0){  /* Japan is in rank 6 */
            group =6;
            LocalDate quarantineDate = arrivalDate.plusDays(10);  /* add the quarantine days to the current date */
            String formattedQuarantineDate = quarantineDate.format(formatDate);

            System.out.println("You are coming from Japan. Your country severity and spread of COVID-19 is rank " + group + " in Malaysia(The rank is based on the severity of Covid spread in your country(with 5 being the worst)).");
            System.out.println("Your quarantine period will be 10 days.");
            System.out.println("Your quarantine period is from " + formattedArrivalDate + " until " + formattedQuarantineDate + "");
        }
        else {
            group = 7;             /* other countries are in rank 7 */
            LocalDate quarantineDate = arrivalDate.plusDays(14);  /* add the quarantine days to the current date */
            String formattedQuarantineDate = quarantineDate.format(formatDate);

            System.out.println("You are coming from " + country + ". Your country severity and spread of COVID-19 is rank " + group + " in Malaysia(The rank is based on the severity of Covid spread in your country(with 5 being the worst)).");
            System.out.println("Your quarantine period will be 14 days.");
            System.out.println("Your quarantine period is from " + formattedArrivalDate + " until " + formattedQuarantineDate + "");
        }
    }
}

class Visitor extends IncomingPassenger{ /* This is the second part of the coursework*/
    Scanner place = new Scanner(System.in);
    Random rand = new Random();
    int crowd;
    public int rating;  /* This is the rating for the place */
    String visitPlace;

    public void domesticTravel(){ /* This is to ask the user the place they wanted to go and determined whether they are allowed or not allowed to go to that place*/
        System.out.println("Please enter a place that you would like to visit: ");
        visitPlace = place.nextLine();
        System.out.println();
        int infection = (int)(Math.random()*3);  /* this is to detect if the place have any infection */
        crowd = rand.nextInt(3000);  /* This is to generate the amount of people that are currently visiting the place*/

        if(infection == 0 ) {               /* the rating is generate based on the amount of people who are currently visiting the place */
            switch (visitPlace.toLowerCase()) {
                case "petronas twin tower":
                    System.out.println("Currently there are around " + crowd + " people visiting Petronas Twin Tower.");
                    Rating();
                    System.out.println("The probability of Covid spread is in rating of " + rating + "(The rating is based on the probability of Covid spread(with 5 being very high probability)).");
                    break;

                case "batu caves":
                    System.out.println("Currently there are around " + crowd + " people visiting Batu Caves.");
                    Rating();
                    System.out.println("The probability of Covid spread is in rating of " + rating + "(The rating is based on the probability of Covid spread(with 5 being very high probability)).");
                    break;

                case "mount kinabalu":
                    System.out.println("Currently there are around " + crowd + " people visiting Mount Kinabalu.");
                    Rating();
                    System.out.println("The probability of Covid spread is in rating of " + rating + "(The rating is based on the probability of Covid spread(with 5 being very high probability)).");
                    break;

                case "gunung mulu national park":
                    System.out.println("Currently there are around " + crowd + " people visiting Gunung Mulu National Park.");
                    Rating();
                    System.out.println("The probability of Covid spread is in rating of " + rating + "(The rating is based on the probability of Covid spread(with 5 being very high probability)).");
                    break;

                case "sipadan island":
                    System.out.println("Currently there are around " + crowd + " people visiting Sipadan Island.");
                    Rating();
                    System.out.println("The probability of Covid spread is in rating of " + rating + "(The rating is based on the probability of Covid spread(with 5 being very high probability)).");
                    break;

                default:
                    System.out.println("Currently there are around " + crowd + " people visiting " + visitPlace + ".");
                    Rating();
                    System.out.println("The probability of Covid spread is in rating of " + rating + "(The rating is based on the probability of Covid spread(with 5 being very high probability)).");
                    break;
            }
            System.out.println();
            allowDisallow();
        }
        else{  /* if there are infection happening at that place, user are not allowed to visit it */
            System.out.println("ALERT!! ALERT!! CURRENTLY THERE ARE " + infection + " PEOPLE WHO ARE INFECTED IN THAT PLACE!!");
            System.out.println("YOU ARE NOT ALLOWED TO VISIT THIS PLACE!!");
        }
    }
    public void allowDisallow() {
        byte rank; /*This is the rank of danger if  the user visit the place*/
        System.out.println("Your country rank is " + group + " and the rating of the place you want to visit is rate " + rating + ".");
        int probability = probabilityCovid(rating, group);
        if (probability <= 60) {  /* This section is to allowed the user to go visit the place*/
            if (probability <= 20) {
                rank = 1;
            } else if (probability <= 30) {
                rank = 2;
            } else {
                rank = 3;
            }
            System.out.println("Overall,If you go to this place, you will be in  rank " + rank + " danger because the probability of Covid spread or infection will be " + probability + "%.");
            System.out.println("Therefore you are allowed to visit this place.");
        }
        else {           /* This section is to disallowed the user to go visit the place*/
            if (probability <= 70) {
                rank = 4;
            } else {
                rank = 5;
            }
            System.out.println("Overall,If you go to this place, you will be in  rank " + rank + " danger because the probability of Covid spread or infection will be " + probability + "%.");
            System.out.println("Therefore you are not allowed to visit this place.");
            System.out.println("I repeat. You are NOT ALLOWED to visit this place.");
        }
    }

    public void Rating(){
        if ( crowd <= 500){
            rating = 1;
        }
        else
        if(crowd <= 1000){
            rating = 2;
        }
        else
        if(crowd <= 1500){
            rating = 3;
        }
        else
        if(crowd < 2000){
            rating = 4;
        }
        else {
            rating = 5;
        }
    }

    public int probabilityCovid(int a, int b){

        double total =((a+b)/12d)*95d; /* The calculation of probability of Covid Spread.
                                                    I put 95 instead of 100 as maximum because we cannot guarantee that the infection or spread will happen 100% */
        return (int)total;
    }

}



public class Main extends Visitor{   /* This is the main class where everything is printed out here. */

    public static void main(String[] args) {
        Main Info = new Main();
        System.out.println();
        Info.passengerInfo();
        String first_name = Info.getFirstName();
        String last_name = Info.getLastName();
        String Country = Info.getCountry();
        int departure_day = Info.departureDay;
        int departure_month = Info.departureMonth;
        int departure_year = Info.departureYear;
        String completeArrivalDate = Info.formattedArrivalDate;


        System.out.println();
        System.out.println("Name: " + first_name + ", " + last_name);
        System.out.println("Country: " + Country);
        System.out.println("Departure Date: " + departure_day + "/" + departure_month + "/" + departure_year);
        System.out.println("Arrival Date: " + completeArrivalDate);
        System.out.println();
        Info.Quarantine();
        System.out.println("Please enjoy your quarantine :)");

        Scanner option = new Scanner(System.in);
        byte choose;

        do {                  /* I did a infinite loop here. This is to let user to choose whether they want to enter another place or not. */
            System.out.println();
            Info.domesticTravel();
            System.out.println();
            System.out.println("Is there any other place you would like to visit. If yes, please enter 1. If not, please enter 0.");
            choose = option.nextByte();
        }
        while(choose !=0);

        System.out.println();
        System.out.println("Thank you for using us!! :)");
        System.out.println("Have a nice day !! :)");
    }
}
