package ch2;

public class PrintfEx1 {
	public static void main(String[] args) {
		byte b = 1;
		short s = 2;
		char c = 'A';
		int finger = 10;
		long big = 100_000_000_000L;
		long hex = 0xFFFF_FFFF_FFFF_FFFFL;
		int octNum = 010;
		int hexNum = 0x10;
		int binNum = 0b10;
		
		System.out.printf("%d %n", b);
		System.out.printf("%s %n", s);
		System.out.printf("%c, %d %n", c,(int)c);
		System.out.printf("[%5d] %n", finger);
		System.out.printf("[%-5d] %n", finger);
		System.out.printf("[%05d] %n", finger);
		System.out.printf("%d %n", big);
		System.out.printf("%#x %n", hex);
		System.out.printf("%o, %d %n", octNum, octNum);
		System.out.printf("%x, %d %n", hexNum, hexNum);
		System.out.printf("%s, %d %n", Integer.toBinaryString(binNum), binNum);
	}
}
