import java.util.ArrayList;

public class EliminateDupliates {

    public static void main(String[] args) {

    }

    public static<E extends Comparable<E>> ArrayList<E> removeDuplicate(ArrayList<E> ar1) {

        boolean found = false;
        if (ar1.size() == 0) {
            return ar1;
        }
            ArrayList<E> newLis = new ArrayList<>();
            newLis.add(ar1.get(0));
            for (int i = 1; i < ar1.size(); i++) {
                for (int j = 0; j < newLis.size(); i++) {
                    if (ar1.get(i).compareTo(newLis.get(j)) == 0) {
                        found = true;
                        break;
                    }
                }
                if (found != true) {
                    newLis.add(ar1.get(i));
                    found = false;
                }

            }
            return newLis;
        }



    }


