package com.tutego.insel.solutions.ui.swing;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

import javax.swing.AbstractListModel;

@SuppressWarnings("all")
public class SortedListModel extends AbstractListModel
{
  // Define a SortedSet
  SortedSet model;

  public SortedListModel()
  {
    // Create a TreeSet
    // Store it in SortedSet variable
    model = new TreeSet();
  }

  // ListModel methods
  @Override
  public int getSize()
  {
    // Return the model size
    return model.size();
  }

  @Override
  public Object getElementAt( int index )
  {
    // Return the appropriate element
    return model.toArray()[index];
  }

  // Other methods
  public void add( Object element )
  {
    if ( model.add( element ) )
      fireContentsChanged( this, 0, getSize() );
  }

  public void addAll( Object[] elements )
  {
    Collection c = Arrays.asList( elements );
    model.addAll( c );
    fireContentsChanged( this, 0, getSize() );
  }

  public void clear()
  {
    model.clear();
    fireContentsChanged( this, 0, getSize() );
  }

  public boolean contains( Object element )
  {
    return model.contains( element );
  }

  public Object firstElement()
  {
    // Return the appropriate element
    return model.first();
  }

  public Iterator iterator()
  {
    return model.iterator();
  }

  public Object lastElement()
  {
    // Return the appropriate element
    return model.last();
  }

  public boolean removeElement( Object element )
  {
    boolean removed = model.remove( element );
    if ( removed )
      fireContentsChanged( this, 0, getSize() );
    return removed;
  }
}