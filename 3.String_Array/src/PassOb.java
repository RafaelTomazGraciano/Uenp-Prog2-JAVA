class PassOb {
    public static void main(String[] args) {
        Block ob1 = new Block(10, 2, 5);
        Block ob2 = new Block(10, 2, 5);
        Block ob3 = new Block(4, 5, 5);

        System.out.println("ob1 mesmas dimesoes de ob2: " + ob1.sameblock(ob2));

        System.out.println("ob1 mesmas dimesoes de ob3: " + ob1.sameblock(ob3));

        System.out.println("ob1 mesmo volume de ob3: " + ob1.sameVolume(ob3));
    }
}
