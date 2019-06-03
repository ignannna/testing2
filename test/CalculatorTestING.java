/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import myCode.calculator;
import myCode.calculatorImp;
import static org.testng.Assert.*;
import org.testng.annotations.*;

/**
 *
 * @author user
 */
public class CalculatorTestING {
    
    private calculatorImp calculator;
    
    
    @BeforeClass
    public void setUp() {
        calculator = new calculatorImp();
    }
    public CalculatorTestING() {
    }
    
     @Test
     public void zeroTest() {
         double result = calculator.calculate("0");
         assertEquals(result,0.0 , "Oshibka na 0");
     }
    @Test
    public void addTest_2() {
        double result = calculator.calculate("(2+2)*1.5/10-444");
        assertEquals(result,-443.4,  "Oshibka sloznie vi4islenija");
                
    }
    
    @Test
    public void functionTest() {
        double result = calculator.calculate("sin(1)* sin(1)+ cos(1)*cos(1)");
        assertEquals(result,1,  "Oshibka c funktsijami");
                
    }
    
   
    @Test
    public void floatingPointTest() {
        double result = calculator.calculate("-3000.02");
        assertEquals(result,-3000.02,  "Oshibka na otritsatelnoe 4islo s plavajutstei to4koj");
                
    }
    @Test
    public void addTest() {
        double result = calculator.calculate("30.4/2");
        assertEquals(result,15.2,  "Oshibka na delenie");
                
     }
         
    }
