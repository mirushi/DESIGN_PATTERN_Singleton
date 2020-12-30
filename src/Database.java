class Database {
    private static Database instance;
    private Database() {
        //Khởi tạo database.
    }
    public static Database getInstance () {
        if (instance == null) {
            acquireThreadLock();
            if (instance == null)
                instance = new Database();
        }
        return instance;
    }
    public void doSomething() {
        //Implementation here.
    }
}
