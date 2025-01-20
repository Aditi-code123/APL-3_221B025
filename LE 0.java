/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class LE 0
{
	    int speed;
	    String name;
	    void setspeed(int speed){
	        this.speed=speed;
	    }
	    void setname(String name){
	        this.name=name;
	    }
	    int getspeed(){
	        return this.speed;
	    }
	    String getname(){
	        return this.name;
	    }
	    public static void main(String[] args) {
	        Main m1=new Main();
	        m1.setname("Honda");
	        m1.setspeed(100);
	    System.out.println(m1.getname()+" "+m1.getspeed());
	}
}