# PhrasalVerbsQuizApp

Educational app: English learning: a quiz on phrasal verbs.

Phrasal verbs (e.g., "drop by", "get over with", "end up", "count on", etc.) have always been a problem for English as a Foreign Language students, including me in the past, and my students in the present! So I devised an app exclusively for phrasal verb practice.

Background: the app was created as PROJECT 3 for the Google Developer Challenge Scholarship (phase 1) in Jan, 2018, and carried over as project 3 for the present phase of the scholarship as permitted by Udacity (i.e. First General AMA session: "As long as your work is original work, you may carry over work from the first Phase into this Phase."). Therefore: submitted for Android Basics Nanodegree by Google at Udacity (Mar. 4. 2018, Project 3). 
Modification since phase 1: added java code so that no more than 2 answers can be checked for CheckBox-based questions.

INTERESTING FEATURES:
- Multiscreen app: moves into another from the main activity page depending on user choice.
- Has 3 difficulty levels (easy, medium, hard), and so a separate quiz was constructed for each: user chooses level, and is brought to that quiz (activity).
- Depending on the score, a toast message recommends a higher difficulty level to user if they scored high on easy or medium.
- Different data entries (answer options) for each level: the easy mode only has radio button based questions (10 simple choice questions); the medium mode has 5 radio button (simple choice) questions and 5 check box based questions (multiple choice questions, with 2 correct answers per question); the hard mode has 4 each, and 2 EditText based (type-in your answer) questions as well. 
- Context sentence: the easy mode has an example sentence for each phrasal verb asked, to help the user. The medium and the hard modes only have this feature for the simple choice type of questions, and the hard mode has it for the EditText-based 2 questions as well.
- Customized toasts: each mode has 4 different kind of toast messages depending on the user's final score, and the message gets displayed upon the submission of the quiz.
- Final score: results: in addition to the complimentary/scolding toast message, the results appear in a text view as well, telling the user their exact score.
- Half points: in the medium and hard mode, it is possible to get half a score for an answer, if the user only gets one out of the two check box based answers right. 
- Name field: user gets to enter their name on the main activity page, which gets stored, saved and brought into the new activity (by the use of intents), and so user gets to called by their name in the displayed results message. 
- The ongoing and/or total score, the entered name, and all the selected and typed-in answers get saved with onSaveInstance in case of device rotation or the user temporarily cheating on us by temporarily using another app.
- Since it's 10 questions per level, the app consists of altogether 30 questions! 
- ScrollView: app looks okay in both rotation modes and on smaller screens too (both the main activity and the three difficulty mode-based activities).


