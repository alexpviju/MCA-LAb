import java.util.Scanner;
class info extends Exception{
  public info(String s){
    super(s);
  }
 }

class pro19{
	public static void main(String A[]){
	 String username ="white_wolf";
	 String password ="123456";
	 Scanner in=new Scanner(System.in);
	 System.out.print("Username :");
	 String u=in.next();
	 System.out.print("Password :");
	 String p=in.next();
	 try{
	 	 if(u.equals(username) && p.equals(password) ){
	 	 	System.out.println("Access Granted");
	 	 	}else{
	 	 		throw new info("invalid credential");
	 	 	}
	 	 }catch(info e){
	 	 	System.out.println(e.getMessage());
	 	 }
	 }
	}



 
