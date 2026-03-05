// Problem 3:
// Student -> Test -> Result
// Interface Sports
// Display total result.

class Student {
    int rollNo;

    void setRollNo(int r) {
        rollNo = r;
    }

    int getRollNo() {
        return rollNo;
    }
}

class Test extends Student {
    int sub1, sub2;

    void setMarks(int m1, int m2) {
        sub1 = m1;
        sub2 = m2;
    }

    int getTotalMarks() {
        return sub1 + sub2;
    }
}

interface Sports {
    int sMarks = 20;
    void setSportsMarks(int m);
}

class Result extends Test implements Sports {
    int sports;

    public void setSportsMarks(int m) {
        sports = m;
    }

    void display() {
        int total = getTotalMarks() + sports;
        System.out.println("Roll No: " + getRollNo());
        System.out.println("Total Marks: " + total);
    }
}

public class ResultTest {
    public static void main(String[] args) {
        Result r = new Result();

        r.setRollNo(101);
        r.setMarks(80, 85);
        r.setSportsMarks(15);

        r.display();
    }
}