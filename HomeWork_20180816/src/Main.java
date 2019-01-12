public class Main {
    public static void main(String[] args) {

        Plant t1 = new TreeImpl("Fir tree", 30, 1);
        Plant f1 = new FlowerImpl("Chamomile", 0, 1);

        Plant [] plants =  {t1, f1};

        int yearsToGrow = 3;

        System.out.printf("Growing plants for %d years : \n", yearsToGrow );
        growPlantsForNumberOfYears(plants, yearsToGrow);


        System.out.println( " Tree has height:" + t1.getHeight() + " and is " + t1.getAge()+ " years old");
        System.out.println( " Flower has height:" + f1.getHeight() + " and is " + f1.getAge()+ " years old");
    }


    public static void growPlantsForNumberOfYears (Plant [] plants, int numberOfYears ){
        for (int i = 0; i< numberOfYears; i++ ){
            for (Plant plant:plants){
                //for (int j =0; j<plants.length;j++);
                //Plant = plant = plants [j];
                plant.doSpring();
                plant.doSummer();
                plant.doAutumn();
                plant.doWinter();

            }
        }
    }
}
