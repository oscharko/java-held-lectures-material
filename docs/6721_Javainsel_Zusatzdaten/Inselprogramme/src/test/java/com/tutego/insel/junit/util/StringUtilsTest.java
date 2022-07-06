package com.tutego.insel.junit.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {
  @Test
  public void testReverse() {
    assertEquals( "", StringUtils.reverse( "" ) );
    assertEquals( "cba", StringUtils.reverse( "abc" ) );

    try {
      StringUtils.reverse( null );

      fail( "reverse(null) should throw IllegalArgumentException" );
    }
    catch ( IllegalArgumentException e ) {
    }
  }

  @Test
  public void testReverseException() {
    assertThrows( IllegalArgumentException.class, () -> {
      StringUtils.reverse( null );
    } );
  }
}
