package rs.math.oop.g13.p09.listaGenericki;

public class PovezanaLista<T>
{
	private class ElemenatListe
	{
		private ElemenatListe next; // Refers to next item in the list
		private T item;

		// Constructor
		public ElemenatListe( T item )
		{
			this.item = item; // Store the item
			next = null; // Set next as end point
		}
		
		// Return class ime & object
		public String toString()
		{
			return "Elemenat liste: " + item;
		}
	}

	private ElemenatListe start = null; // First ListIem in the list
	private ElemenatListe end = null; // Last ListIem in the list
	private ElemenatListe current = null; // The current item for iterating
	
	
	// Default constructor - creates an empty list
	public PovezanaLista()
	{
	}
	
	// Constructor to create a list containing one object
	public PovezanaLista( T item )
	{
		if (item != null)
			current = end = start = new ElemenatListe( item ); // item is the start and end
	}

	// Add an item object to the list
	public void addItem( T item )
	{
		ElemenatListe newEnd = new ElemenatListe( item ); // Create a new ListItem
		if (start == null) // Is the list empty?
			start = end = newEnd; // Yes, so new element is start and end
		else
		{ // No, so append new element
			end.next = newEnd; // Set next variable for old end
			end = newEnd; // Store new item as end
		}
	}

	// Construct a linked list from an array of objects
	public PovezanaLista( T[] items )
	{
		if (items != null)
		{
			// Add the items to the list
			for (int i = 0; i < items.length; i++)
				addItem( items[i] );
			current = start;
		}
	}

	// Get the first object in the list
	public T getFirst()
	{
		current = start;
		return current == null ? null : current.item;
	}
	
	// Get the next object in the list
	public T getNext()
	{
		if (current != null)
			current = current.next; // Get the reference to the next item
		return current == null ? null : current.item;
	}
	
	@Override
	public String toString()
	{
		StringBuilder ret = new StringBuilder("[");
		T t = getFirst();
		while (t != null)
		{
			ret.append( t );
			ret.append( " " );
			t = getNext();
		}
		ret.append("]");
		return ret.toString();
	}
}
