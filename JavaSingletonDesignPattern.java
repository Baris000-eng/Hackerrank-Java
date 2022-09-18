import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.lang.reflect.*;

//APPLYING SINGLETON DESIGN PATTERN

class Singleton{
   public String str;
   public static Singleton singleton;
   private Singleton(){
       
   }
    
   static Singleton getSingleInstance(){
       if(singleton == null){
           singleton = new Singleton();
       }
       return singleton;
   }
}

/*Complete the Singleton class in your editor which contains the following components:

A private Singleton non parameterized constructor.
A public String instance variable named .
Write a static method named getSingleInstance that returns the single instance of the Singleton class.*/