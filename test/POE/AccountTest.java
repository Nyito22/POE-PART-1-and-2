/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package POE;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of setUsername method, of class Account.
     */
    @Test
    public void testSetUsername() {
        System.out.println("setUsername");
        String username = "kyl_1";
        Account instance = new Account();
        instance.setUsername(username);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsername method, of class Account.
     */
    @Test
    public void testGetUsername() {
        System.out.println("getUsername");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getUsername();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFirstName method, of class Account.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "";
        Account instance = new Account();
        instance.setFirstName(firstName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFirstName method, of class Account.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getFirstName");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setLastName method, of class Account.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "";
        Account instance = new Account();
        instance.setLastName(lastName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLastName method, of class Account.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Account instance = new Account();
        String expResult = "";
        String result = instance.getLastName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isUsernameValid method, of class Account.
     */
    @Test
    public void testIsUsernameValid() {
        System.out.println("isUsernameValid");
        String username = "";
        Account instance = new Account();
        boolean expResult = false;
        boolean result = instance.isUsernameValid(username);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isPasswordValid method, of class Account.
     */
    @Test
    public void testIsPasswordValid() {
        System.out.println("isPasswordValid");
        String password = "";
        Account instance = new Account();
        boolean expResult = true;
        String result = " ch&&secke99!";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Account.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String username = "kyle";
        String password = "ch&&secke99!";
        Account instance = new Account();
        String expResult = "";
        String result = instance.registerUser(username, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Account.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String enteredUsername = "kyl_1";
        String enteredPassword = "Che&&secke99!";
        Account instance = new Account();
        boolean expResult = true;
        boolean result = instance.loginUser(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of returnLoginStatus method, of class Account.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String enteredUsername = "kyl_1";
        String enteredPassword = "Che&&secke99!";
         String enteredmatch = "kyl_1";
        String passwordmatch = "Che&&secke99!";
        Account instance = new Account();
        String expResult = "pass";
        String result = instance.returnLoginStatus(enteredUsername, enteredPassword);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Account.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Account.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CHECKTASKDESCRIPTION method, of class Account.
     */
    @Test
    public void testCHECKTASKDESCRIPTION() {
        System.out.println("CHECKTASKDESCRIPTION");
        boolean expResult = true;
        String result = "Create Login to authenticate users";
        assertEquals(expResult, "task successfully captured");
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of CEATETASKID method, of class Account.
     */
    @Test
    public void testCEATETASKID() {
        System.out.println("CEATETASKID");
        String taskname =  "Add task features";
        String developer = "Robyn Harrison ";
        int Tasknumber = 0;
        String expResult = " ";
        String result = " ";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of RETURNhours method, of class Account.
     */
    @Test
    public void testRETURNhours() {
        System.out.println("RETURNhours");
        int duration = 8;
        int expResult = 18;
        int result = Account.RETURNhours(duration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
