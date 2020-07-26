package com.day2dayjava.tutorials.java.lambda.expressions;

import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
@SelectClasses({ LambdaExpressionsWithNoArgumentTests.class, LambdaExpressionsWithOneArgumentTests.class,
		LambdaExpressionsWithTwoArgumentsTests.class, LambdaExpressionScopeTest.class,
		LambdaExpressionsWithTwoArgumentsExplicitTypeSpecificationTest.class })
public class AllLambdaExpressionsTests {

}
