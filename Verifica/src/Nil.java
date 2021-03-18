
public class Nil extends List {

    @Override
    public String toString() {
        return "";
    }


    @Override
    public List add(int x, int i) {
        return new Node(x, this);
    }

    @Override
    public List remove(int x) {
        return this;
    }



  @Override
 public int countOdd(list l) {
    int contDispari = 0;
    for (int x=0; x<list.length; x++){
        if (list[x]%2!=0);

        contDispari++;
    }

    return contDispari;
    }
    @Override
        public List doubleValue(List l) {
        List newList = new List;
        for (x=0;x<l.length;x++){
            l[x]=newList[2*x];
        }
        return newList;
    }


  /*  @Override
    public boolean equals(Object obj) {
        // completa qui
    }*/

    @Override
    public List getNext(){
        return this;
    }

}