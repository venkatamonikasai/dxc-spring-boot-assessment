package.com.dxc.personrestapi.Exceptionhandling;
public class PersonNotFoundException extends RuntimeException {

    PersonNotFoundException(Integer id){
        super("could not find person" +id);
    
    
}

    
}
