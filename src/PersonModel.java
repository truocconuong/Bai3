import java.util.ArrayList;
import java.util.Scanner;

public class PersonModel<E> {
ArrayList dataEmployee = new ArrayList<>();

public void AddEmployeer(E e){

  dataEmployee.add(e);

}
public void Display(){
    for(int i=0;i<dataEmployee.size();i++){
        System.out.println(dataEmployee.get(i));
    }
}
}
