class Vikarn extends Kaurav {
    public Vikarn(String name) {
        super(name);
    }

    @Override
    public void obey() {
        System.out.println(name + " is obeying (Vikarn)...");
    }
    
    @Override
    public void kind() {
        System.out.println(name + " is being kind (Vikarn)...");
    }
}

