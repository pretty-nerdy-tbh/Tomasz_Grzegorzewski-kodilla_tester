public class User {
    String name;
    int age;

    public User (String name, int age) {
        this.name = name;
        this.age = age;

    }
        public static void main(String[] args){

        User agata = new User("Agata", 27);
        User monika = new User("Monika", 24);
        User paweł = new User("Paweł", 35);
        User piotr = new User("Piotr", 19);
        User julia = new User("Julia", 22);
        User robert = new User("Robert", 57);
        User rafał = new User("Rafał", 28);
        User marta = new User("Marta", 33);
        User czarek = new User("Czarek", 32);
        User tola = new User("Tola", 44);

        User[] users = {agata, monika, paweł, piotr, julia, robert, rafał, marta, czarek, tola};

        int sum =0;
        for (int i = 0; i < users.length; i++) {
            sum = sum + users[i].age;
        }
        int averageAge = sum / users.length;
        System.out.println("Średnia wieku to: " + averageAge);

        for (int i = 0; i < users.length; i++) {
            if (users[i].age < averageAge){
                System.out.println(users[i].name);
            }
        }
    }
}
