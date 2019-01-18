package com.cheng.learningdemo.DesignPattern.FactoryPattern.Demo2;

public class EmployeeManager implements IManager {
    // 上级领导
    private IManager leader;
    // 是否连带
    private boolean hasRelates;
    // 是否首犯
    private boolean isFirstMistake;
    // 犯错次数
    private Integer faultCount;
    // 下属员工数
    private Integer underlingCount;

    public IManager getLeader() {
        return leader;
    }

    public void setLeader(IManager leader) {
        this.leader = leader;
    }

    public boolean isHasRelates() {
        return hasRelates;
    }

    public void setHasRelates(boolean hasRelates) {
        this.hasRelates = hasRelates;
    }

    public boolean isFirstMistake() {
        return isFirstMistake;
    }

    public void setFirstMistake(boolean firstMistake) {
        isFirstMistake = firstMistake;
    }

    public Integer getFaultCount() {
        return faultCount;
    }

    public void setFaultCount(Integer faultCount) {
        this.faultCount = faultCount;
    }

    public Integer getUnderlingCount() {
        return underlingCount;
    }

    public void setUnderlingCount(Integer underlingCount) {
        this.underlingCount = underlingCount;
    }

    @Override
    public Integer getPulishRating() {
        return null;
    }
}
