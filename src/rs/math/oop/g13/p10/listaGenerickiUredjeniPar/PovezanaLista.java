//package rs.math.oop.g13.p10.listaGenerickiUredjeniPar;
//
//public class PovezanaLista<T>
//{
//	private UredjeniPar<T, UredjeniPar<T,T>> start = null;
//	private UredjeniPar<T, UredjeniPar<T,T>> end = null;
//
//	private UredjeniPar<T, UredjeniPar<T,T>> current = null;
//
//	// Default constructor - creates an empty list
//	public PovezanaLista()
//	{
//	}
//
//	// Constructor to create a list containing one object
//	public PovezanaLista(T item )
//	{
//		start = new UredjeniPar<T, UredjeniPar<T,T>>(item, null);
//		end = start;
//	}
//
//	// Add an item object to the list
//	public void addItem( T item )
//	{
//		UredjeniPar<T, UredjeniPar<T,T>> newEnd = new UredjeniPar<>( item, null );
//		if (start == null) // Is the list empty?
//			start = end = newEnd; // Yes, so new element is start and end
//		else
//		{ // No, so append new element
//
//			end.postaviDrugaKomponenta(
//				 new UredjeniPar<>(newEnd.uzmiPrvaKomponenta(), null)); // Set next variable for old end
//			end = end.uzmiDrugaKomponenta().uzmiDrugaKomponenta(); // Store new item as end
//		}
//	}
//
//	// Construct a linked list from an array of objects
//	public PovezanaLista(T[] items )
//	{
//		if (items != null)
//		{
//			// Add the items to the list
//			for (int i = 0; i < items.length; i++)
//				addItem( items[i] );
//			current = start;
//		}
//	}
//
//
//	// Get the first object in the list
//	public T getFirst()
//	{
//		current = start;
//		return current == null ? null : current.item;
//	}
//
//	// Get the next object in the list
//	public T getNext()
//	{
//		if (current != null)
//			current = current.next; // Get the reference to the next item
//		return current == null ? null : current.item;
//	}
//
//	@Override
//	public String toString()
//	{
//		StringBuilder ret = new StringBuilder("[");
//		T t = getFirst();
//		while (t != null)
//		{
//			ret.append( t );
//			ret.append( " " );
//			t = getNext();
//		}
//		ret.append("]");
//		return ret.toString();
//	}
//}
