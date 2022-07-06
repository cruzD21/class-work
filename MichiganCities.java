import java.util.Scanner;

public class MichiganCities
{
   public static void main(String args[]) throws Exception
   {
      
      String inCity;               
      // Initialized array of cities in Michigan.
      String citiesInMichigan[] = {"Acme", "Albion", "Detroit", "Watervliet", "Coloma", "Saginaw", "Richland", "Glenn", "Midland", "Brooklyn"}; 
      Boolean foundIt = false;  // Flag variable.
      int x;           

    
     Scanner input = new Scanner(System.in);
     System.out.println("Enter the name of the city: ");
     inCity = input.nextLine();
         
       
      for (x = 0; x < citiesInMichigan.length; x++){
          if (citiesInMichigan[x].equals(inCity) ){
              foundIt = true;
          }
      }

      if (foundIt == true) {
         System.out.println("City found");
     }else{
          System.out.println( "Not a city in Michigan");
     }
      
      System.exit(0);

      

   } 
} 
