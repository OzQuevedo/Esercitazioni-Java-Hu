public class Node extends List {
    private int value;
    private List next;

    public Node(int value, List next) {
        this.value = value;
        this.next = next;
    }

    @Override
    public String toString() {
        return value + " " + next.toString();
    }

    @Override
    public List add(int x, int i) {
        if(i==0) {
            this.next = new Node(this.value, this.next);
            this.value = x;
        }else{
            this.next = this.next.add(x, i-1);
        }
        return this;
    }

    @Override
    public List remove(int x) {
        if(this.value == x)
            return this.next.remove(x);
        else {
            this.next = this.next.remove(x);
            return this;
        }
    }


 @Override
    public int countOdd(List l) {
    int contDispari = 0;
    for (int x=0; x<l.length; x++){
        if (l[x]%2!=0);

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
        return next;
    }

    public int getValue() {
        return value;
    }

}