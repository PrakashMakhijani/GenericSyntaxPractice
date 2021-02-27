public class Person <E>{

    //this is a generic class
    public E e;

    public void Person(E e){
        this.e = e;
    }

    public void setPerson(E e){
        this.e=e;
    }
    public E getPerson(){
        return e;
    }
}
