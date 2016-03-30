package arraylist;
public class Mondai {

    static void hantei(Boolean b){
    	if(b.booleanValue()){
    		System.out.println("条件はtrueです。");
    	}else{
    		System.out.println("条件はfalseです。");
    	}
    }
    public static void main(String[] args){
    	int a = 5;
    	int b= 5;
    	boolean c = (a==b);
    	hantei(Boolean.valueOf(c));
    }
}