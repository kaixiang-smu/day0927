package com.qf.homework7;

public class TestTeacher {

    public static void main(String[] args) {
        // 创建老师
        Teacher teacher = new Teacher(40,"老王");
//        System.out.println(teacher.getName());
//        System.out.println(teacher.getAge());
//        System.out.println(teacher.getStuArr());
        // 创建学生
        Student s1 = new Student(18, "小王");
        Student s2 = new Student(19, "小李");
        Student s3 = new Student(20, "小赵");

//        Student[] stuArr = teacher.getStuArr();
        // 此时stuArr会报错空指针异常 stuArr是数组，
        // 但是stuArr属性没有被赋值，是null，数组为空报错
        // 这里会报空指针异常，即空对象错误
        // 是因为stuArr数组本身为空，因为老师对象中根本就没有数组
//        stuArr[0].getAge();

        // 创建学生数组赋值给老师的数组属性，再存学生，学生数组存学生
        Student[] stuArr = new Student[3];
        stuArr[0] = s1;
        stuArr[1] = s2;
        stuArr[2] = s3;
//        System.out.println(stuArr);
//        System.out.println(stuArr[0]);
//        System.out.println(stuArr[1]);
//        System.out.println(stuArr[2]);
        // 将数组交给老师
        teacher.setStuArr(stuArr);

        // 获得数组，从老师中取出学生，查看效果
        Student[] stuArr1 = teacher.getStuArr();
        for (int i = 0; i < stuArr1.length; i++) {
            String name = stuArr1[i].getName();
            int age = stuArr1[i].getAge();
            System.out.println("学生姓名："+name+"，学生年龄："+age+"。");
        }

        // 这里还是会报空指针异常，原因和上面不一样，这时已经有数组了
        // 但是数组里面的任何一个元素都是null，是stuArr1[0]为空
        // 这里也会报空指针异常，即空对象错误
        // 这里数组确实存在了，但是数组中存储的都是null
        // 即取出来stuArr1[0]这个是null
        // null.getAge();所以就报空指针

    }
}
