class Kaurav extends Fighter {
    public Kaurav(String name) {
        super(name);
    }

    @Override
    public void obey() {
        System.out.println(name + " is disobeying...");
    }
    
    @Override
    public void kind() {
        System.out.println(name + " is being cruel...");
    }
}
