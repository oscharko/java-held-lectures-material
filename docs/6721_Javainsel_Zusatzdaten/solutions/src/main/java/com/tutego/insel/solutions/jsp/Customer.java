package com.tutego.insel.solutions.jsp;

import java.io.Serializable;
import java.util.Date;

public class Customer implements Serializable
{
  private static final long serialVersionUID = 6594199660416149733L;
  
  private String name;
  private String adress;
  private Date birthday;

  /**
   * @param string
   * @param string2
   */
  public Customer( String name, String adress, Date date )
  {
    this.name = name;
    this.adress = adress;
    this.birthday = date;
  }

  /**
   * @return Returns the adress.
   */
  public String getAdress()
  {
    return adress;
  }

  /**
   * @param adress The adress to set.
   */
  public void setAdress( String adress )
  {
    this.adress = adress;
  }

  /**
   * @return Returns the name.
   */
  public String getName()
  {
    return name;
  }

  /**
   * @param name The name to set.
   */
  public void setName( String name )
  {
    this.name = name;
  }

  /**
   * @return Returns the birthday.
   */
  public Date getBirthday()
  {
    return birthday;
  }

  /**
   * @param birthday The birthday to set.
   */
  public void setBirthday( Date birthday )
  {
    this.birthday = birthday;
  }

}
