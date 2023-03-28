package com.aurionpro.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CellTest {
	Cell cell;
	
    @BeforeEach
    void init() {
    	cell = new Cell();
    }

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	
	@Test
	void testGetMark_checkIsEmpty() {
		assertEquals(MarkType.Empty, cell.getMark());
	}
	
	@Test
	void testSetMark_SetXOToCell() {
		cell.setMark(MarkType.X);
		assertEquals(MarkType.X, cell.getMark());
	}
	
	@Test
	void testSetMark_CellAlreadyMarkedException() {
		cell.setMark(MarkType.X);
		assertThrows(CellAlreadyMarkedException.class, ()-> cell.setMark(MarkType.X));
	}

}
