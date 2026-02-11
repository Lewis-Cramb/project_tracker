# project_tracker
This will be a java program to track my AE due dates, exam dates and anything else important (like a calender)

# Project Plan
1) Get exams and assessments able to be inputted into a class system and test them (Finished on 6th commit)
2) Create a GUI to view everything in order of what is closest (Finished on 12th commit)
3) Store the data somehow (DB?) to enable the program to remember and be able to be opened without needing to re-input all data - use the fileoutputstream?? - May use CSV files, need to check over

# Notes
- Between commit 4 and 5 I considered adding a new package, courses, and adding .java class files for each course however this seemed redundant as there is no needed information other than the name - may come back to this as a way to sort by course 
- Between commit 4 and 5 I decided to work on the basic system first before moving on to the GUI using swing (or other, when time comes will pick)
- Commit number 10 was the first use of AI to code something, I was lost with JFrame and it solved it for me, will be looking at the docs more closely and learning JFrame better.


# Commit history

f0fa17e - First commit, created java project from scratch without vscode to test it runs and everything pushes correctly.

dac5379 - Second commit, added packages and create a class for exams to be added to.

9365d15 - Third commit, created basic wireframes for the main site and what it will look like.

3fd1d36 - Fourth commit, converted the assessment basics to an interface and added the assessed exercise class.

e7ae10b - Fifth commit, switched from interface to abstract parent and sub classes - a much better approach that I didn't consider for some reason when doing the last commit. Plan to test scanner to enable assessment input without gui and will start relearning and using gui stuff once this is implemented.

04bbc7f - Sixth commit, added the scanner to test input (this may be removed when gui is implemented but is here to test for now).

3f04c80 - Seventh commit, I started the swing (using geekforgeeks and stack overflow questions), learning the frame and getting the first text box down. I also tided up some files and improved the read me. 

2c7d062 - Eighth commit, learning more about swing through trial and error (labels go on panels, panels go on frames). Added an action listener that, when the button is pressed, connects to a different java file which I will later use to make popups to add details to classes.

2c7d062 - Nineth commit, added the examAdd page which successfully has popups and creates an exam class at the end of it, need to find a way to store it. Also changed variables in assesment to protected, should be like that anyway.

c84349e - Tenth commit, added the aeAdd class which activates the same way as the exam. Admittedly used github copilot to fix the JFrame stuff as I was a bit lost, going back over documentation now though.

a66e803 - Eleventh commit, started to create the implementations of the box wireframe, adding exams to the program when inputted. Also edited the wireframe slightly to fit exams and aes.

[commit num] - Twelfth commit, copied examBox stuff over into aeBox so AEs can now be added to the program too - gui is also just lightly touched up as it is finished.


# Support credit/links

(I used the offical documentations for everything where possible, these links are for extra helps)

Scanner - https://www.w3schools.com/java/java_user_input.asp , uni slides
Swing - https://www.geeksforgeeks.org/java/introduction-to-java-swing/ , stack overflow, uni slides
ObjectOutputStream - https://www.programiz.com/java-programming/objectoutputstream