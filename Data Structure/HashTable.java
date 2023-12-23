
public class HashTable {
	private HashNode[] buckets;
	private int numOfBuckets;
	private int size;

	public HashTable(int capacity) {
		this.numOfBuckets = capacity;
		this.buckets = new HashNode[numOfBuckets];
		this.size = 0;
	}

	private class HashNode {
		private Integer key;
		private String value;
		private HashNode next;

		public HashNode(Integer key, String value) {
			this.key = key;
			this.value = value;
		}
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size == 0;
	}

	public int getBucketIndex(int key) {
		return key % buckets.length;
	}

	public void put(Integer key, String value) {
		if (key == null || value == null) {
			throw new IllegalArgumentException("Key or Value is null!!");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		while (head != null) {
			if (head.key.equals(key)) {
				head.value = value;
				return;
			}
			head = head.next;
		}
		size++;
		head = buckets[bucketIndex];
		HashNode node = new HashNode(key, value);
		node.next = head;
		buckets[bucketIndex] = node;
	}

	public void get(Integer key) {
		if (key == null) {
			throw new IllegalArgumentException("Key is null");
		}
		int getValue = getBucketIndex(key);
		HashNode head = buckets[getValue];
		if (head == null) {
			System.out.println("Key is not found!");
			return;
		}
		while (head != null) {
			if (head.key.equals(key)) {
				System.out.println(head.value + " is found");
				return;
			}
			head = head.next;
		}
	}

	public void remove(Integer key) {
		if (key == null) {
			throw new IllegalArgumentException("Key is null!");
		}
		int bucketIndex = getBucketIndex(key);
		HashNode head = buckets[bucketIndex];
		HashNode previous = null;
		while (head != null) {

			if (head.key.equals(key)) {
				break;
			}
			previous = head;
			head = head.next;
		}
		if (head == null) {
			System.out.println("Key is not found");
			return;
		}
		size--;
		if (previous != null) {
			System.out.println(head.value+" is removed");
			previous.next = head.next;
			return;
			

		}else {
			System.out.println(head.value+" is removed");
			buckets[bucketIndex]=head.next;
		}
	}

	public static void main(String[] args) {
		HashTable table = new HashTable(10);
		table.put(105, "Tom");
		table.put(104, "Raju");
		table.put(106, "John");
		table.put(107, "Raman");
		System.out.println(table.size);
		table.get(108);
		table.remove(105);
		
	}
}
