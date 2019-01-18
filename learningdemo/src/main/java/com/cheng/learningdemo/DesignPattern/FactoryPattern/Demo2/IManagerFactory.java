package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class IManagerFactory {
    public static IManager createIManager(String dutyType) {
        if(dutyType == null) {
            return null;
        }
        if("操作工".equals(dutyType)) {
            return new Operator();
        }else if("组长".equals(dutyType)) {
            return new GroupManager();
        }else if("主管".equals(dutyType)) {
            return new ChargerManager();
        }else if("经理".equals(dutyType)) {
            return new MainManager();
        }else if("总监".equals(dutyType)) {
            return new DirectorManager();
        }
        return null;
    }
}
