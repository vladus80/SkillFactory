public class Student {
    String name, fam, target;
    boolean stage;
    int age, groupNumber, countTasksDone, countModulesDone;
    static int sumTaskDone;
    static  int maxModulesStudents;



    public Student(String name, String fam, int age) {
        this(name, fam, age, "Java Developer", false, 0, 0,0);

    }


    public Student(String name, String fam, int age, String target, boolean stage,  int groupNumber, int countTasksDone, int countModulesDone) {
        this.name = name;
        this.fam = fam;
        this.target = target;
        this.stage = stage;
        this.age = age;
        this.groupNumber = groupNumber;
        this.countTasksDone = countTasksDone;
        this.countModulesDone = countModulesDone;
    }


    public static int getSumTaskDone() {
        return sumTaskDone;
    }

    public  void taskDone(boolean statusTask){

        if(statusTask == true){
            sumTaskDone +=1;
        }

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public boolean isStage() {
        return stage;
    }

    public void setStage(boolean stage) {
        this.stage = stage;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int getCountTasksDone() {
        return countTasksDone;
    }

    public void setCountTasksDone(int countTasksDone) {
        this.countTasksDone = countTasksDone;
    }

    public int getCountModulesDone() {
        return countModulesDone;
    }

    public void setCountModulesDone(int countModulesDone) {
        this.countModulesDone = countModulesDone;
    }
}
