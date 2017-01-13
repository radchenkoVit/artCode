package week1.contactListApp.enums;

import week1.contactListApp.model.Contact;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public enum FindBy {
    Name(1, "Name"), LastName(2, "Last Name"), PhoneNumber(3, "Phone Number"), Note(4, "Note");
    private static Map<String, FindBy> nameMap = new HashMap<String, FindBy>();
    private static Map<Integer, FindBy> indexMap = new HashMap<Integer, FindBy>();


    static {
        //init
        for (FindBy findBy: FindBy.values()){
            nameMap.put(findBy.name, findBy);
            indexMap.put(findBy.index, findBy);
        }
    }

    private int index;
    private String name;

    FindBy(int index, String name){
        this.index = index;
        this.name = name;
    }

    public int getIndex(){return index;}
    public String getName(){return name;}

    public static FindBy getByIndex(int index){
        return indexMap.get(index);
    }

    // think how to return correct comparator
    //public abstract Comparator<Contact> getCom();

    //todo
    public Comparator<Contact> getComparator(){
        return new Comparator<Contact>() {
            public int compare(Contact o1, Contact o2) {
                return -1;
            }
        };
    }
}
