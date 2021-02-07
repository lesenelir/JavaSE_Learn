package com.Demo03_Extends.Object_Hw03_Annotation;

public class Taxi extends Car {
    private String company;

    // 构造方法
    public Taxi() {
    }

    public Taxi(String color, String userName, String company) {
        super(color, userName);
        this.company = company;
    }

    // getter/setter
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    // 不允许重写的方法
    public final void ride() {
        System.out.println(this.getUserName() + "出租车是所属于在" + this.getCompany() + "公司的");
    }

    // 结合注解编辑重写方法
    @Override
    public void use() {
//        super.use();
        System.out.println("出租车是提高市民生活质量的重要条件之一");
    }

    @Override
    public String toString() {
        return "Taxi的信息是" +
//                "company='" + company + '\'' +
                    this.getUserName() + "拥有一辆" + this.getColor() + "的出租车";
    }


}
