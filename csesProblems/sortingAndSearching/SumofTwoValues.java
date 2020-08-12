package csesProblems.sortingAndSearching;
import java.io.*;
import java.util.ArrayList;

public class SumofTwoValues {
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);

	static class Solver {
//		write your code here inside constructor
		Solver() {
			
			long n = in.nextLong(), t = in.nextLong();
			long [] arr = new long[(int) n];
			for(int i = 0; i<n; i++) arr[i] = in.nextLong();
			ArrayList<Long> al = new ArrayList<Long>();
			
			
			for(int i = 0; i<n; i++)
			{
				long r = t - arr[i];
				al.add((long) i);
				
				for(int j = i+1; j<n; j++)
				{
					if(r == arr[j])
					{
						al.add((long) j);
						break;
					}
				}
				
				if(al.size() == 2) break;
				al.clear();
			}
			
			if(al.isEmpty())
			{
				System.out.println("IMPOSSIBLE");
			}else {
				for(long e : al)
				{
					System.out.print((e+1) + " ");
				}
			}
		}
		
	}

	public static void main(String[] args) {
		Solver s = new Solver();
		out.close();
	}

	static class StdIn {
		final private int BUFFER_SIZE = 1 << 16;
		private DataInputStream din;
		private byte[] buffer;
		private int bufferPointer, bytesRead;

		public StdIn() {
			din = new DataInputStream(System.in);
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public StdIn(InputStream in) {
			try {
				din = new DataInputStream(in);
			} catch (Exception e) {
				throw new RuntimeException();
			}
			buffer = new byte[BUFFER_SIZE];
			bufferPointer = bytesRead = 0;
		}

		public String next() {
			int c;
			while ((c = read()) != -1 && (c == ' ' || c == '\n' || c == '\r'))
				;
			StringBuilder s = new StringBuilder();
			while (c != -1) {
				if (c == ' ' || c == '\n' || c == '\r')
					break;
				s.append((char) c);
				c = read();
			}
			return s.toString();
		}

		public String nextLine() {
			int c;
			while ((c = read()) != -1 && (c == ' ' || c == '\n' || c == '\r'))
				;
			StringBuilder s = new StringBuilder();
			while (c != -1) {
				if (c == '\n' || c == '\r')
					break;
				s.append((char) c);
				c = read();
			}
			return s.toString();
		}

		public int nextInt() {
			int ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');

			if (neg)
				return -ret;
			return ret;
		}

		public int[] readIntArray(int n, int os) {
			int[] ar = new int[n];
			for (int i = 0; i < n; ++i)
				ar[i] = nextInt() + os;
			return ar;
		}

		public long nextLong() {
			long ret = 0;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (neg)
				return -ret;
			return ret;
		}

		public long[] readLongArray(int n, long os) {
			long[] ar = new long[n];
			for (int i = 0; i < n; ++i)
				ar[i] = nextLong() + os;
			return ar;
		}

		public double nextDouble() {
			double ret = 0, div = 1;
			byte c = read();
			while (c <= ' ')
				c = read();
			boolean neg = (c == '-');
			if (neg)
				c = read();
			do
				ret = ret * 10 + c - '0';
			while ((c = read()) >= '0' && c <= '9');
			if (c == '.')
				while ((c = read()) >= '0' && c <= '9')
					ret += (c - '0') / (div *= 10);
			if (neg)
				return -ret;
			return ret;
		}

		private void fillBuffer() throws IOException {
			bytesRead = din.read(buffer, bufferPointer = 0, BUFFER_SIZE);
			if (bytesRead == -1)
				buffer[0] = -1;
		}

		private byte read() {
			try {
				if (bufferPointer == bytesRead)
					fillBuffer();
				return buffer[bufferPointer++];
			} catch (IOException e) {
				throw new RuntimeException();
			}
		}

		public void close() throws IOException {
			if (din == null)
				return;
			din.close();
		}
	}
}
