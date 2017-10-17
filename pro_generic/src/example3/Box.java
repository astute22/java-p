package example3;

public class Box<T> {
	private int size;
	private Object[] items = new Object[size];
	private int position;
	public Box() {
		// TODO Auto-generated constructor stub
		items = new Object[this.size];
	}
	public Box(int size) {
		super();
		items = new Object[size];;
	}
	public void add(T item){
		if(position == size){
			Object[] array = new Object[size + 10];
			System.arraycopy(items, 0, array, 0, items.length);
			items = array;
			size = items.length;
		}
		items[position++] = item;
	}
	public T get(int index){
		if(index <0 || index > size -1){
			throw new IndexOutOfBoundsException("유효한 인덱스 범위가 아닙니다");
		}
		return (T) items[index];
	}
	public int size(){
		return size;
	}

}
