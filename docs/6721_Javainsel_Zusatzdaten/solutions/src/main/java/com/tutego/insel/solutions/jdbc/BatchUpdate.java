package com.tutego.insel.solutions.jdbc;

import java.sql.*;

public class BatchUpdate {
  public static void main( String[] args ) throws SQLException {
    DatabaseUtility db = new DatabaseUtility();
    try ( Connection con = db.getConnection() ) {

      con.setAutoCommit( false );

      // Batch starten

      try ( Statement stmt = db.getStatement() ) {

        stmt.addBatch( "INSERT INTO geodb_adm1 VALUES ('DE','HE','06','Hessen')" );
        stmt.addBatch( "INSERT INTO geodb_adm1 VALUES ('DE','HH','02','Hamburg');" );
        stmt.addBatch( "INSERT INTO geodb_adm1 VALUES ('DE','MV','13','Mecklenburg-Vorpommern');" );

        con.commit();

        con.setAutoCommit( true );

        // Anzahl veränderter Zeilen auslesen

        int[] updateCounts = stmt.executeBatch();

        for ( int i = 0; i < updateCounts.length; i++ )
          System.out.print( updateCounts[ i ] + " " );

        System.out.println();
      }
    }

    // Test
    Select.main();
  }
}