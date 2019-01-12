/*import java.util.*;

public class ListCheck {

    public static void main(String[] args) {

        List<Integer> l1 = new ArrayList<> ();
        //l1.add(1);
        //l1.add(2);
        // l1.add (3);-->Collections.addALL...
//List <Integer> l1 = new LinkedList <> (Arays.asList (1,2,3,5));-->parametry v konstruktor peredajutsja, esli v vide Collectiii ili spiska
        List<Integer> l2 = new ArrayList<> ();

        Collections.addAll(l1, 1, 2, 3, 4);

        // Integer [] array = {1,2,3};
        //List <Integer> l1 = Arrays.asList(array);

        //Integer []l=(Integer [])l1.toArray();

        Collections.addAll(l2, 1, 2,5, 4);
        System.out.println(getNewList (l1, l2));


        List<String> listofStrings = Arrays.asList("aa", "bb","cc");
        Set<String> setofStrings = new HashSet<>(listofStrings);
        boolean added = setofStrings.add("dd");
        System.out.println("is added " + added);
        System.out.println(setofStrings);

        Iterator<String> iterator = setofStrings.iterator();
        while (iterator.hasNext()){
            iterator.remove();
            String s = iterator.next();
            System.out.println(setofStrings);
        }



        List<String> newStringList = new LinkedList<>(setofStrings);
        System.out.println(newStringList);

        //Set ne garantieruet takoj zhe porjadok elementov kak v Spiske, cm. primer nizhe
    }

    public static List<String> getNewList (List<Integer> l1, List <Integer> l2){

        List<String> result = new LinkedList<>();
        for ( int i=0; i<l1.size();i++) {
            if (l1.get(i) == l2.get(i)) {
                result.add("YES");
            }else{
                result.add("NO");
            }


        }
        return result;
    }
}
*/