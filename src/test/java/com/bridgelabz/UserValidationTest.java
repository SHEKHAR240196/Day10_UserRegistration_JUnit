package com.bridgelabz;

import org.junit.Assert;
import org.junit.Test;

public class UserValidationTest {
    //FirstName
    /**
     * @method testValidateFirstName test Happy case for first name
     * @Test take a correct input where first latter is Cap
     * @return true
     */

    @Test
    public void testValidateFirstName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("Shekhar");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testInvalidFirstName test Sad case for first name
     * @Test take a wrong input where first latter is not Cap
     * @return false
     */

    @Test
    public void testInvalidFirstName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("abc");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testShortFirstName test Sad case for first name
     * @Test take a wrong input where first latter is not Cap and we take only two Character
     * @return false
     */

    @Test
    public void testShortFirstName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateFirstName("ab");
        Assert.assertEquals(false, result);
    }

    //LastName
    /**
     * @method testValidateLastName test Happy case for last name
     * @Test take a correct input where first latter is Cap
     * @return true
     */

    @Test
    public void testValidateLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("Patle");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testInvalidLastName test Sad case for last name
     * @Test take a wrong input where first latter is not Cap
     * @return false
     */

    @Test
    public void testInvalidLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("xyz");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testShortLastName test Sad case for last name
     * @Test take a wrong input where first latter is not Cap and we take only two Character
     * @return false
     */

    @Test
    public void testShortLastName() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validateLastName("xy");
        Assert.assertEquals(false, result);
    }

    //Phone Number
    /**
     * @method testValidPhoneNumber test Happy case for phoneNo
     * @Test take right input where we mention country code then a space and then 10 digit phoneNo
     * @return true
     */

    @Test
    public void testValidPhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("91 7020714423");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testInvalidNoSpacePhoneNumber test sad case for phoneNo
     * @Test take wrong input where we mention country code but donot give a space between country code and 10 digit phoneNo
     * @return false
     */

    @Test
    public void testInvalidNoSpacePhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("918605141014");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testInvalidShortPhoneNumber test sad case for phoneNo
     * @Test take wrong input where we mention country code then a space and then  less then 10 digit phoneNo
     * @return false
     */

    @Test
    public void testInvalidShortPhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("89 8605141014");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testInvalidShortPhoneNumber test sad case for phoneNo
     * @Test take wrong input where we mention 10 digit phoneNo without country code
     * @return false
     */

    @Test
    public void testInvalidWithoutCountryCodePhoneNumber() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePhoneNumber("7020714423");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test (follow all the 4 rules)
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return true
     */

    @Test
    public void testValidPassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Shekhar@24");
        Assert.assertEquals(true, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule1
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidShortPassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Shekhar24@");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule2
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidSkipUpperCasePassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("24Shekhar@");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule3
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidSkipNumericValuePassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Shekhar24@");
        Assert.assertEquals(false, result);
    }

    /**
     * @method testvalidPassword test sad case for phoneNo
     * @test skip Rule4
     * Rule-1 Minimum 8 character
     * Rule-2 At least one Upper case
     * Rule-3  At least one Numeric value
     * Rule-4 at least one Special character
     * @return false
     */

    @Test
    public void testInvalidSkipSpecialCharacterPassword() {
        UserValidator userValidator = new UserValidator();
        boolean result = userValidator.validatePassword("Shekharpatle24@");
        Assert.assertEquals(false, result);
    }
}
