# PhrasalVerbsQuizApp

Background: Udacity Google Development Challenge Scholarship – Android Basics 2017 – Project 3 - Educational app: English learning: a quiz on phrasal verbs.
Phrasal verbs (e.g., "drop by", "get over with", "end up", "count on", etc.) have always been a problem for students, including me in the past, and my students in the present! So I devised an app exclusively for phrasal verb practice.

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
- Since it's 10 questions per level, the app is constructed of altogether a whooping number of 30 questions! 
- ScrollView: app looks okay in both rotation modes and on smaller screens too (both the main activity and the three difficulty mode-based activities).


