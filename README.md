# Clean Code with Java: Simple Design, Refactoring & TDD

This project was developed following the instructions and the exercises from the course "Clean Code with Java: Learn Simple Design, Refactoring & TDD", available by [Udemy](https://www.udemy.com/course/java-clean-code-with-refactoring-and-tdd/?referralCode=201A00544D2D754A688F)

## Clone, build and run
- Clone this repo to your local https://github.com/milton-jr92/refactoring-and-tdd.git
- From your IDE (it was used Eclipse for this project), import it as a Maven project
- Run all the tests from root as a JUnit Test, it should run all the 56 from 56 tests

### Summary

- **Step I** : Understand Clarity of Code (Unit Tests)
- **Step II**: Focus on 4 Principles of Simple Design
- **Step III**: Get started with Refactoring
- **Step IV** : Understand TDD

### Exercises

#### GildedRose
- Goal
	- Understand **Clarity of Code**
	- Give **importance** to Unit Testing
- `GildedRoseADefaultItemTest.java`
- `GildedRoseBAgedBrieTest.java`
- `GildedRoseCBackstagePassesTest.java`
- More details - [Gilded Rose Exercises](https://github.com/milton-jr92/refactoring-and-tdd/blob/main/GildedRoseProblemStatement.md)

#### 4 Principles of Simple Design
- Refactor Code
	- `StudentHelper.isGradeB()`
	- `StudentHelper.getGrade()`
	- `StudentHelper.willQualifyForQuiz()`
- Write Code
	- `TextHelper.swapLastTwoCharacters()`
	- `TextHelper.truncateAInFirst2Positions()`
- Refactor Unit Test
	- `CustomerBOTest`

#### Refactoring
- `CustomerBOImpl.getCustomerProductsSum(List<Product>)`
- `Movie.isValidRating()`
- `MenuAccess.setAuthorizationsInEachMenus(List<MenuItem>, Role[])`
- `UserLoginChecker.isUserAllowedToLogin(long, String, boolean, User, List)`

#### TDD
- More details - [TDD Exercises](https://github.com/milton-jr92/refactoring-and-tdd/blob/main/tdd.md)
- Truncate A in first 2 positions of a String
- Check if first two and last two characters in the string are the same.
- Bowling Kata
