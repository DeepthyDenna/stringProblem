package src;
import static org.junit.Assert.*;

import org.junit.Test;


public class Removeallinstancesusingmethods {






	@Test
	 public void deleteFromBeginning() {
		assertEquals("b",removeallinstances.deleteCharIter("ab", 'a'));
		assertEquals("b",removeallinstances.deleteChar("ab", 'a'));
		
		assertEquals("bc",removeallinstances.deleteCharIter("aaaabc", 'a'));
		assertEquals("bc",removeallinstances.deleteChar("aaaabc", 'a'));
	}
	
	@Test
	 public void deleteFromMiddle() {
		assertEquals("acd",removeallinstances.deleteCharIter("abcd", 'b'));
		assertEquals("acd",removeallinstances.deleteChar("abcd", 'b'));
		
		assertEquals("acd",removeallinstances.deleteCharIter("abbcd", 'b'));
		assertEquals("acd",removeallinstances.deleteChar("abbcd", 'b'));
	}
	
	@Test
	 public void deleteFromEnd() {
		assertEquals("abc",removeallinstances.deleteCharIter("abcd", 'd'));		assertEquals("abc",removeallinstances.deleteChar("abcd", 'd'));
		
		assertEquals("abc",removeallinstances.deleteCharIter("abcdd", 'd'));
		assertEquals("abc",removeallinstances.deleteChar("abcdd"
				+ "", 'd'));
	}
	
	@Test
	 public void deleteNonExistentChar() {
		assertEquals("abc",removeallinstances.deleteCharIter("abc", 'd'));
		assertEquals("abc",removeallinstances.deleteChar("abc", 'd'));
	}
	
	@Test
	 public void deleteAllChars() {		assertEquals("",removeallinstances.deleteCharIter("a", 'a'));
		assertEquals("",removeallinstances.deleteChar("a", 'a'));
		
		assertEquals("",removeallinstances.deleteCharIter("aaaaaaaaaaaaaa", 'a'));
		assertEquals("",removeallinstances.deleteChar("aaaaaaaaaaaaaa", 'a'));
}
	
	@Test
	 public void deleteWithSpaces() {		assertEquals("this is a test",removeallinstances.deleteCharIter("thisX isX aX testX", 'X'));
		assertEquals("this is a test",removeallinstances.deleteChar("thisX isX aX testX", 'X'));
		
		assertEquals("this is a test",removeallinstances.deleteCharIter("thisx isx ax testx", 'x'));
		assertEquals("this is a test",removeallinstances.deleteChar("thisx isx ax testx", 'x'));
	}

}

