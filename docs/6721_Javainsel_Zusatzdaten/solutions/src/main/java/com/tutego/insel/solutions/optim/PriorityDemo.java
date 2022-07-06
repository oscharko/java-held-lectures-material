//package com.tutego.insel.solutions.optim;
//import java.util.Random;
//import java.util.concurrent.PriorityBlockingQueue;
//
//public class PriorityDemo
//{
//	public static void main(String[] args)
//	{
//		PriorityBlockingQueue q = new PriorityBlockingQueue();
//
//		Erzeuger e = new Erzeuger( q );
//		Bankangestellter b1 = new Bankangestellter( q );
////		Bankangestellter b2 = new Bankangestellter( q );
//	}
//}
//
//class Erzeuger extends Thread
//{
//	private PriorityBlockingQueue q;
//	
//	Erzeuger( PriorityBlockingQueue q )
//	{
//		this.q = q;
//		
//		start();
//	}
//
//	public void run()
//	{
//		Random r = new Random(); 
//
//		for ( int i = 0; true; )
//		{
//			try
//			{
//				Thread.sleep( 100 );
//
//				Kunde k = new Kunde( "" + i++, r.nextInt(1000000) );
//
//				q.add( k );
//			}
//			catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}
//
//class Bankangestellter extends Thread
//{
//	private PriorityBlockingQueue q;
//	
//	Bankangestellter( PriorityBlockingQueue q )
//	{
//		this.q = q;
//		
//		start();
//	}
//
//	public void run()
//	{
//		while ( true )
//		{
//			try
//			{
//				Object object = q.take();
//				System.out.println( object );
//
//				Thread.sleep( 300 );
//				
//			} catch ( InterruptedException e ) {
//				e.printStackTrace();
//			}
//		}		
//	}
//}