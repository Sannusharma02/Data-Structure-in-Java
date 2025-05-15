package dataStructure;

public class MyArrayList {

    private Object[] arr;
    private int index;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int size) {
        arr = new Object[size];
    }

    public void add(Object e) {
        if(index>=arr.length) resize();
        arr[index++]=e;
    }

    public int size() {
        return index;
    }

    public Object get(int pos){
        if (pos>=size()) throw new IndexOutOfBoundsException();
        return arr[pos];
    }

    public Object remove(int pos){
        if (pos>=size()) throw new IndexOutOfBoundsException();
        Object temp = arr[pos];
        System.arraycopy(arr,pos+1, arr, pos, size()-(pos+1));
        index--;
        arr[index]=null;
        return temp;
    }

    public Object remove(Object e){
        int i;
        for(i=0; i<size(); i++){
            if(arr[i].equals(e)) break;
        }
        if(i<size()) return remove(i);
        return null;
    }

    private Object set(int pos, Object e){
        if (pos>=size()) throw new IndexOutOfBoundsException();
        Object oldEle = arr[pos];
        arr[pos]=e;
        return oldEle;
    }

    @Override
    public String toString() {
        if (size() == 0) return "[]";

        String str = "["+arr[0];
        for (int i = 1; i < size(); i++) {
            str += ","+arr[i];
        }
        str += "]";
        return str;
    }

    private void resize(){
        Object[] temp = new Object[arr.length+5];
        System.arraycopy(arr,0,temp,0,arr.length);
        arr= temp;
    }

}
