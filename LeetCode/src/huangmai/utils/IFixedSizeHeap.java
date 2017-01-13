package huangmai.utils;

public interface IFixedSizeHeap<E> {
	int size();	//get real data size
	int fixedSize();	//get fixed size setting
	boolean isFull();	//whether heap have number of elements at least as large
	boolean offer(E newElement);
	//boolean offer(Collection<? extends E> newElements);
	E peek();
	E poll();
	void clear();
	//E[] toArray();
	//List<E> toList();
}
