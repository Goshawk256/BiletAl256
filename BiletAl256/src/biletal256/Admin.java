/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package biletal256;

import java.util.ArrayList;
import java.util.Scanner;


public class Admin extends User {
public String adminId="1";
public String Password="1";


 
 
    @Override
    public String kullaniciAdi() {
      
       return adminId;
    }

    @Override
    public String Sifre() {
       
        return Password;
    }



public ArrayList<String> addCompany(String firmName,ArrayList<String>firmArray)
{
    
firmArray.add(firmName);
    
    return firmArray;
}
public void removeCompany()
{
    
}
    public void showCompany()
    {
        
    }
    public void editPrice()
    {
        
    }
}
