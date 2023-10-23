/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework4.pkg2year;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author victor pc
 */
public class Homework42year {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
         BufferedReader br= new BufferedReader (new FileReader ("MOCK_DATA.csv")); // read from the file Fantasy futebool
       String line; 
    
    ArrayList <User> playerInfo = new ArrayList<>(); //Arraylist to stock the information readed from the file as proterties of the object users
    ArrayList <String> members = new ArrayList<>();//stocks the name of the members to create the teams
    ArrayList<Teams> teams2 = new ArrayList<>();
    String[] teamNames = {"Barcelona", "Real Madri", "Machester", "Liverpool", "inter de milan", "Paris Saint German","AC milan","Benfica" ,"Arsenal", "Porto", "Celtic", "Borussia", "Atletico Madrid", "Napoli", "Copenhagen", "Sevilla", "Marseille", "Red Star belgrade", "Feyenoord", "RB Leipzig"};
    
      // Creating players to stock the data of each line of the file 
    while (( line = br.readLine())!=null){ //loop throw the file reading each line while has lines to read
        String[] userData = line.split(",");// splits each line into a array  separated by comas 
         System.out.println(userData[0] + " " +  userData[1]);
         User player = new User (Integer.parseInt(userData[0]), userData[1], userData[2], userData[3]); // creates a object player which the properties stock the data readed from the file.
         playerInfo.add(player);
         members.add(userData[1]);// adds the name of each members that is in the 2 index of Array with the line splited    
    }
       
    
    
        Collections.shuffle(members);// method that shuffle the array list making in randomazed each time
        
       
        
  // Creating tha Teams 
        int teamSize=5;
       
        for(int i =0;i< members.size(); i+=teamSize){ // loops start from 0 untill fisish the list of members each time it run adds 5 to i
            System.out.println("team :" + i/teamSize + " " + teamNames[i/teamSize]);// team name find by dividing the actual value of I per team size: 0/5 = team 0, next time the loop run  5/5 = 1 
            
           
            
            teams2.add(new Teams(teamNames[i/teamSize], members.get(i), members.get(i+1), members.get(i+2), members.get(i+3), members.get(i+4)));
            
           // each time that the first loop run it must to run the second per 5 time, so that can run again
            for(int j =0; j<teamSize;j++){ //another loop to run 5 time adding 1 to the variable j 
            
                // adding the actual value of  i to j with find 0+1, 0+2, 0+3, 0+4, 0+5, at the second group will be 5+1,5+2 and so one ,the result will be the index of members, and will display a player
                System.out.println(members.get(i + j));}
             
               
        
        }
        //testing funcionality
        System.out.println(teams2.get(2).TeamName + " " + teams2.get(2).player1 + " " + teams2.get(2).player2 + " " + teams2.get(2).player3 + " " + teams2.get(2).player4 + " " + teams2.get(2).player5);
        
        System.out.println(teams2.get(3).TeamName + " " + teams2.get(3).player1 + " " + teams2.get(3).player2 + " " + teams2.get(3).player3 + " " + teams2.get(3).player4 + " " + teams2.get(3).player5);
        
        System.out.println(teams2.get(19).TeamName + " " + teams2.get(19).player1 + " " + teams2.get(2).player2 + " " + teams2.get(2).player3 + " " + teams2.get(2).player4 + " " + teams2.get(2).player5);
        
        
        
        System.out.println(playerInfo.get(1).email); // getting information from array list playerinfo . which contain objects player  which the properties are the data readed from file
//        
}
}
