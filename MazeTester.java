public class MazeTester{
	public static void main(String[] arg){
		//TEST 1
		boolean passed = true;
		String testcase1[] = {"* ****",
							  "*    *",
							  "* ** *",
							  "**** *"};
		Maze maze = new Maze(testcase1, 0, 1, 3, 4);
		MazeLocation expected1[] = new MazeLocation[7];
		expected1[0] = new MazeLocation(0, 1);
		expected1[1] = new MazeLocation(1, 1);
		expected1[2] = new MazeLocation(1, 2);
		expected1[3] = new MazeLocation(1, 3);
		expected1[4] = new MazeLocation(1, 4);
		expected1[5] = new MazeLocation(2, 4);
		expected1[6] = new MazeLocation(3, 4);
		MazeLocationList result1 = maze.solve();
		
		if (result1 == null) {
			passed = false;
		} else if (result1.isEmpty() == true) {
			passed = false;
		} else {
			for (int i = 0; i < result1.getLength(); i++) {
				MazeLocation loc = result1.retrieve(i);
				if (loc.equals(expected1[i]) == false) {
					passed = false;
					break;
				}
			}
		}
		
		if (passed) {
			System.out.println("Test(horizonal path): passed");
		} else {
			System.out.println("Test(horizonal path): FAILED");
		}
	

		//TEST 2
		String testcase2[] = {"** *** *",
							  "*   ** *",
							  "* *    *",
							  "********"};
		maze = new Maze(testcase2, 0, 2, 0, 6);
		MazeLocation expected2[] = new MazeLocation[9];
		expected2[0] = new MazeLocation(0, 2);
		expected2[1] = new MazeLocation(1, 2);
		expected2[2] = new MazeLocation(1, 3);
		expected2[3] = new MazeLocation(2, 3);
		expected2[4] = new MazeLocation(2, 4);
		expected2[5] = new MazeLocation(2, 5);
		expected2[6] = new MazeLocation(2, 6);
		expected2[7] = new MazeLocation(1, 6);
		expected2[8] = new MazeLocation(0, 6);
		MazeLocationList result2 = maze.solve();
		
		if (result2 == null) {
			passed = false;
		} else if (result2.isEmpty() == true) {
			passed = false;
		} else {
			for (int i = 0; i < result2.getLength(); i++) {
				MazeLocation loc = result2.retrieve(i);
				if (loc.equals(expected2[i]) == false) {
					passed = false;
					break;
				}
			}
		}
		
		if (passed) {
			System.out.println("Test(horizonal path): passed");
		} else {
			System.out.println("Test(horizonal path): FAILED");
		}
		
		//TEST 3
		String testcase3[] = {"** *******",
							  "*    *   *",
							  "* ** *** *",
							  "*  *     *",
							  "******** *"};
		maze = new Maze(testcase3, 0, 2, 4, 8);
		MazeLocation expected3[] = new MazeLocation[11];
		expected3[0] = new MazeLocation(0, 2);
		expected3[1] = new MazeLocation(1, 2);
		expected3[2] = new MazeLocation(1, 3);
		expected3[3] = new MazeLocation(1, 4);
		expected3[4] = new MazeLocation(2, 4);
		expected3[5] = new MazeLocation(3, 4);
		expected3[6] = new MazeLocation(3, 5);
		expected3[7] = new MazeLocation(3, 6);
		expected3[8] = new MazeLocation(3, 7);
		expected3[9] = new MazeLocation(3, 8);
		expected3[10] = new MazeLocation(4, 8);
		MazeLocationList result3 = maze.solve();
		
		if (result3 == null) {
			passed = false;
		} else if (result3.isEmpty() == true) {
			passed = false;
		} else {
			for (int i = 0; i < result3.getLength(); i++) {
				MazeLocation loc = result3.retrieve(i);
				if (loc.equals(expected3[i]) == false) {
					passed = false;
					break;
				}
			}
		}
		
		if (passed) {
			System.out.println("Test(horizonal path): passed");
		} else {
			System.out.println("Test(horizonal path): FAILED");
		}
		
		//Test 4
		String testcase4[] = {"****** ******",
							  "*   ** *    *",
							  "* * ** **** *",
							  "* * **      *",
							  "* * ** *** **",
							  "  *    *   **",
							  "*************"};
		maze = new Maze(testcase4, 0, 6, 5, 0);
		MazeLocation expected4[] = new MazeLocation[20];
		expected4[0] = new MazeLocation(0, 6);
		expected4[1] = new MazeLocation(1, 6);
		expected4[2] = new MazeLocation(2, 6);
		expected4[3] = new MazeLocation(3, 6);
		expected4[4] = new MazeLocation(4, 6);
		expected4[5] = new MazeLocation(5, 6);
		expected4[6] = new MazeLocation(5, 5);
		expected4[7] = new MazeLocation(5, 4);
		expected4[8] = new MazeLocation(5, 3);		
		expected4[9] = new MazeLocation(4, 3);
		expected4[10] = new MazeLocation(3, 3);
		expected4[11] = new MazeLocation(2, 3);
		expected4[12] = new MazeLocation(1, 3);
		expected4[13] = new MazeLocation(1, 2);
		expected4[14] = new MazeLocation(1, 1);
		expected4[15] = new MazeLocation(2, 1);
		expected4[16] = new MazeLocation(3, 1);
		expected4[17] = new MazeLocation(4, 1);
		expected4[18] = new MazeLocation(5, 1);
		expected4[19] = new MazeLocation(5, 0);		
		MazeLocationList result4 = maze.solve();
		
		if (result4 == null) {
			passed = false;
		} else if (result4.isEmpty() == true) {
			passed = false;
		} else {
			for (int i = 0; i < result4.getLength(); i++) {
				MazeLocation loc = result4.retrieve(i);
				if (loc.equals(expected4[i]) == false) {
					passed = false;
					break;
				}
			}
		}
		
		if (passed) {
			System.out.println("Test(horizonal path): passed");
		} else {
			System.out.println("Test(horizonal path): FAILED");
		}
		
		//TEST 5
		String testcase5[] = {"********** ****",
							  "*******       *",
							  "    * * ** ****",
							  "*** *   **    *",
							  "* * ****** ** *",
							  "* * *      ** *",
							  "*     ******  *",
							  "***************"};
		maze = new Maze(testcase5, 0, 10, 2, 0);
		MazeLocation expected5[] = new MazeLocation[21];
		expected5[0] = new MazeLocation(0, 10);
		expected5[1] = new MazeLocation(1, 10);
		expected5[2] = new MazeLocation(2, 10);
		expected5[3] = new MazeLocation(3, 10);
		expected5[4] = new MazeLocation(4, 10);
		expected5[5] = new MazeLocation(5, 10);
		expected5[6] = new MazeLocation(5, 9);
		expected5[7] = new MazeLocation(5, 8);
		expected5[8] = new MazeLocation(5, 7);		
		expected5[9] = new MazeLocation(5, 6);
		expected5[10] = new MazeLocation(5, 5);		
		expected5[11] = new MazeLocation(6, 5);
		expected5[12] = new MazeLocation(6, 4);
		expected5[13] = new MazeLocation(6, 3);
		expected5[14] = new MazeLocation(5, 3);
		expected5[15] = new MazeLocation(4, 3);
		expected5[16] = new MazeLocation(3, 3);
		expected5[17] = new MazeLocation(2, 3);
		expected5[18] = new MazeLocation(2, 2);
		expected5[19] = new MazeLocation(2, 1);	
		expected5[20] = new MazeLocation(2, 0);			
		MazeLocationList result5 = maze.solve();
		
		if (result5 == null) {
			passed = false;
		} else if (result5.isEmpty() == true) {
			passed = false;
		} else {
			for (int i = 0; i < result5.getLength(); i++) {
				MazeLocation loc = result5.retrieve(i);
				if (loc.equals(expected5[i]) == false) {
					passed = false;
					break;
				}
			}
		}
		
		if (passed) {
			System.out.println("Test(horizonal path): passed");
		} else {
			System.out.println("Test(horizonal path): FAILED");
		}
		
		//TEST 6
		String testcase6[] = {"*******************",
							  "************     **",
							  "          ***** ***",
							  "***** *** **       ",
							  "*     *** ** **** *",
 							  "* ******* ** *  * *",
							  "* *       ** * ** *",
 							  "* * *** **** * ** *",
							  "* * ***    * * ** *",
							  "* * ******** *    *",
							  "* *          **** *",
							  "*******************"};
		maze = new Maze(testcase6, 2, 0, 3, 18);
		MazeLocation expected6[] = new MazeLocation[46];
		expected6[0] = new MazeLocation(2, 0);
		expected6[1] = new MazeLocation(2, 1);
		expected6[2] = new MazeLocation(2, 2);
		expected6[3] = new MazeLocation(2, 3);
		expected6[4] = new MazeLocation(2, 4);
		expected6[5] = new MazeLocation(2, 5);		
		expected6[6] = new MazeLocation(2, 6);
		expected6[7] = new MazeLocation(2, 7);
		expected6[8] = new MazeLocation(2, 8);		
		expected6[9] = new MazeLocation(2, 9);		
		expected6[10] = new MazeLocation(3, 9);		
		expected6[11] = new MazeLocation(4, 9);		
		expected6[12] = new MazeLocation(5, 9);
		expected6[13] = new MazeLocation(6, 9);		
		expected6[14] = new MazeLocation(6, 8);
		expected6[15] = new MazeLocation(6, 7);
		expected6[16] = new MazeLocation(6, 6);
		expected6[17] = new MazeLocation(6, 5);
		expected6[18] = new MazeLocation(6, 4);
		expected6[19] = new MazeLocation(6, 3);		
		expected6[20] = new MazeLocation(7, 3);	
		expected6[21] = new MazeLocation(8, 3);	
		expected6[22] = new MazeLocation(9, 3);	
		expected6[23] = new MazeLocation(10, 3);		
		expected6[24] = new MazeLocation(10, 4);	
		expected6[25] = new MazeLocation(10, 5);	
		expected6[26] = new MazeLocation(10, 6);	
		expected6[27] = new MazeLocation(10, 7);	
		expected6[28] = new MazeLocation(10, 8);	
		expected6[29] = new MazeLocation(10, 9);	
		expected6[30] = new MazeLocation(10, 10);	
		expected6[31] = new MazeLocation(10, 11);	
		expected6[32] = new MazeLocation(10, 12);		
		expected6[33] = new MazeLocation(9, 12);
		expected6[34] = new MazeLocation(8, 12);
		expected6[35] = new MazeLocation(7, 12);
		expected6[36] = new MazeLocation(6, 12);
		expected6[37] = new MazeLocation(5, 12);		
		expected6[38] = new MazeLocation(4, 12);
		expected6[39] = new MazeLocation(3, 12);		
		expected6[40] = new MazeLocation(3, 13);
		expected6[41] = new MazeLocation(3, 14);		
		expected6[42] = new MazeLocation(3, 15);
		expected6[43] = new MazeLocation(3, 16);		
		expected6[44] = new MazeLocation(3, 17);
		expected6[45] = new MazeLocation(3, 18);
		MazeLocationList result6 = maze.solve();
		
		if (result6 == null) {
			passed = false;
		} else if (result6.isEmpty() == true) {
			passed = false;
		} else {
			for (int i = 0; i < result6.getLength(); i++) {
				MazeLocation loc = result6.retrieve(i);
				if (loc.equals(expected6[i]) == false) {
					passed = false;
					break;
				}
			}
		}
		
		if (passed) {
			System.out.println("Test(horizonal path): passed");
		} else {
			System.out.println("Test(horizonal path): FAILED");
		}
		
	}
}