This program is compiled using javac on HW3_Main, then ran with java 
by passing in the input as a single command line argument
Assertions must be enabled for the error checking to work properly
Args must be in form [%(0-9),%(0-9),etc]
Invalid args will return the statement "Arguments do not match correct input pattern"

ex) javac HW3_Main.java
    java -ea HW3_Main [1,2,3]
	--outputs: [1,2,4]--

values that have been tested:

input       output
------------------
[1,2,3]     [1,2,4]
[0,0,0]		[0,0,1]
[0]			[1]
[9]			[1,0]
[9,9,9]		[1,0,0,0]