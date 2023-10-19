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
      
    ArrayList <User> userInfo = new ArrayList<>(); //Array to stock the information readed from the file
    ArrayList <String> members = new ArrayList<>();//stocks the name of the members to create the teams
       
    String[] teamNames = {"Barcelona", "Real Madri", "Machester", "Liverpool", "inter de milan", "Paris Saint German","AC milan","Benfica" ,"Arsenal", "Porto", "Celtic", "Borussia", "Atletico Madrid", "Napoli", "Copenhagen", "Sevilla", "Marseille", "Red Star belgrade", "Feyenoord", "RB Leipzig"};
    while (( line = br.readLine())!=null){
        String[] playerData = line.split(",");// splits each line into a array  separated by comas 
         System.out.println(playerData[0] + " " +  playerData[1]);
         User use = new User (Integer.parseInt(playerData[0]), playerData[1], playerData[2], playerData[3]);
         userInfo.add(use);
         members.add(playerData[1]);// adds the name of each members that is in the 2 index of Array with the line splited
         
         // method that shuffle the array list making in randomazed each time
    }
        
        Collections.shuffle(members);
        
        int teams =20;
        int teamSize=5;
        
        int tName= 0;
        for(int i =0;i< members.size(); i+=teamSize){
            System.out.println("team :" + i/teamSize + " " + teamNames[i/teamSize]);
            System.out.println();
            tName= i/teamSize;
            System.out.println(tName);
           
            for(int j =0; j<teamSize;j++){
            
                
                System.out.println(members.get(i + j));}
               
        
        }
        
        
        
        
        
//        System.out.println(userInfo.get(1).firstName );
//        System.out.println(userInfo.get(1).ID );
//        System.out.println(userInfo.get(4).email); 
//        System.out.println(members.get(4));
//        System.out.println(members.get(5));
//        System.out.println(members.get(6));
}
}
