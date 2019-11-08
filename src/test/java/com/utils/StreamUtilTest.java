package com.utils;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Test;

public class StreamUtilTest {

	@Test
	public void testCloseAll() {
	}

	@Test
	public void testReadTextFileInputStream() throws Exception {
		String file = StreamUtil.readTextFile(new FileInputStream(new File("f:\\data.txt")));
		System.out.println(file);
	}

	@Test
	public void testReadTextFileFile() {
		String string = StreamUtil.readTextFile(new File("f:\\data.txt"));
		System.out.println(string);
	}

}
