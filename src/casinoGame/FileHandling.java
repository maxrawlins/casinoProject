/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casinoGame;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class FileHandling {
 public static String folderDirectory=System.getProperty("user.dir")+"\\Users.txt";
        
    public static void writeFile(ArrayList<Authentication> UserList){
        
        try {
            FileWriter writeToFile = new FileWriter(folderDirectory,false);
            PrintWriter printToFile = new PrintWriter(writeToFile);
            for(int i = 0 ;i<UserList.size();i++){
                printToFile.println(UserList.get(i).toString());
            }
            printToFile.close();
            writeToFile.close();
        } catch (Exception e) {
            System.out.println("Error:    "+e);
        }
    }
    
    public static ArrayList<Authentication> readFile(){
        ArrayList<Authentication> UserList = new ArrayList<>();
        String lineFromFile;
        try {
            BufferedReader read = new BufferedReader(new FileReader(folderDirectory));
            while ((lineFromFile = read.readLine())!=null){
                String[]UserDetails = lineFromFile.split(", ");
                System.out.println(UserDetails.length);
                
                Authentication User = new Authentication(UserDetails[0],UserDetails[1],Integer.parseInt(UserDetails[2]));
                UserList.add(User);
                
            }
            read.close();
        } catch (Exception e) {
            System.out.println("error"+e);
        }
        return UserList;
        
    }
    
 }
