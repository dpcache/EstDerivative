#Machine Assignment 2B

A program to compute an approximate value for the derivative of f(x) using the finite difference formula up to 2^-30.


##Installation For Window------------------------

Make sure Java is installed on your machine.

Extract the zip file, and navigate to extracted MA02EstDerivative folder. 

To creat the application use these commands in the CMD.exe (Command Prompt).
	.\gradlew build 
or 
	.\gradlew clean build 


Once the build is complete run the following command to start.

	java -jar .\build\libs\MA02EstDerivative.jar

Example: java -jar .\build\libs\MA02EstDerivative.jar
Example Output:
	h               x               Approx. f'(x):                  Known f'(x):                            Abs. Error:
	
	2^-1            1               0.3120480035923159              0.5403023058681398                      0.228254302276
	
	2^-2            1               0.4300545381907588              0.5403023058681398                      0.110247767677
	
	2^-3            1               0.4863728743295894              0.5403023058681398                      0.053929431539
	
	2^-4            1               0.5136632057467931              0.5403023058681398                      0.026639100121
	
	....



##Installation For Unix------------------------

Make sure Java is installed on your machine.

Extract the zip file, and navigate to extracted MA02EstDerivative folder. 

To creat the application use these commands in BASH (Command Prompt).
	./gradlew build 
or 
	./gradlew clean build 


Once the build is complete run the following command to start the converstion of Base10 to any base.

	java -jar ./build/libs/MA02EstDerivative.jar


Example: java -jar ./build/libs/MA02EstDerivative.jar
Example Output:

	h               x               Approx. f'(x):                  Known f'(x):                            Abs. Error:
	
	2^-1            1               0.3120480035923159              0.5403023058681398                      0.228254302276
	
	2^-2            1               0.4300545381907588              0.5403023058681398                      0.110247767677
	
	2^-3            1               0.4863728743295894              0.5403023058681398                      0.053929431539
	
	2^-4            1               0.5136632057467931              0.5403023058681398                      0.026639100121
	
	....

