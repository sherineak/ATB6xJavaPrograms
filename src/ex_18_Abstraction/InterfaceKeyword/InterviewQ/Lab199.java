package ex_18_Abstraction.InterfaceKeyword.InterviewQ;

public class Lab199  {
}
interface I1{}
interface I2{}
class A{}
class B{}
abstract class C{}
class Test1 extends A{}    // Single inheritance
class Test2 extends B{}    // Single inheritance

//class Test3 implements A,B{}  Multiple Inheritance with (class not allowed)
class Test4 implements I1,I2{}  // Multiple Inheritance with interface
class Test5 extends A implements I1,I2{}

// Class Test6 implements I1 extnds A{}  not Ok
//interface I3 extends A{}
//interface extends A{}

interface I5 extends I2,I1{}
