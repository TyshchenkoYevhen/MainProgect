
package HomeWork4;

public class Human {

   public static void main(String[] args) {
        SomePerson Yevhen = new SomePerson();
        Yevhen.displayInfo();
       SomePerson Yevhen1 = new SomePerson("Yevhen", "Tyshchenko", 13);
       Yevhen1.displayInfo();
        SomePerson Yevhen2 = new SomePerson("Yevhen", 180, 88, 13);
       Yevhen2.displayInfo();
    }
}
   class SomePerson {
        int weight;
        int age;
        String firstName;
        String lastName;
        int height;

        SomePerson()
        {
            this.weight = 87;
            this.firstName = "Yevhen";
            this.lastName = "Tyshchenko";
            this.age = 37;
            this.height = 180;
        }
        public SomePerson(String firstName, int weight, int height, int age)
        {
            this.lastName = "Tyshchenko";
            this.weight = 87;
            this.height = 180;
            this.age = 37;
        }
        SomePerson(String firstName, String lastName, int age)
        {
            this.firstName = "Yevhen";
            this.lastName = "Tyshchenko";
            this.age = 37;
        }

        void displayInfo(){
            System.out.printf("Name: %s \tLastName: %s \tWeight: %s \tHeight: %s \tAge: %d\n", firstName, lastName, weight, height, age);

    }
}

