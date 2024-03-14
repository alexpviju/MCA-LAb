class pro8{
	public static void main(String args[]){
		String str = "Java";
		System.out.println("length of the string ::"+str.length());
		System.out.println("Concat : ");
		str = str.concat(" Programming");
		System.out.println(str);
		System.out.println("To Upper Case : ");
		str = str.toUpperCase();
		System.out.println(str);
		System.out.println("To Lower Case : ");
		str = str.toLowerCase();
		System.out.println(str);
		System.out.println("Replace String : ");
		str = str.replace("java","python");
		System.out.println(str);
		System.out.println("Sub String : ");
		str = str.substring(7);
		System.out.println(str);
	}
}

