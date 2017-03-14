package property_binding;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleDoubleProperty;

public class BindingDemo {
  public static void main(String[] args) {       
    DoubleProperty d1 = new SimpleDoubleProperty(15);
    DoubleProperty d2 = new SimpleDoubleProperty(20);
    
    System.out.println("d1 is " + d1.getValue() 
    	      + " and d2 is " + d2.getValue());
    
    d1.bindBidirectional(d2);
    
    System.out.println("d1 is " + d1.getValue() 
      + " and d2 is " + d2.getValue());
    
    d2.setValue(50);
    
    System.out.println("d1 is " + d1.getValue() 
      + " and d2 is " + d2.getValue());
    
    d1.setValue(10);
    
    System.out.println("d1 is " + d1.getValue() 
    	      + " and d2 is " + d2.getValue());
    
    
  }
}