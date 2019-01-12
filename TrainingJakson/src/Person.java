import java.util.Objects;

public class Person {

        private String name;
        private int age;
        private Adresse adres;
        public Person(String name, int age, Adresse adres) {
            this.name = name;
            this.age = age;
            this.adres = adres;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public Adresse getAdres() {
            return adres;
        }
        public void setAdres(Adresse adres) {
            this.adres = adres;
        }
        @Override
        public String toString() {
            return "Person{" + "name='" + name + '\'' + ", age=" + age + ", adres=" + adres + '}';
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Person)) return false;
            Person person = (Person) o;
            return getAge() == person.getAge() && Objects.equals(getName(), person.getName()) && Objects.equals(getAdres(), person.getAdres());
        }
        @Override
        public int hashCode() {
            return Objects.hash(getName(), getAge(), getAdres());
        }
        public Person() {
        }
    }
