package com.motaharinia.designpattern.creational.objectpool;

public class ExportingProcess {
    private Long processNo;

    public ExportingProcess(Long processNo) {
        this.processNo = processNo;
        // do some  expensive calls / tasks here in future
        // .........
        System.out.println("Object with process no. " + processNo + " was created");
    }

    public Long getProcessNo() {
        return processNo;
    }
}
