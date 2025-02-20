# Simple-Password-Strength-Checker
This program simply asks the user for their password and checks to see if it is weak, moderate, or strong.

**Steps to Run**

Make sure you have:

- Java Development Kit (JDK) 8 or later
- A terminal or command prompt to run the program


**To Run The Script**

Download or clone the repository:

**$ git clone repository-url**

**$ cd repository-folder**

Or download the file and navigate to the folder containing **StrengthTester.java**


Then, compile using:

**$ javac CS3090/StrengthTester.java**

Then, run the script using:

**$ java CS3090.StrengthTester**


The program will prompt you to enter a password. Type your password and press **Enter**.

The program will evaluate and display the password strength as **Weak**, **Moderate**, or **Strong** based on the composition of letters, numbers, and special characters.


**Strength Criteria**

- Strong: At least 8 characters, including letters, numbers, and special characters.

- Moderate: At least 6 characters, including either letters and numbers or letters and special characters.

- Weak: Any password that does not meet the above conditions.


**Limitations**

While this script gives a proper insight to how strong your password is, it isn't by any means complex by telling you how it easy it would be to
crack. With that being said, some examples of strong passwords are stronger than others. Because of this, it is your jurisdiction deciding what
password you are comfortable with. 

**Possible Ethical Violations**

Since this password strength checker is under the MIT license, it is open for anyone to download, change, and republish for their own work. Beware of 
individuals that can connect this strength checker to an external database to collect people's passwords and other connection information. In order to
prevent malicious doing against your privacy, make sure you confirm that the script you are using is the script from this repository; or if it is 
somebody else's script, make sure you read the source code in case it hides any malicious intent. As seen from the singular file of source code in this repository, you are able to see that there are no external factors that violate the user's privacy.

