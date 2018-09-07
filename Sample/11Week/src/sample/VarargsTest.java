package sample;

class VarargsTest {
	static void myPrint (String... args) {
		for (String s : args)
			System.out.print(s);
	}
	public static void main(String[] args) {
		myPrint("あ\n");
		myPrint("あ", " ", "い\n");
		myPrint("あ", " ", "い", " ", "う\n");
	}
}
