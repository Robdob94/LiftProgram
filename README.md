<h1>LiftProgram</h1> 
<h2>Overview</h2>
University assignment with Java to create a Lift System using OOP techniques and analysis of a requirement spec to create classes/methods to program and feedback function in the console. User input is also included to call lift and input a destination floor
<h2>Specification</h2>
The aim is to write a Lift program for a building which has one lift and 4 possible floors. Assuming the user is not in the lift at the start, the lift can be called and it will go to the correct floor where the doors will open for the user to enter. When the user presses a floor button inside the lift, the doors will close and the user will be taken to the correct floor, the doors will open again. The lift operations will be shown in the terminal for each operation it is performing such as doors opening & closing, moving up or down, and so on.
<h2>Solution</h2>
The solution is written in Java and is contained in one file, 3 classes are identified from the spec. The classes are Lift, LiftControlSystem and LiftOperation. LiftOperation is the main class to run the program.
<h3>Lift class</h3>
Variables:<br>
- int - currentFloor<br>
- boolean - doorsOpen<br><br>
Methods:<br>
- getCurrentFloor<br>
- areDoorsOpen<br>
- openDoors<br>
- closeDoors<br>
- moveUp<br>
- moveDown
<h3>LiftControlSystem</h3>
Methods:<br>
- goToFloor<br>
- showStatus<br>
- callLift
<h3>LiftOperation</h3>
Main Operations:<br>
- Create Scanner object from imported Scanner class for user inputs<br>
- Read floor input from user to go to their floor<br>
- if statement to go to correctly input floor number or print an invalid input response<br>
- while loop to keep lift running<br>
- exit loop by entering "0"<br>
- Print any further invalid floor entries when user is "in the lift"
