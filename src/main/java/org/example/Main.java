package org.example;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws SQLException {


        //mi connetto al db
        Database db = new Database();

        //creo una tabella
        String[] fields = {"first_name","last_name"};
        db.createTable("students", fields);

        //inserisco 4 studenti  #FATTO
        /*
        db.insertStudent("chris","puglisi");
        db.insertStudent("mario","rossi");
        db.insertStudent("franz","shultz");
        db.insertStudent("frizz","waizz");
        //------------------------------------------
         COMMENTATO SE NO AL PROSSIMO RUN AGGIUNGE ALTRI 4, ed esegue ogni volta le quey */
        //------------------------------------------

        //aggiungo una colonna country
        //db.addColumnToTable("students","country","VARCHAR(30)");


        //aggiorno gli studenti con la nazionalità
        /*
        db.updateStudentCountry(1,"italy");
        db.updateStudentCountry(2,"italy");
        db.updateStudentCountry(3,"germany");
        db.updateStudentCountry(4,"germany");
         */

        //creo una vista per gli studenti italiani e tedeschi
        /*
        db.createFilterByCountryOnStudents("italy");
        db.createFilterByCountryOnStudents("germany");
         */


        List<Student> italianStudents = db.createStudentList("italy");
        List<Student> germanStudents = db.createStudentList("germany");

        System.out.println("Lista studenti italiani: " + italianStudents);
        System.out.println("Lista studenti tedeschi: " + germanStudents);








    }
}