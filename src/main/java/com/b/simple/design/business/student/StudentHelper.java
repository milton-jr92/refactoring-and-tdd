package com.b.simple.design.business.student;

import com.b.simple.design.business.student.Grade.Grades;

public class StudentHelper {

	private static final int gradeB_minLimit = 51;
	private static final int gradeA_increaseForMath = 5;
	private static final int gradeA_minLimit = 91;
	private static final int increaseForMath = 10;
	private static final int gradeB_maxMark = 80;
	private static final int gradeB_minMark = 51;
	

	/* PROBLEM 1 */	
	/*
	* You get a grade B if marks are between 51 and 80 (both inclusive). 
	* Except for Maths where the upper limit is increased by 10.
	*/
	public boolean isGradeB(int marks, boolean isMaths) {
		
		int extraLimit = isMaths ? increaseForMath : 0;
		
		int upperLimit = gradeB_maxMark + extraLimit;
		
		return marks>=gradeB_minMark && marks<=upperLimit;					 
	}

	/* PROBLEM 2 */
	/*
	You are awarded a grade based on your marks.
	Grade A = 91 to 100, Grade B = 51 to 90, Otherwise Grade C
	Except for Maths where marks to get a Grade are 5 higher than required 
	for other subjects.
	*/

	public Grades getGrade(int mark, boolean isMaths) {	
		
		int extraLimit = isMaths ? gradeA_increaseForMath : 0;
		
		if (mark >= gradeA_minLimit + extraLimit)
			return Grades.A;		
		
		if (mark >= gradeB_minLimit + extraLimit) 
			return Grades.B;		
		
		return Grades.C;
	}	

    /*  PROBLEM 3
     * You and your Friend are planning to enter a Subject Quiz.
     * However, there is a marks requirement that you should attain to qualify.
     * 
     * Return value can be YES, NO or MAYBE.
     * 
     * YES If either of you are very good at the subject(has 80 or more marks)
     * However, there is an exception that if either of you is not good in the subject(20 or less marks), it is NO.
     * In all other conditions, return MAYBE.
     * 
     * However, the definition for good and not good are 5 marks higher if the subject is Mathematics.
     * 
     * marks1 - your marks
     * marks2 - your friends marks
    */
        
    public String willQualifyForQuiz(int marks1, int marks2, boolean isMaths) {
    	
        if (markIsNotGood(marks1, isMaths) || markIsNotGood(marks2, isMaths)) 
        	return "NO";
        
        if (markIsGood(marks1, isMaths) || markIsGood(marks2, isMaths)) 
        	return "YES";
        
        return "MAYBE";
    }

	private boolean markIsGood(int marks, boolean isMaths) {
		int extraLimit = isMaths ? 5 : 0;
		return marks >= 80 + extraLimit;
	}

	private boolean markIsNotGood(int marks, boolean isMaths) {
		int extraLimit = isMaths ? 5 : 0;
		return marks <= 20 + extraLimit;
	}	

}