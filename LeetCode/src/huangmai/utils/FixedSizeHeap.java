package huangmai.utils;

import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * This implements a fixed size heap.
 * This implementation is most likely used in case we need all k smallest element.
 * Note: In this implementation, by default it keeps smallest k elements.
 * This means in implementation, we actually wrap comparator with it's opposite.
 * */
public class FixedSizeHeap<E> implements IFixedSizeHeap<E>{
	private PriorityQueue<E> data;
	private int size;	
	
	//the real constructor
	private void Create(int size, Comparator<? super E> comparator){
		this.size = size;
		if(comparator == null){	
			data = new PriorityQueue<E>(size, new Comparator<E>(){
				@SuppressWarnings({ "unchecked", "rawtypes" })
				@Override
				public int compare(E o1, E o2) {
					Comparable k1 = (Comparable) o1;
					Comparable k2 = (Comparable) o2;
					return k2.compareTo(k1);
				}				
			});
		}else{
			data = new PriorityQueue<E>(size, new Comparator<E>(){
				@Override
				public int compare(E o1, E o2) {
					// TODO Auto-generated method stub
					return comparator.compare(o2, o1);
				}
			});
		}
	}
	
	//create a fixed size heap 
	public FixedSizeHeap(int size){
		Create(size, null);
	}	
	//create a fixed size heap with customized comparator
	public FixedSizeHeap(int size, Comparator<? super E> comparator){
		Create(size, comparator);
	}

	@Override
	public int size() {
		return data.size();
	}

	@Override
	public int fixedSize() {
		return size;
	}

	@Override
	public boolean isFull() {
		return data.size() == size;
	}

	@Override
	public boolean offer(E newElement) {
		if(isFull()){			
			if(data.comparator().compare(data.peek(), newElement) < 0){
				data.poll();
				return data.offer(newElement);				
			}else{
				return true;
			}
		}else{
			return data.offer(newElement);
		}
	}

	@Override
	public E peek() {
		return data.peek();
	}

	@Override
	public E poll() {
		return data.poll();
	}

	@Override
	public void clear() {
		data.clear();
	}
}
