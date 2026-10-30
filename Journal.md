# Journal
Pase 1
I had to create a case statement for each method to switch between each state. I had to check and switch between 
3 case statements in each of the 3 methods. If I had to add a new state, I would have to add a case for "SLEEPING"
to every method.

Phase 2
The Context class sets the state of the object and passes the methods to the State classes. The State classes implement
the methods in their own unique way, and use the SentinelGuard's set state method to switch between states. This pattern 
is a cleaner way to manage behavior, because it uses the Open/Closed principle where you don't have to modify every switch or 
if/else statement when you want to add a new state.

Phase 3
In this phase I extended the program by adding the Sleeping class, but did not have to modify any of the other existing
classes.

Phase 4
Using the State pattern is more extensible for professional software, but the conditional logic seemed simpler at first
and easier to follow. The State pattern seems harder to follow since it has methods and variables being passed from the 
SentinelGuard class to the State classes, but it will be easier to manage in the long run as it grows with new states 
added.
