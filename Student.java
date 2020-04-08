class Student {
    String index;
    String firstName;
    String lastName;
    int grades[];

    Student(String index, String firstName, String lastName, int[] grades) {
        this.index = index;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grades = grades;
    }

    // GETTERS
    String getIndex() {
        return this.index;
    }

    String getFirstName() {
        return this.firstName;
    }

    String getLastName() {
        return this.lastName;
    }

    int[] getGrades() {
        return this.grades;
    }

    // SETTERS
    void setIndex(String index) {
        this.index = index;
    }

    void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    void setLastName(String lastName) {
        this.lastName = lastName;
    }

    void setGrades(int[] grades) {
        this.grades = grades;
    }

    // METHODS
    public double getAverage() {
        int sum = 0;

        for(int i = 0; i < grades.length; i++)
            sum += grades[i];

        return sum / grades.length;
    }

    public int ECTSCredits() {
        int sum = 0;

        for(int i = 0; i < grades.length; i++)
            if(grades[i] > 5)
                sum += 6;

        return sum;
    }
}
