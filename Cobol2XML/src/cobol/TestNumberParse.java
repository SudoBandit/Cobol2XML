package cobol;

import static org.junit.Assert.*;

import org.junit.Test;

import parse.tokens.Token;

public class TestNumberParse {

	@Test
	public void testNumber() {
		Token token = new Token(8);
		assertTrue(token.isNumber());
		System.out.println(token.toString());
	}
	
	public void testParse() {
		
		
	} 

}
