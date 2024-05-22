/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package POE;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
//external class for part 2
public class task {
   // used a method thas has parameters to display the task details of each tasks peformed 
  public String PRINTtaskDETAILS(String TaskStatus, String developer, int tasknum, String name , String descript, String id , int duration){
          
         String  Taskdetails = "Taskstatus: " + TaskStatus + "\n"+ "Developer Details: " + developer + "\n" 
                 + "Task number: " + tasknum + "\n" + "Taskname: "+ name + "\n" + "Task description: " + descript 
                 + "\n"+ "Task ID: " + id + "\n" + "Task Duration: " + duration + "\n *******************************************************************\n";
         
               
               JOptionPane.showMessageDialog(null,Taskdetails);
          
          
          return " ";
}

    
}
