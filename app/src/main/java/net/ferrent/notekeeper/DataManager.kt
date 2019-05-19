package net.ferrent.notekeeper

object DataManager {

    val courses = HashMap<String, CourseInfo>()
    val notes = ArrayList<NoteInfo>()

    init {
        initializeCourses()
        initializeNotes()
    }

    private fun initializeCourses() {
        var course = CourseInfo("android_intents", "Android Programming with Intents")
        courses.set(course.courseID, course)

        course = CourseInfo(courseID = "android)async", title = "Android Async Programming and Services")
        courses.set(course.courseID, course)

        course = CourseInfo(title = "Java Fundamentals: The Java Language", courseID = "java_lang")
        courses.set(course.courseID, course)

        course = CourseInfo("java_core", "Java Fundamentals: The Core Platform")
        courses.set(course.courseID, course)

    }

    private fun initializeNotes() {

        var course = CourseInfo("android_intents", "Android Programming with Intents")
        var note = NoteInfo(course, "Note 1", "This is the test for Note 1")
        notes.add(0, note)

        course = CourseInfo("android_intents", "Android Programming with Intents")
        note = NoteInfo(course, "Note 2", "This is the test for Note 2")
        notes.add(1, note)

        course = CourseInfo("java_lang", "Java Fundamentals: The Java Language")
        note = NoteInfo(course, "Note 3", "This is the test for Note 3")
        notes.add(2, note)

    }

}