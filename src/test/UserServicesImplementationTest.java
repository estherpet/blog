package test;

import org.junit.jupiter.api.Test;
import services.UserServices;
import services.UserServicesImplementation;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class UserServicesImplementationTest {
    UserServices userServices = new UserServicesImplementation();
@Test
    public void registerOneUser_CountIsOneTest(){
    userServices.register("wohi","naomi");
    assertEquals(1,userServices.numberOfUsers());
}
@Test
    public void registerTwoUser_CountIsTwoTest(){
    userServices.register("lizzy","dan");
    userServices.register("ify","vera");
    assertEquals(2,userServices.numberOfUsers());
}
@Test
    public void duplicateUser_CannotRegisterTest(){
    userServices.register("pat","lizzy");
    assertThrows(Exception.class,()->userServices.register("pat","lizzy"));
    try {
        userServices.register("pat","diva");
    }catch (IllegalArgumentException exception){
        assertEquals("user already exist",exception.getMessage());
        assertEquals(IllegalArgumentException.class,exception.getClass());
    }
    assertEquals(1,userServices.numberOfUsers());
   }


}