//System.out.printf("%d + %d + %d = %d", 5, 6, 7, 18).println()
//
//// Value Declaration
//Char
//Int
//Integer
//Short
//Long
//Boolean
//
//// Calling expression
//int jd = 4;
//int total = jd + 7; // 11 is the expected result
//// To call the  total value; $total
//
//// CONDITON
//-----------------------
//if/else
//
//1. const = final in java.
//2. In java (==) is allowed of (===) in js // Mostly use for primitive definitions
//3. But equals is used for object
//
//// Using for loop
//IF LOOP
//"In the below block of code, we're ouputing a loop of fig 10 times."
//int fig = 3;
//for(i=1; i<=10; 1++){
//    System.out.printf("%d = %d * %d", fig, i, fig*1).println();
//}
//
//FOR LOOP
//void Method(int noTimes){
//    for(i=1; i<noTimes; i++){
//        System.out.println("Here is the output");
//    }
//}
//// Here we are outputting the numbers of times of the method.
//Method(2);
//
//// METHODS
//1. In java method names begins with small cap
//2. Parameter and argument in js works the same as java, just that you'll have to decalare the type of the parameter.'
//-----------------------
//ReturnType nameOfMethod(Type argumentName){
//    // Method code block
//}
//// void method
//// In the below example, we're calling Method but it will not return any value in it condition block.
//// Void method is not reuseable outside the class or parent method
//void method(){
//    // condition block
//}
//// To call it just reference it with the function method();
//1. noTimes is the Parameter passed to the method.
//void sayHelloWorld(int noTimes){
//    // Body here
//}
//
//// Making multiplication method
//void printMultiplicationTable(int noTimes){
//    for(int i=0; i<=noTimes; i++){
//        System.out.printf("%d x %d = %d", noTimes, i, (noTimes*i)).println();
//    }
//}
//
//// Making multiplication method
// void multiplyTwo(int valOne, int valTwo){
//    System.out.println("%d x %d = %d", valOne, valTwo, (valOne*valTwo)).println();
//}
//
//// Returning methods that retrun value
//// Reuseable method
//int twoNumbers(int one, int two){
//    int sum = one + two;
//    System.out.println(sum);
//    return sum;
//}
//
//
//// CLASSES
//// Below, we define Ghana as new Country
//// Making a copy of a class
//class Country {}
//// Here nn object of Ghana is created in the Country instances
//Country Ghana = new Country();
//
//// Below we create class of planet and create instances of planets in it
//// class Planet{}
//class Planet{
//    void revolve(){
//        System.out.println("Planet revolve");
//    }
//}
//Planet earth = new Planet();
//Planet venus = new Planet();
//Planet mars = new Planet();
//
//
//// Make use of it
//earth.revolve();
//// Expected response should be revolve
//
