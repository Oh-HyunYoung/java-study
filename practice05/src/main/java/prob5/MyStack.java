package prob5;

public class MyStack {
	private String[] buffer;
	private int index;
	private int n;
	
	public MyStack(int i) {
		n=i;
		index = 0;
		buffer = new String[i];
	}

	public void push(String string) {
		if (index+1 < n) {
			String[] b = new String[n];
			for(int i=0;i<n-1;i++) {
				b[i+1] = buffer[i]; 
			}
			b[0] = string;
			for(int i=0;i<buffer.length;i++) {
				buffer[i] =b[i]; 
			}
		}else {
			String[] b = new String[index+1];
			for(int i=0;i<b.length-1;i++) {
				b[i+1] =buffer[i]; 
			}
			b[0] = string;
			buffer = new String[b.length];
			for(int i=0;i<buffer.length;i++) {
				buffer[i] =b[i]; 
			}
		}
		index += 1;
	}

	public boolean isEmpty() {
		if(index == 0) {
			return true;
		}else {
			return false;
		}
		
	}

	public String pop() {
		String str = buffer[0];
		if (index+1 < n) {
			String[] b = new String[n];
			for(int i=1;i<n-1;i++) {
				b[i-1] =buffer[i]; 
			}
			for(int i=0;i<buffer.length;i++) {
				buffer[i] =b[i]; 
			}
		}
		else {
			String[] b = new String[index];
			for(int i=1;i<index;i++) {
				b[i-1] =buffer[i]; 
			}
			buffer = new String[b.length];
			for(int i=0;i<buffer.length;i++) {
				buffer[i] =b[i]; 
			}
		}
		index -= 1;

		return str;
	}
	
	public void print() {
		for(String s:buffer) {
		System.out.println(s);	
		}
	}
}