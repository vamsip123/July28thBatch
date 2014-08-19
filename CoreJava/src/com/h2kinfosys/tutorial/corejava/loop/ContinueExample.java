package com.h2kinfosys.tutorial.corejava.loop;

public class ContinueExample { public static void main(String[] args) {
		outerLoop : for (int i = 0; i < 10; i++) {
//			if (i % 2 == 0) continue; System.out.println("" + i);
			
			/*if (i == 5){
				continue;
			}*/
			
			System.out.println("i =" + i);
			
			innerLoop : for(int j = 0 ; j < 10 ; j++){
				if (j == 5){
					continue ;
				}
				if(j == 7) {
					continue outerLoop;
				}
				System.out.println(" j ="+ j);
				
			}
			
			
//				break;

//			System.out.print(i + " ");

			/*
			 * if (i % 2 == 0) continue; System.out.println("");
			 */
		}

	}
}
