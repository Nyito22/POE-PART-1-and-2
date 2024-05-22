/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package POE;

import javax.swing.JOptionPane;

public class Account {
    //Part 2 variables are declared globally so that the methods can access these variables
    public static String Name = " ";
    
    public static String Discription = " ";
    
    public static String TASKdeveloper = " ";
    
    public static String number = " ";
    
  

    public String password, username, firstName, lastName;

    private void setPassword(String password) {
        this.password = password;
    }

    private String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public boolean isUsernameValid(String username) {
        if (username.length() >= 5 && username.contains("_")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "The username does not meet the requirements. Please ensure that the username has an underscore and contains at least 5 characters.");
            return false;
        }
    }

    public boolean isPasswordValid(String password) {
        boolean passwordDigit = false;
        boolean passwordSpecial = false;
        boolean passwordUpper = false;

        for (char singlePassword : password.toCharArray()) {
            if (Character.isUpperCase(singlePassword)) {
                passwordUpper = true;
            }
            if (Character.isDigit(singlePassword)) {
                passwordDigit = true;
            }
            if (!Character.isLetterOrDigit(singlePassword)) {
                passwordSpecial = true;
            }
        }

        if (password.length() < 8 || !passwordDigit || !passwordSpecial || !passwordUpper) {
            JOptionPane.showMessageDialog(null, "Password is not correctly formatted. Please ensure that the password is at least 8 characters long, contains at least one uppercase letter, one digit, and one special character.");
            return false;
        } else {
            return true;
        }
    }

    public String registerUser(String username, String password) {
        if (isUsernameValid(username) && isPasswordValid(password)) {
            setUsername(username);
            setPassword(password);
            return "User registered successfully";
        } else {
            return "Username or password does not meet the criteria";
        }
    }

    public boolean loginUser(String enteredUsername, String enteredPassword) {
        return enteredUsername.equals(username) && enteredPassword.equals(password);
    }

    public String returnLoginStatus(String enteredUsername, String enteredPassword) {
        if (loginUser(enteredUsername, enteredPassword)) {
            return "Login successful!";
        } else {
            return "Incorrect username or password";
        }
    }

    public static void main(String[] args) {
        
        Account account = new Account();
        String username = JOptionPane.showInputDialog(null, "Enter username:");
        String password = JOptionPane.showInputDialog(null, "Enter password:");

        String registrationStatus = account.registerUser(username, password);
        JOptionPane.showMessageDialog(null, registrationStatus);

        if (registrationStatus.equals("User registered successfully")) {
            String enteredUsername = JOptionPane.showInputDialog(null, "Enter username:");
            String enteredPassword = JOptionPane.showInputDialog(null, "Enter password:");

            String loginStatus = account.returnLoginStatus(enteredUsername, enteredPassword);
            JOptionPane.showMessageDialog(null, loginStatus);
            
            
            //PART TWO
         
            
            //used an accumulator to calculate the total hours
        int sum0fhours = 0;
        //called the external class
        task cons = new task();
        //gui
         JOptionPane.showMessageDialog(null,"<<<<<<<<<<<<<<<<<WELCOME TO EASY KANBAN>>>>>>>>>>>>>>>>>>>>>>");
         //use a while to loop the program unril the user chooses to quit
         while(true){
           int choice = Integer.parseInt(JOptionPane.showInputDialog("Choose an option \n 1: Add Tasks \n 2: Show Report \n 3: Quit"));
          
         
         
         
         switch(choice){
           //used a switch to allow the user to choose fro a option
           case 1:
              int task = Integer.parseInt(JOptionPane.showInputDialog("How many tasks do you want to enter ?"));
              // used a foor loop to count the number of tasks the user choose
              for(int gui =0 ;  gui < task ;  gui++){
                  
                 Name = JOptionPane.showInputDialog("Enter task name");
                 
                 // used a do while to reprompt the user to enter the correct dicription length
                    do{
                     Discription = JOptionPane.showInputDialog("Enter task description");
                     
                      }while(! CHECKTASKDESCRIPTION());
                    
                    
                    
                TASKdeveloper = JOptionPane.showInputDialog("Enter developer details(Firstname and Lastname");
                
                int time = Integer.parseInt(JOptionPane.showInputDialog("Enter the duration (in hours)"));
                
                  number = CEATETASKID( gui);
                 
                  int option = Integer.parseInt(JOptionPane.showInputDialog("Choose status \n 1: To do \n 2: Done \n 3: Doing"));
          
                  String choose = "";
                  
                  // used a switch case to ask a user to choose the status of the task
                  
                    switch(option){
                        
                       case 1:
                           choose = "To do";
                           break;
                       case 2 :
                           choose = "Done";
                           break;
                       case 3 :
                           choose = "Doing";
                           break;
                        
                        
                    }
                         JOptionPane.showMessageDialog(null, choose);
                         
                         
                        cons.PRINTtaskDETAILS(choose, TASKdeveloper,  gui, Name, Discription, number, time);
                         
                        sum0fhours += RETURNhours(time); 
              }
              
               JOptionPane.showMessageDialog(null,"Total hours are " + " " + sum0fhours + "hrs");
               
               break;
               
           case 2:
               JOptionPane.showMessageDialog(null, "Coming soon");
               break;
               
           case 3:
                JOptionPane.showMessageDialog(null, "Goodbye");
                
               System.exit(0);
             
               
       }
         

    }
         
        }
    }
    //PART2 METHODS
    public static boolean CHECKTASKDESCRIPTION(){
      boolean validate = false;
     
      if(Discription.length() < 50 ){
          
         JOptionPane.showMessageDialog(null, "task description is correctly formatted");
          
          validate = true;
      }
      else{
           JOptionPane.showMessageDialog(null, "Description is not correctly formatted please ensure that is has chracters that are less than 50");
           
           validate = false;
      }
      
        return validate;
    }
     public static String CEATETASKID(int Tasknumber){
         /*used a sub string to manipulate Strings,to display the task id that has the first 2 letters of task name takes 
          the task number in the middle and the last 3 values of the developer details
         */
         String identification = Name.substring(0, 2) + ":" + Tasknumber + ":" + TASKdeveloper.substring(TASKdeveloper.length()-3);
         
         JOptionPane.showMessageDialog(null,"Task ID \n"+   identification.toUpperCase());
         
       return  identification.toUpperCase();  
     }
     
     public static int RETURNhours(int duration){
         
         
         int totalhrs = duration;
         
         return totalhrs;
         //PART 2 ENDS HERE
         
     }
     
}
