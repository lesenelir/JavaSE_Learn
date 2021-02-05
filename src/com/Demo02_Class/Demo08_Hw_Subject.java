package com.Demo02_Class;

public class Demo08_Hw_Subject {
    public static void main(String[] args) {
        Subject subject = new Subject("计算机专业", "S100", 4);
        System.out.println(subject.printInfo());

        System.out.println("===============");

        Student_Subject obj = new Student_Subject("S01", "张三", "男", 18, subject);
        System.out.println(obj.infoStudent());

    }
}


class Subject {
    private String subjectName;
    private String subjectId;
    private int subjectLift;
    // 学生对象数组，统计有多少学生的对象【关联】
    private Student_Subject[] myStudents;
    private int studentNum;

    public Subject() {
    }

    public Subject(String subjectName, String subjectId, int subjectLift) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.subjectLift = subjectLift;
    }

    public Subject(String subjectName, String subjectId, int subjectLift, Student_Subject[] myStudents) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.subjectLift = subjectLift;
        this.myStudents = myStudents;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public int getSubjectLift() {
        return subjectLift;
    }

    // 对于需要给类的成员变量限制条件的时候，一般来说在setter方法中限制
    public void setSubjectLift(int subjectLift) {
        // 学科年限一定是大于0的数字
        if (subjectLift < 0)
            return;
        else
            this.subjectLift = subjectLift;
    }

    public Student_Subject[] getMyStudents() {
        if (this.myStudents == null)
            this.myStudents = new Student_Subject[200];
        return myStudents;
    }

    public void setMyStudents(Student_Subject[] myStudents) {
        this.myStudents = myStudents;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public void setStudentNum(int studentNum) {
        this.studentNum = studentNum;
    }

    // 显示信息
    public String printInfo() {
        String str = "专业信息如下：\n专业名称：" + this.getSubjectName() + "\n专业编号：" + this.getSubjectId() + "\n专业年限：" + this.getSubjectLift();
        return str;
    }

    // 统计学生个数
    public void addStudent(Student_Subject stu) {
        // 将学生保存到数组中
        // 将学生个数保存到studentNum中
        for (int i = 0; i < this.getMyStudents().length; i++) {
            if (this.getMyStudents()[i] == null) {
                this.getMyStudents()[i] = stu;
                this.studentNum = i + 1;  // 统计个数
                break;
            }
        }
    }
}


class Student_Subject {
    private String studentNo;
    private String studentName;
    private String studentSex;
    private int studentAge;
    // 学生类中新增一个成员的专业属性
    private Subject studentSubject;

    public Student_Subject() {
    }

    // 全参构造方法
    public Student_Subject(String studentNo, String studentName, String studentSex, int studentAge, Subject studentSubject) {
        this.studentNo = studentNo;
        this.studentName = studentName;
        this.studentSex = studentSex;
        this.studentAge = studentAge;
        this.studentSubject = studentSubject;
    }

    public String getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(String studentNo) {
        this.studentNo = studentNo;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentSex() {
        return studentSex;
    }

    // 修改性别属性，只能是男或者女，如果是其他，则强制默认为男
    public void setStudentSex(String studentSex) {
        if (studentSex.equals("男") || studentSex.equals("女")) {
            this.studentSex = studentSex;
        } else {
            this.studentSex = "男";
        }
    }

    public int getStudentAge() {
        return studentAge;
    }

    // 修改setterAge函数
    public void setStudentAge(int studentAge) {
        if (studentAge < 10 || studentAge > 100) {
            this.studentAge = 18;
        } else {
            this.studentAge = studentAge;
        }
    }

    public Subject getStudentSubject() {
        return studentSubject;
    }

    public void setStudentSubject(Subject studentSubject) {
        this.studentSubject = studentSubject;
    }

    // 显示信息 【此处关联了Subject类】
    public String infoStudent() {
        String str = "学生信息如下:\n姓名：" + this.getStudentName() + "\n学号:" + this.getStudentNo() + "\n性别:"
                + this.getStudentSex() + "\n年龄:" + this.getStudentAge() + ""
                + "\n学科的编号：" + this.studentSubject.getSubjectId() + "\n学科的名称：" + this.studentSubject.getSubjectName()
                + "\n学科的年限：" + this.studentSubject.getSubjectLift();
        return str;
    }
}
