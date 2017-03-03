/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonecontacts;
import java.util.*;
/**
 *
 * @author Eduardo
 */
public class MobilePhone {
    private ArrayList <Contact> contacts;
    
    public MobilePhone(){
        contacts = new ArrayList<Contact>();
    }
    
    public boolean addContact(Contact contact){
        if (findContact(contact.getName()) == -1){
            contacts.add(contact);  
            return true;
        }
        return false;
    }
    
    public boolean addContact(String name, int number){
        return addContact(new Contact(name,number)); //Se manda llamar la funcion anterior
        // creando el contacto con los datos recibidos; evitamos retrabajar
    }
    
    /*public Contact findContact(String name){
        for(Contact tempContact: contacts){
            if (tempContact.getName().equals(name)){
                return tempContact;
            }
        }
        return null;        
    }*/
    
    public int findContact(String name){ //obtenemos solamente el indice
        for(int i=0; i<contacts.size();i++){
            if (contacts.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }
    
    public boolean removeContact(Contact contact){
        int position=findContact(contact.getName());
        if (position == -1){
            return false;
        }
        contacts.remove(position);
        return true;
    }
    
    public boolean removeContact (String name, int number){
        return contacts.remove(new Contact(name, number));
    }
    
    public boolean removeContact(String name){
        return removeContact(new Contact(name,123)); //Le ponemos un numero falso 
    } //porque nuestra funcion de busqueda solamente busca por nombre, no le importa el numero
    
    public boolean updateContact(Contact contact){
        int pos= findContact(contact.getName());
        if (pos == -1){
            return false;
        }
        contacts.get(pos).setName(contact.getName());
        contacts.get(pos).setNumber(contact.getNumber());
        return true;
    }
    
    public boolean updateContact(String name, int number){
        return updateContact(new Contact(name, number));
    }
    
    public void listContacts(){
        for(Contact tempContact: contacts){
            System.out.println(tempContact.toString());
        }
    }
    
    public String queryContact(String name){
        int position= findContact(name);
        
        if (position == -1){
            return "Contact not found";
        }else{
            return contacts.get(position).toString();
        }
    }
}
