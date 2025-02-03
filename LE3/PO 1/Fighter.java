/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
abstract class Fighter {
    String name;
    public Fighter(String name) {
        this.name = name;
    }
    public void fight() {
        System.out.println(name + " is fighting...");
    }
    public abstract void obey();
    public abstract void kind();
}