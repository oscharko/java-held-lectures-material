package com.tutego.insel.hamcrest;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;

public class HamcrestTest {
  
  @Test
  public void testHamcrestMatcher() {
    assertThat( new Object(), is( notNullValue() ) );
    assertThat( "", is( equalTo( "" ) ) );
    assertThat( 1L, is( sameInstance( Long.valueOf( 1 ) ) ) );
    assertThat( 1000L, is( not( sameInstance( Long.valueOf( 1000 ) ) ) ) );
  }

  @Test
  public void testHamcrestCollection() {
    List<String> list = new ArrayList<>();
    Collections.addAll( list, "a", "b", "c", "d", "e" );

    list.removeAll( Arrays.asList( "b", "d" ) );

    assertThat( list, hasSize( 3 ) );
    assertThat( list, both( hasItems( "a", "c", "e" ) ).and( not( hasItems( "b", "d" ) ) ) );

    assertThat( list, both( hasItems( "_", "c", "e" ) ).and( not( hasItems( "b", "d" ) ) ) );
  }
}
