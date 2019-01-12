import java.util.Objects;

public class Adresse {

        private String streed;
        private  int nrhaus;

        public String getStreed() {
            return streed;
        }
        public void setStreed(String strid) {
            streed = strid;
        }
        public int getNrhaus() {
            return nrhaus;
        }
        public void setNrhaus(int nrhaus) {
            nrhaus = nrhaus;
        }
        public Adresse(String streed, int nrhaus) {
            this.streed = streed;
            this.nrhaus = nrhaus;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Adresse)) return false;
            Adresse adresse = (Adresse) o;
            return getNrhaus() == adresse.getNrhaus() && Objects.equals(getStreed(), adresse.getStreed());
        }
        @Override
        public int hashCode() {
            return Objects.hash(getStreed(), getNrhaus());
        }
        public Adresse() {
        }
        @Override
        public String toString() {
            return "Adresse{" + "Strid='" + streed + '\'' + ", Nrhaus=" + nrhaus + '}';
        }
    }

