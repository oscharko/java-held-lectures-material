package com.tutego.insel.solutions.lang.annotations;

@Remote
@Stateless( name = "Rechner", transactionManagement = TransactionManagementType.BEAN )
public class CalculatorBean {

  public int add( int x, int y ) {
    return x + y;
  }

  public int subtract( int x, int y ) {
    return x - y;
  }
}
