package devoxx;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NullPointerDereference {

  private static final Logger LOG = LoggerFactory
      .getLogger(NullPointerDereference.class);

  public int searchForAnimalID(String animal) {
    if (animal == null) {
      LOG.warn("animal should not be null");
    }
    String trimmedAnimal = trim(animal);
    if ("Antonio".equals(trimmedAnimal)) {
      return 1;
    }
    System.out.println(animal.toString());
    return -1;
  }


  public void foo(String animal){
    if(animal == null){
      animal.toString();
    }
  }

    
    
    
  public void bar(String animal){
    if(animal == null){
      animal.toString();
    }
  }

    public void bar2(String animal){
    if(animal == null){
      animal.toString();
    }
  }

      public void bar3(String animal){
    if(animal == null){
      animal.toString();
    }
  }
    
    public void bar4(String animal){
        if(animal == null){
            animal.toString();
        }
    }

  private String trim(String animal) {
    return animal.trim();
  }
    
}
