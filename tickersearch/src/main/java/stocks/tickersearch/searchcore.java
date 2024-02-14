
package stocks.tickersearch;

import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Arrays; 
import javax.swing.JFileChooser;
        
public class searchcore 
{
    public searchcore()
    {
    }
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */





   JFileChooser fu = new JFileChooser();
   fu.setMultiSelectionEnabled(true);
      files.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      files.setFileHidingEnabled(false);
      if (files.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
         java.io.File f = files.getSelectedFile();
         System.err.println(f.getPath());
      
	  File file = new File(f.getPath()); 
         // File file = new File("/Users/Irving/Stocks/DiscordChatExporter.CLI/Fresh Mind Investing - STOCKS - penny-stocks [806268784863608853] (after 2021-02-01).txt"); 
	  String[] words=null;
          FileReader fr = new FileReader(file); 
	  BufferedReader br = new BufferedReader(fr); 
	  String s;
          String ticker;
          int counter=0;
          int index=0;
	  String input="major";
          boolean isempty = true;
          String[] output=new String[5000];// Input word to be searched
      int count=0;   //Intialize the word to zero
      while((s=br.readLine())!=null)   //Reading Content from the file
      {
         words=s.split(" ");  //Split the word using space
          for (String word : words) 
          {
           if(word.equals(word.toUpperCase()))  
           {
               char[] charArray = word.toCharArray();
               counter=0;
               if(charArray.length>2)
               {
                 if(charArray.length<7){
                      for(int i=0; i < charArray.length; i++)
                           {
                               if (!Character.isAlphabetic(charArray[i]))
                               {
                                   counter++;
                               }
                            }
                     if(counter==0)
                     {
                         
                         output[index]=word;
                         index=index+1;
                        
                     }
                 }
           
           } 
               }
               
//     
          }
      }
      for (int x=0; x<output.length; x++)
      {
          if(!output[x].equals(null)){
          System.out.println(output[x]);
          }
          
      }
//      int counticker=1;
//        for (int x = 0; x < output.length - 1; x++) 
//        {
//            for (int q = x + 1; q < output.length; q++) 
//            {
//                if (output[x].equals(output[q])) 
//                {
//                    counticker++;
//                    
//                }
//                if(!output[counticker].equals(output[counticker-1]))
//          {
//                
//            System.out.println(output[x] +" "+counticker);
//            counticker=1;
//        }
//            }
//            
//        }
         fr.close();
   

   




//    Integer posicion=0;
//    Integer[] age=new Integer[15];
//    String[] nombre=new String[15];
//    public void capturardatos(){
//        if (posicion<15){
//        nombre[posicion]=frontend.nombre.getText();
//        age[posicion]=Integer.parseInt(frontend.Edad.getText());
//        posicion++;
//        String pos=String.valueOf(posicion);
//        frontend.contador.setText(pos);
//        } else {
//            JOptionPane.showMessageDialog(null, "STOP!", "Error", JOptionPane.PLAIN_MESSAGE);
//        }
//    }
//    public void imprimirDatos()
//    {
//        for (int i=0;i<posicion;i++){
//        JOptionPane.showMessageDialog(null,"El nombre capturado es ="+nombre[i]+"\nLa edad es="+age[i], "Mensaje", JOptionPane.PLAIN_MESSAGE);
//    }
//    }
    
}
}