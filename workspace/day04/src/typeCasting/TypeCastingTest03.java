package typeCasting;

// 13번 : 모든 데이터 타입 조합
public class TypeCastingTest03 {
	public static void main(String[] args) {
		// 변수
		byte b = 10;
		short s = 100;
		char c = 'a';
		int i = 1000;
		long l = 10000L;
		float f = 3.14f;
		double d = 3.141592;
		boolean bool = true;
		
		// byte
		short bs = b;
//		char bc = b;
		int bi = b;
		long bl = b;
		double bd = b;
		float bf = b;
//		boolean bb = b;
		System.out.print(bs + "\t");
		System.out.print(bi + "\t");
		System.out.print(bl + "\t");
		System.out.print(bd + "\t");
		System.out.print(bf + "\n");
		System.out.println("====================");

		// short
//		byte sb = s;	short -> byte 불가
		short ss = s;
//		char sc = s;
		int si = s;
		long sl = s;
		double sd = s;
		float sf = s;
//		boolean sb = s;
		System.out.print(ss + "\t");
		System.out.print(si + "\t");
		System.out.print(sl + "\t");
		System.out.print(sd + "\t");
		System.out.print(sf + "\n");
		System.out.println("====================");
		
		// char
//		byte cb = (byte)c;	강제형변환 가능
//		short cs = (short)c;	강제형변환 가능
		char cc = c;
		int ci = c;
		long cl = c;
		double cd = c;
		float cf = c;
//		boolean cb = c;
		System.out.print(cc + "\t");
		System.out.print(ci + "\t");
		System.out.print(cl + "\t");
		System.out.print(cd + "\t");
		System.out.print(cf + "\n");
		System.out.println("====================");
		
		// int
		long il = i;
		float iF = i;
		double id = i;
		byte ib = (byte)i;
		char ic = (char)i;
		System.out.print(il + "\t");
		System.out.print(iF + "\t");
		System.out.print(id + "\t");
		System.out.print(ib + "\t");
		System.out.print(ic + "\n");
		System.out.println("====================");
		
		// long
		float lf = l;
		double ld = l;
		int li = (int)l;	// 강제형변환 가능
		System.out.print(lf + "\t");
		System.out.print(ld + "\t");
		System.out.print(li + "\n");
		System.out.println("====================");
		
		// float
		double fb = f;
		int fi = (int)f;		// 강제형변환 가능
		System.out.print(fb + "\t");
		System.out.print(fi + "\n");
		System.out.println("====================");
		
		// double
		float df = (float)d;	//강제형변환 가능
		int di = (int)d;
		System.out.print(df + "\t");
		System.out.print(di + "\n");
		System.out.println("====================");
		
		//boolean
//		int bi2 = (int)bool;	//강제형변환 불가능
		
		
		
		
	}
}
