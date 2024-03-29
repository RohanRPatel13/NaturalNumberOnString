# NaturalNumberOnString

## Objectives
1. Familiarity with writing a kernel class for a new type and its kernel operations (NaturalNumber layered on String).
2. Familiarity with developing and using specification-based test plans.

## The Problem
The problem is to complete and carefully test implementations of all the constructors and kernel methods defined in interface NaturalNumberKernel, building the data structure representing a NaturalNumber object by layering it on top of java.lang.String.

Note that implementing and testing a kernel component is significantly different and more challenging than implementing and testing layered implementations (as you have been doing up to this point in this course sequence). For kernel implementations, if just one of the methods in the kernel is wrong then other methods might appear not to work correctly during testing. This makes debugging a challenge. One possible reason is that if your test cases use either equals or toString to check the results, these methods can essentially call any of your kernel methods. Another reason is that if your code for any method fails to make the representation invariant true at the time it returns, then the next method called in the test case might break; but the problem is actually with the previous method. Make sure you understand these difficulties so you can deal with them.

Another danger is that you might unconsciously (or even consciously) choose to use a different representation invariant and/or abstraction function than already stated in the Java class. In this case, you may achieve a result for which no test case can reveal a defect. However, if you don't follow the representation invariant and/or the abstraction function provided, you are liable to a significant deduction of points from your project. This warning applies to this project and all subsequent projects in this course. Recommendation: make sure that each public method makes whatever good use it can of assuming that the representation invariant is true when the method begins. Make sure that each public method and each constructor always makes the representation invariant true. Make sure that each public method meets its contract according to the abstraction function.
