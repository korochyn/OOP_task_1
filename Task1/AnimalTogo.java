package Task1;

import java.time.LocalDate;

public class AnimalTogo extends Animal {

    public AnimalTogo() {
       super();
    }

    public AnimalTogo(String name, Illness illness, String ownerName, LocalDate birthday) {
       super(name, illness, ownerName, birthday);
    }


    
    @Override
    public void breathe() {
        // TODO Auto-generated method stub
        super.breathe();
    }

    @Override
    public void fly() {
        System.out.println(getClass().getSimpleName() + " не может летать");
    }

    @Override
    public Illness getIllness() {
        // TODO Auto-generated method stub
        return super.getIllness();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public void liveCycle() {
        // TODO Auto-generated method stub
        super.liveCycle();
    }

    @Override
    public void setName(String name) {
        // TODO Auto-generated method stub
        super.setName(name);
    }

    @Override
    public void swim() {
        System.out.println(getClass().getSimpleName() + " не может плавать");
    }

    @Override
    public void toGo() {
        // TODO Auto-generated method stub
        super.toGo();
    }

    // @Override
    // protected Object clone() throws CloneNotSupportedException {
    //     // TODO Auto-generated method stub
    //     return super.clone();
    // }

    // @Override
    // public boolean equals(Object obj) {
    //     // TODO Auto-generated method stub
    //     return super.equals(obj);
    // }

    // @Override
    // protected void finalize() throws Throwable {
    //     // TODO Auto-generated method stub
    //     super.finalize();
    // }

    // @Override
    // public int hashCode() {
    //     // TODO Auto-generated method stub
    //     return super.hashCode();
    // }

    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return super.toString();
    // }



}
