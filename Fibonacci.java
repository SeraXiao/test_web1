package text;

public class Fibonacci {
	 public static int of(int i){
	      if(i==1||i==2)
	           return 1;
	      else
	           return of(i-1)+of(i-2);
	    }
	    
	    public static void main(String[] args){
	      System.out.println("斐波那契数列的前200项为：" );
	      for(int j=1;j<=200;j++){
	        System.out.print(of(j)+"\t");
	        if(j%10==0)
	            System.out.println();
	       }   
	    }
}
