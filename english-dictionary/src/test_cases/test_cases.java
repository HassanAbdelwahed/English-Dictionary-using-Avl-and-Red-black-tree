package test_cases;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.company.avlNew;
import com.company.RedBlackTree;

class test_cases {
	avlNew avl_test = new avlNew() ;
	RedBlackTree RB_test = new RedBlackTree();
	@Test
	void test1() {
		assertTrue(avl_test.Insert(7),"Error occured while inserting");
		assertTrue(avl_test.Insert(15),"Error occured while inserting");
		assertTrue(avl_test.Insert(3),"Error occured while inserting");
		assertTrue(avl_test.Insert(6),"Error occured while inserting");
	}
	@Test
	void test2() {
		avl_test.Insert(7);
		assertFalse(avl_test.Insert(7),"Inserted an element twice");
	}
	@Test
	void test3() {
		avl_test.Insert(7);
		avl_test.Insert(3);
		assertTrue(avl_test.Search(7),"Failed to find an exsiting element");
		assertTrue(avl_test.Search(3),"Failed to find an exsiting element");
		
	}
	@Test
	void test4() {
		assertFalse(avl_test.Search(27),"Found a non existing element");
		assertFalse(avl_test.Search(8),"Found a non existing element)");
	}
	@Test
	void test5() {
		avl_test.Insert(7);
		avl_test.Insert(3);
		assertTrue(avl_test.Delete(7),"Error occured while deletion");
		assertTrue(avl_test.Delete(3),"Error occured while deletion");
		assertFalse(avl_test.Delete(3),"Error occured while deletion");
	}
	@Test
	void test6() {
		assertEquals(0,avl_test.Size());
		avl_test.Insert(7);
		avl_test.Insert(3);
		avl_test.Insert(1);
		avl_test.Insert(15);
		assertEquals(4,avl_test.Size());
	}
	@Test
	void test7() {
		assertEquals(-1,avl_test.Height());
		avl_test.Insert(7);
		avl_test.Insert(3);
		avl_test.Insert(1);
		avl_test.Insert(15);
		assertEquals(2,avl_test.Height());
	}
	@Test
	void test8() {
		avl_test.Insert(7);
		avl_test.Insert(3);
		avl_test.Insert(1);
		avl_test.Insert(15);
		avl_test.deleteMin();
		assertFalse(avl_test.Search(1));
	}
	
	
	
	@Test
	void test9() {
		assertTrue(RB_test.Insert(7),"Error occured while inserting");
		assertTrue(RB_test.Insert(15),"Error occured while inserting");
		assertTrue(RB_test.Insert(3),"Error occured while inserting");
		assertTrue(RB_test.Insert(6),"Error occured while inserting");
	}
	@Test
	void test10() {
		RB_test.Insert(7);
		assertFalse(RB_test.Insert(7),"Inserted an element twice");
	}
	@Test
	void test11() {
		RB_test.Insert(7);
		RB_test.Insert(3);
		assertTrue(RB_test.Search(7),"Failed to find an exsiting element");
		assertTrue(RB_test.Search(3),"Failed to find an exsiting element");
		
	}
	@Test
	void test12() {
		assertFalse(RB_test.Search(27),"Found a non existing element");
		assertFalse(RB_test.Search(8),"Found a non existing element)");
	}
	@Test
	void test13() {
		RB_test.Insert(7);
		RB_test.Insert(3);
		assertTrue(RB_test.Delete(7),"Error occured while deletion");
		assertTrue(RB_test.Delete(3),"Error occured while deletion");
		assertFalse(RB_test.Delete(3),"Error occured while deletion");
	}
	@Test
	void test14() {
		assertEquals(0,RB_test.Size());
		RB_test.Insert(7);
		RB_test.Insert(3);
		RB_test.Insert(1);
		RB_test.Insert(15);
		assertEquals(4,RB_test.Size());
	}
	@Test
	void test15() {
		assertEquals(-1,RB_test.Height());
		RB_test.Insert(7);
		RB_test.Insert(3);
		RB_test.Insert(1);
		RB_test.Insert(15);
		assertEquals(2,RB_test.Height());
	}
}
