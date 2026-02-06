# project_tracker
This will be a java program to track my AE due dates, exam dates and anything else important (like a calender)

# Project Plan
1) Get exams and assessments able to be inputted into a class system and test them
2) Create a GUI to view everything in order of what is closest
3) Store the data somehow (DB?) to enable the program to remember and be able to be opened without needing to re-input all data - use the fileoutputstream??

# Notes
- Between commit 4 and 5 I considered adding a new package, courses, and adding .java class files for each course however this seemed redundant as there is no needed information other than the name - may come back to this as a way to sort by course 
- Between commit 4 and 5 I decided to work on the basic system first before moving on to the GUI using swing (or other, when time comes will pick)


# Commit history

f0fa17e - First commit, created java project from scratch without vscode to test it runs and everything pushes correctly.

dac5379 - Second commit, added packages and create a class for exams to be added to.

9365d15 - Third commit, created basic wireframes for the main site and what it will look like.

3fd1d36 - Fourth commit, converted the assessment basics to an interface and added the assessed exercise class.

e7ae10b - Fifth commit, switched from interface to abstract parent and sub classes - a much better approach that I didn't consider for some reason when doing the last commit. Plan to test scanner to enable assessment input without gui and will start relearning and using gui stuff once this is implemented.

04bbc7f - Sixth commit, added the scanner to test input (this may be removed when gui is implemented but is here to test for now).

[commit num] - Seventh commit, I started the swing (using geekforgeeks and stack overflow questions), learning the frame and getting the first text box down. I also tided up some files and improved the read me. 


# Support credit/links

(I used the offical documentations for everything where possible, these links are for extra helps)

Scanner - https://www.w3schools.com/java/java_user_input.asp , uni slides
Swing - https://www.geeksforgeeks.org/java/introduction-to-java-swing/ , stack overflow, uni slides
ObjectOutputStream - https://www.programiz.com/java-programming/objectoutputstream