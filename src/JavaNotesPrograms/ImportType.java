package JavaNotesPrograms;
import java.util.ArrayList; //explicit class import
import java.util.*;// implicit class import

import java.sql.*; // ambiguity between util and sql in 'Date'

import java.awt.*; // ambiguity between util and awt in 'List'
import java.util.List;
import java.util.Date;

/*import java.*;  Package 'java' is declared in module 'java.base', which does not export it to the unnamed module
1 when ever we are importing a java pakage all classes and interfaces present
 in that  pakage by default abailable by not sub pakage classes.
 if we want to use sub pakage classes then compalsory we should write
 import statement until sub pakage level

 */
import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern.*;


public class ImportType {
    public static void main(String  ag[]){
       /*
       1. Reference to 'Date' is ambiguous, both 'java.util.Date' and 'java.sql.Date' match
        Date d=new Date();
        */
        Date d=new Date(); // sai hai  explicit class import and implicit class import



    }
}
