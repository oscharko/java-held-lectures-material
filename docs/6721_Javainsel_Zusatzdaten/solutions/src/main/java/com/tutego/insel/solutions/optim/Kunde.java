//package com.tutego.insel.solutions.optim;
//
//import java.util.Date;
//
//import org.apache.commons.lang.builder.ToStringBuilder;
//
//public class Kunde implements Comparable
//{
//	private Date datum;
//	
//	private String name;
//	
//	private int kontostand;
//	
//	/**
//	 * @param name
//	 * @param kontostand
//	 */
//	public Kunde( String name, int kontostand )
//	{
//		this.name = name;
//		this.kontostand = kontostand;
//		this.datum = new Date();
//	}
//	
//	/**
//	 * @return Returns the kontostand.
//	 */
//	public int getKontostand() {
//		return kontostand;
//	}
//	/**
//	 * @return Returns the name.
//	 */
//	public String getName() {
//		return name;
//	}
//
//	/* (non-Javadoc)
//	 * @see java.lang.Comparable#compareTo(java.lang.Object)
//	 */
//	public int compareTo( Object o )
//	{
//		Kunde that = (Kunde) o;
//
//		return that.kontostand - this.kontostand;
//	}
//	
//	public String toString()
//	{
//		return ToStringBuilder.reflectionToString(this);
//	}
//	
//}
