package csesProblems.Mathematics;

import java.io.*;

public class Exponentiali {
	static final StdIn in = new StdIn();
	static final PrintWriter out = new PrintWriter(System.out);
	static long mod = 1000000007;
	
	static class Solver {
//		write your code here inside constructor
		Solver() {
			long a = in.nextLong(), b = in.nextLong();
			long res = 1;
			while(b>0)
			{
				if(b%2 != 0) { res = (res * a) % mod;}
				b /= 2;
				a = (a*a) % mod;
			}
			out.println(res);
		}
	}

	public static void main(String[] args) {
		int t = in.nextInt();
		while(t-- > 0)
		{
			
			new Solver();
			
		}
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
