package com.reactive.monad;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests to verify your implementation of Optional monad usage.
 * Created by Csaba_Bejan on 10/9/2015.
 */
public class OptionalMonadTest {
    private final MyObject NULL_PARAM = null;
    private final MyObject EMPTY_MYOBJECT = new MyObject(null);
    private final MyObject EMPTY_MYNESTEDOBJECT = new MyObject(new MyNestedObject(null));
    private final MyObject INCORRECT_INTVALUE = new MyObject(new MyNestedObject("incorrect"));
    private final MyObject NEGATIVE_INTVALUE = new MyObject(new MyNestedObject("-5"));
    private final MyObject CORRECT_INTVALUE_5 = new MyObject(new MyNestedObject("5"));

    private Worker worker = new Worker();

    ////////////////////////////// IMPERATIVE - START //////////////////////////////

    @Test
    public void testNullImperative() {
        Assert.assertEquals("In case of null input the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultImperative(NULL_PARAM));
    }

    @Test
    public void testEmptyImperative() {
        Assert.assertEquals("In case of empty input the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultImperative(EMPTY_MYOBJECT));
    }

    @Test
    public void testEmptyNestedImperative() {
        Assert.assertEquals("In case of empty nested input the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultImperative(EMPTY_MYNESTEDOBJECT));
    }

    @Test
    public void testIncorrectIntValueImperative() {
        Assert.assertEquals("In case of incorrect input intvalue the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultImperative(INCORRECT_INTVALUE));
    }

    @Test
    public void testNegativeIntValueImperative() {
        Assert.assertEquals("In case of negative input intvalue the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultImperative(NEGATIVE_INTVALUE));
    }

    @Test
    public void testHappyPathImperative() {
        Assert.assertEquals("In case of nested intvalue 5 the result should be 5",
                5, (int) worker.getPositiveIntFromObjectWithDefaultImperative(CORRECT_INTVALUE_5));
    }

    /////////////////////////////// IMPERATIVE - END ///////////////////////////////

    //////////////////////////////// MONADIC - START ///////////////////////////////

    @Test
    public void testNullMonadic() {
        Assert.assertEquals("In case of null input the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultMonad(NULL_PARAM));
    }

    @Test
    public void testEmptyMonadic() {
        Assert.assertEquals("In case of empty input the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultMonad(EMPTY_MYOBJECT));
    }

    @Test
    public void testEmptyNestedMonadic() {
        Assert.assertEquals("In case of empty nested input the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultMonad(EMPTY_MYNESTEDOBJECT));
    }

    @Test
    public void testIncorrectIntValueMonadic() {
        Assert.assertEquals("In case of incorrect input intvalue the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultMonad(INCORRECT_INTVALUE));
    }

    @Test
    public void testNegativeIntValueMonadic() {
        Assert.assertEquals("In case of negative input intvalue the result should be default",
                Worker.getDefault(), worker.getPositiveIntFromObjectWithDefaultMonad(NEGATIVE_INTVALUE));
    }

    @Test
    public void testHappyPathMonadic() {
        Assert.assertEquals("In case of nested intvalue 5 the result should be 5",
                5, (int) worker.getPositiveIntFromObjectWithDefaultMonad(CORRECT_INTVALUE_5));
    }

    ///////////////////////////////// MONADIC - END ////////////////////////////////
}
