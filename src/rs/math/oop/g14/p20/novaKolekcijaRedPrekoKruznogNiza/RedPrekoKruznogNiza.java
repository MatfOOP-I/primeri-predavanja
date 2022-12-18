package rs.math.oop.g14.p20.novaKolekcijaRedPrekoKruznogNiza;

import java.util.*;

/**
 * A first-in, first-out bounded collection.
 */
public class RedPrekoKruznogNiza<E> extends AbstractQueue<E>
{
	private E[] elements;
	private int head;
	private int tail;
	private int count;

	private class QueueIterator implements Iterator<E>
	{
		private int offset;

		public QueueIterator()
		{
			// Podrazumevani konstruktor kreira prazan iterator
		}
		
		public E next()
		{
			if (!hasNext())
				throw new NoSuchElementException();
			E r = (E) elements[(head + offset) % elements.length];
			offset++;
			return r;
		}
		
		public boolean hasNext()
		{
			return offset < count;
		}
		
		public void remove()
		{
			throw new UnsupportedOperationException();
		}
		
	}
	
	@SuppressWarnings( "unchecked" )
	public RedPrekoKruznogNiza( int capacity )
	{
		elements = (E[]) new Object[capacity];
		count = 0;
		head = 0;
		tail = 0;
	}
	
	public boolean offer( E newElement )
	{
		assert newElement != null;
		if (count < elements.length)
		{
			elements[tail] = newElement;
			tail = (tail + 1) % elements.length;
			count++;
			return true;
		}
		else
			return false;
	}
	
	public E poll()
	{
		if (count == 0)
			return null;
		E r = peek();
		head = (head + 1) % elements.length;
		count--;
		return r;
	}
	
	public E peek()
	{
		if (count == 0)
			return null;
		return (E) elements[head];
	}
	
	public int size()
	{
		return count;
	}
	
	public Iterator<E> iterator()
	{
		return new QueueIterator();
	}
	
}

