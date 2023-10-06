package lessons.ls_10_23.ls_06_10_23;

public class Iterator {
    public static void main(String[] args) {
        NameList list = new NameList();

        NameList.Iterator iterator = list.getIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}

class NameList {
    private String[] names = {"Mike", "John", "Kate", "Bob", "Ben"};

    public Iterator getIterator() {
        return new Iterator();
    }

    public class Iterator {
        private int counter;

        public Iterator() {
            counter = 0;
        }

        public boolean hasNext() {
            return counter < names.length;
        }

        public String next() {
            String name = names[counter];
            ++counter;
            return name;
        }
    }
}
